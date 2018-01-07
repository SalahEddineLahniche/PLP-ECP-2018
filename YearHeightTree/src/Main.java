import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

/**
 * @author Salah Eddine
 *
 */
public class Main {

	private static String currentLine;
    private static BufferedReader br;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        try {
        	Path pt = new Path("hdfs:/arbres.csv");
            FileSystem fs = FileSystem.get(new Configuration());
            BufferedReader br = new BufferedReader(new InputStreamReader(fs.open(pt)));
			br.readLine(); //header line
	        while ((currentLine = br.readLine()) != null) { 
	            String [] lineAfterSplit = currentLine.split(";");
	            for(IndexMapping index: IndexMapping.values()) {
	            	Tree.set(index, lineAfterSplit[index.getValue()]);
	            }
	            System.out.println("ANNEE PLANTATION: " +
            			Tree.get(IndexMapping.ANNEE_PLANTATION) + ", HAUTEUR: " +
            			Tree.get(IndexMapping.HAUTEUR));
	        }
		} catch (FileNotFoundException e) {
			System.out.print("Check whether Res/arbres.csv file exists in current path !");
		} catch (IOException e) {
			System.out.print("Error occured while reading the file Res/arbres.csv !");
		}
	}

}
