package Files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FileLanguageEncoding implements InterfaceLanguageEncoding
{

	private	static  OutputStream os;
	private	static	PrintWriter w;

	public FileLanguageEncoding() 
	{
		//write line to file.
		String line = "שלום, hello, привет";
	   
		try {
			os = new FileOutputStream("FileLanguageEncoding.csv");
		} 
		catch (FileNotFoundException e) 
		{
			//e.printStackTrace();
			System.out.println("catch file open >>" + e.getMessage());
		}
		
	    try 
	    {
			os.write(LanguageHebrew13);
		} 
	    catch (IOException e) 
	    {
			//e.printStackTrace();
			System.out.println("catch #1 write to file >>" + e.getMessage());
		}
	    
	    try 
	    {
			os.write(LanguageHebrew23);
		} 
	    catch (IOException e) 
	    {
//			e.printStackTrace();
			System.out.println("catch #2 write to file >>" + e.getMessage());
		}
	    
	    try 
	    {
			os.write(LanguageHebrew33);  
		} 
	    catch (IOException e) 
	    {
//			e.printStackTrace();
			System.out.println("catch #3 write to file >>" + e.getMessage());			
		}
	    

	    PrintWriter w = null;
		try {
			w = new PrintWriter(new OutputStreamWriter(os, "UTF-8"));
			
			
		} 
		catch (UnsupportedEncodingException e) 
		{
			e.printStackTrace();
		}

	    w.print(line);
	    w.flush();
	    w.close();
	}

	public static void main(String[] args) 
	{
		FileLanguageEncoding ft = new FileLanguageEncoding();

	}

}
