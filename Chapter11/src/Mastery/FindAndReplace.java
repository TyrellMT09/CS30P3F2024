package Mastery;

import java.io.*;
import java.util.Scanner;


public class FindAndReplace 
{

	public static void main(String[] args) 
	{
		
		File OFILE;
		FileReader in;
	    BufferedReader readFile;
	    Scanner User = new Scanner(System.in);
	    
	    System.out.println("Enter a file:");
	    
	    String TextToVARI, random;
	    
		TextToVARI = User.next();
		User.close();
		
		String Newline = ("C:\\Users\\16282511\\Downloads\\" + TextToVARI);
		
		OFILE = new File(Newline);
	    
		if(OFILE.exists()) 
		{
			System.out.println("File already exists.");
		}
		else 
		{
			try 
			{
				OFILE.createNewFile();
				System.out.println("New file Created");
				
			}
			catch (IOException e) 
			{
				System.out.println("File could not be created");
				System.err.println("IOException: " + e.getMessage());
			}
		}
		try 
		{

			
			in = new FileReader(OFILE);
			readFile = new BufferedReader(in);
			
			while((random = readFile.readLine()) != null)
			{
				System.out.println(random);
			}
		}
		catch (FileNotFoundException e) 
        {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());

        } 
		catch (IOException e) 
        {
			System.out.println("Problem reading file.");
			System.err.println("IOException: " + e.getMessage());
        }
			
		}
		
	
	}
	

