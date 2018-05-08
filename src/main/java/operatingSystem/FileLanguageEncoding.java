package operatingSystem;

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
			e.printStackTrace();
		}
		
	    try 
	    {
			os.write(Language_Hebrew);
		} 
	    catch (IOException e) 
	    {
			e.printStackTrace();
		}
	    
	    try 
	    {
			os.write(187);
		} 
	    catch (IOException e) 
	    {
			e.printStackTrace();
		}
	    
	    try 
	    {
			os.write(191);
		} 
	    catch (IOException e) 
	    {
			e.printStackTrace();
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
