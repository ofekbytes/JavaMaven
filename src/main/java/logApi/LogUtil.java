
/***
 * LogUtil - java log util
 * API: java.util.logging.*;
 */


package logApi;

import java.util.logging.Level;
//import java.util.logging.*;
import java.util.logging.Logger;
import logApi.Log4j;

public class LogUtil 
{

	
	private final static Logger logIt = Logger.getLogger(LogUtil.class.getName());
	
	public LogUtil() 
	{
		logIt.setLevel(Level.INFO); //level.*
	}

	
	public static void main(String[] args) 
	{
		LogUtil la = new LogUtil();
		

	}

}
