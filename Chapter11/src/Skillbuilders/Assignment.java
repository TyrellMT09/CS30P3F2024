package Skillbuilders;

import java.io.*;

public class Assignment {

	public static void main(String[] args) {
		
		File textFile = new File("C:\\\\Users\\\\16282511\\\\Downloads\\\\HALLOWEEN.txt");
		FileReader in;
		BufferedReader readFile;
		String lineOfText;
		
		try {
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			while ((lineOfText = readFile.readLine()) != null ) 
			{
				System.out.println(lineOfText);
			}
			readFile.close();
			in.close();
			
			} catch (FileNotFoundException e) {
				System.out.println("File does not exist or could be found. ");
				System.err.println("FileNotFoundException: "
						+ e.getMessage());
			} catch (IOException e) {
				System.out.println("Problm readomg file.");
				System.err.println("IOException: " + e.getMessage());
			}
	}
}
