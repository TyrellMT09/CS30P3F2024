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
	  
	    String TextToVARI, random, oldT, newT;
	    
	    System.out.println("Enter a file:");
		TextToVARI = User.next();
	
		
		String PathtoC = ("C:\\Users\\16282511\\Downloads\\" + TextToVARI);
		
		OFILE = new File(PathtoC);
	    
		System.out.println("Enter the (phase or word) you want to change");
		oldT = User.next();
		
		System.out.println("Enter the (phase or word) you want to change with");
		newT = User.next();
		
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
				random = random.replaceAll(oldT, newT);
			}
			System.out.println("The new file text: " + random);
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
	

