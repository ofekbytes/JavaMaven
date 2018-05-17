package thisComputer;

import java.io.IOException;

public class TerminalCommands 
{

	private Runtime rt = null;
	
	public TerminalCommands() 
	{
		rt = Runtime.getRuntime();
		
		try 
		{
			//rt.exec("mspaint");
			rt.exec("notepad");
			//rt.exec("notepad c:\\1\\login.log");
			//rt.exec("explorer c:\\users\\kesslery\\git\\JavaMaven");

			//-------
			//TODO get shortcut example
			//-------
			//rt.exec("explorer  %DOCS%");
			//rt.exec("explorer  %USERPROFILE%\\Documents");
			//rt.exec("explorer  %USERPROFILE%");
			
		} 
		catch (IOException e) 
		{
			System.out.println("Terminal Command Failed >>> " + e.getMessage() ) ;
			e.printStackTrace();
		}
		
	}//constructor

	
	public static void main(String[] args) 
	{
		TerminalCommands tc = new TerminalCommands();

	}

}
