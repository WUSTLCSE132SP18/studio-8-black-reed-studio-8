package studio8;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


// TODO: Develop an algorithm to count steps in accelerometer data
//    Major steeps:
//       1. Create a class and main method.
//       2. Using a Scanner and File object, read data from your .csv file.
//       3. Develop and test algorithms to count the "peaks" in the data.
public class CountSteps {
	
	public static void main(String[] args) throws IOException {
		Path filepath= Paths.get("data/Stepsdata.csv");
		Scanner scannedFile = new Scanner(filepath);
		String [] x = new String[1000];
		String [] y = new String[1000];
		String [] z = new String[1000];

		int i=0;
		while (scannedFile.hasNext() && i<1000) {
			String currentLine= scannedFile.nextLine();
			String [] parts = currentLine.split(",");
			x[i]=parts[0];
			y[i]=parts[1];
			z[i]=parts[2];
			System.out.println(currentLine);
			i++;
		}
		scannedFile.close();
	}
		
}