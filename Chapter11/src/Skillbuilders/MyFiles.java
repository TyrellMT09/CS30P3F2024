package Skillbuilders;

import java.io.*;
import java.util.Scanner;
import java.io.IOException;

public class MyFiles

{

	public static void main(String[] args) 
	{
		File  user_File;
		String File_check;
		
		Scanner User = new Scanner(System.in);
		
		user_File = new File("C:\\Users\\16282511\\Downloads\\zzz.txt");
		
		if(user_File.exists()) 
		{
			System.out.println("File already exists.");
		}
		else 
		{
			try
			{
				user_File.createNewFile();
				System.out.println("zzz.txt has been created");
			}
			catch (IOException e) 
			{
				System.out.println("File could not be created.");
    			System.err.println("IOException: " + e.getMessage());
    		}
		}
		
		System.out.println("Would you like to "
				+ "(K)eep or (D)elete the file? ");
		
		File_check = User.next();
		
		if(File_check.equalsIgnoreCase("D"))
		{
			if(user_File.delete());
			{
				System.out.println("File Deleted! ");
			}
		}
		else
		{
			System.out.println("File is kept and stays the same");
		}
		User.close();
	}
}