import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

/**
 * @author Alaa Eddine
 *
 */

public class Readtxt{
    public static void main (String [] args) throws Exception{
        try{
            Path pt = new Path("hdfs:/isd-history.txt");
            FileSystem fs = FileSystem.get(new Configuration());
            BufferedReader br = new BufferedReader(new InputStreamReader(fs.open(pt)));
            String line;
            // Ignore the first 22 lines
            for(int i=0; i < 22; i++) {
                line=br.readLine();
            }
            line=br.readLine();
            while (line != null){
                System.out.println("Name:--" + line.substring(13,42) + "FIPS:--" + line.substring(43,45) + "Altitude:--" + line.substring(74,81));
                line=br.readLine();
            }
        }catch(Exception e){
            
        }
    }
}