package Skillbuilders;

import java.io.*;
import java.util.Scanner;

public class MyFile 

{

	public static void main(String[] args) 
	{
		File  user_File;
		String File_check;
		
		Scanner User = new Scanner(System.in);
		System.out.println("Enter a file:");
		File_check = User.next();
		User.close();
		
		user_File = new File(File_check);
		
		if(user_File.exists()) 
		{
			System.out.println("File already exists.");
		}
		else 
		{
			try 
			{
				user_File.createNewFile();
				System.out.println("New file Created");
				
			}
			catch (IOException e) 
			{
				System.out.println("File could not be created");
				System.err.println("IOException: " + e.getMessage());
			}
		}
		
	
	}
}
