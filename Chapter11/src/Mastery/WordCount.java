package Mastery;

import java.io.*;
import java.text.DecimalFormat;

class WordCount {
	
     public static void main(String[] args) {

       File Sour = new File("C:\\Users\\16282511\\Downloads\\source.txt");
       FileReader in;
       BufferedReader readFile;
       String File_Text;
       String New_Text;
       int totalWords = 0;
       int totalChars = 0;
       double avgLength = 0;

       DecimalFormat dc = new DecimalFormat("0.00");

       try 
       {
    	   
           in = new FileReader(Sour); // Assigning the file to a FileReader variable named in.
           
           readFile = new BufferedReader(in); // Assigning the FileReader file to a bufferedReader variable named ReadFile.

           while ((File_Text = readFile.readLine()) != null) 
           {
           
        	   New_Text = File_Text.replace("-", " ");
      
               String[] words = New_Text.split("\\s+");
          
               
               
               totalWords += words.length;
               
               for (String word : words) {
                   totalChars += word.length();
               }
           }

           if (totalWords > 0) {
               avgLength = (double) totalChars / totalWords;     
           }
       
           System.out.println("Total Words: " + totalWords);
           System.out.println("Average Word Length: " + dc.format(avgLength)); 
           
       }
       
       catch (FileNotFoundException e) 
       {
    	   
           System.out.println("File does not exist or could not be found.");
           System.err.println("FileNotFoundException: " + e.getMessage());
           
       }
       
       catch (IOException e) {
           System.out.println("Problem reading the file.");
           System.err.println("IOException: " + e.getMessage());
       } 
       
   }
     
}




