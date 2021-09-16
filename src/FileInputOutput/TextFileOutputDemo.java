package FileInputOutput;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;

public class TextFileOutputDemo {

	public static void main(String[] args)
	{
		String fileName="D://out.txt";
		PrintWriter outputStream=null;
		try
		{
			outputStream=new PrintWriter(fileName);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file" +fileName);
			System.exit(0);
		}
		System.out.println("Enter three lines of text:");
		
		for(int count=1;count<=3;count++)
		{
			Scanner keyboard=new Scanner(System.in);
			String line = keyboard.nextLine();
			outputStream.println(count +" " +line);
		}
			outputStream.close();
			System.out.println("Those lines were written to "+fileName);
			
		
	
		

	}

}
