import json
from pyspark import SparkContext
from pyspark.streaming import StreamingContext

def print_s(el):
	print('[+] ', el[0])

sc = SparkContext("velib.behmo.com", "velib")
ssc = StreamingContext(sc, 5)
lines = ssc.socketTextStream("localhost", 9999)

lines = lines.map(lambda s: json.loads(s))
lines.persist()

stations = lines.map(lambda s: (s['name'], (s['available_bikes'], s['available_bikes'])))
stations = stations.reduceByKey(lambda x, y: (x[0] + y[0], x[1] * y[1]))
stations.persist()

empty = stations.filter(lambda s: s = (0, 0))
become_empty = stations.filter(lambda s: s[1] == 0 and s[0] > 0)

# We can assume that activity correspond to standard deviation of available bikes from their mean (in %)
activity_stations = lines.map(lambda s: (s['name'], (s['available_bikes'] ** 2, s['available_bikes'], 1)))
activity_stations = activity_stations.reduceByKeyAndWindow(lambda x, y: (x[0] + y[0], x[1] + y[1], x[2] + y[2]), 300, 60)
activity_stations = activity_stations.transform(lambda rdd: rdd.sortBy(lambda x: ((x[1][0] / x[1][2]) - ((x[1][1] / x[1][2]) ** 2)) ** 0.5 / x[1][1]))
print("Empty stations:")
empty.foreach(print_s)
print("Become empty stations:")
become_empty.foreach(print_s)
print("Active stations:")
activity_stations.foreachRDD(lambda rdd: print(rdd.take(10)))


ssc.start()
ssc.awaitTermination()

