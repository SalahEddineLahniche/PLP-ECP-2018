import org.apache.hadoop.mapreduce.Job;  
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Reducer;
import java.io.IOException;
import java.util.Iterator;
import org.apache.hadoop.io.IntWritable;


public class FirstReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

    private IntWritable maxi = new IntWritable();

    @Override
    public void reduce(final Text key, final Iterable<IntWritable> values,
            final Context context) throws IOException, InterruptedException {

        int sum = 0;
        Iterator<IntWritable> iterator = values.iterator();
        
        IntWritable max = new IntWritable(0);
        IntWritable curr;
        while (iterator.hasNext()) {
        	curr = iterator.Next();
            max = max.compareTo() > 0 ? max : curr;
        }

        maxi.set(max);
        // context.write(key, new IntWritable(sum));
        context.write(key, maxi);
    }
}