import org.apache.hadoop.mapreduce.Job;  
import org.apache.hadoop.io.*;        
import org.apache.hadoop.mapreduce.Mapper;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * @author Salah Eddine
 *
 */

public class FirstMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	
	private final static IntWritable max
	private Text type = new Text();
	// Overriding of the map method
	@Override
	protected void map(LongWritable keyE, Text valE, Context context) throws IOException,InterruptedException {
		String line = valE.toString();
		String [] lineAfterSplit = line.split(";");
		Tree T = new Tree();
		
		for(IndexMapping index: IndexMapping.values()) {
        	T.set(index, lineAfterSplit[index.getValue()]);
        }
		
		StringTokenizer tokenizer = new StringTokenizer(line);
		type.set(T.getESPECE());
		max = new IntWritable(Integer.parseInt(T.getHAUTEUR()));
		context.write(type, max);
    }
	
	public void run(Context context) throws IOException, InterruptedException {
	    setup(context);
	    while (context.nextKeyValue()) {
	        map(context.getCurrentKey(), context.getCurrentValue(), context);
	    }
	    cleanup(context);
	}
	
}
