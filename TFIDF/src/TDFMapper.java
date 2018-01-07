import java.io.IOException;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;

public class TDFMapper extends Mapper<Text, Text, Text, WordAndStatWritable>{

	private WordAndStatWritable wsw = new WordAndStatWritable();

	public void map(Text key, Text value, Context context) throws IOException, InterruptedException{
		String[] keySplit = key.toString().split(" ");
		String[] valueSplit = value.toString().split(" ");
		wsw.setDocumentByString(keySplit[1]);
		wsw.setOccurencePerDocumentByString(valueSplit[0]);
		wsw.setTotalOccurenciesByString(valueSplit[1]);
		context.write(new Text(keySplit[0]), wsw);
	}
	
}

