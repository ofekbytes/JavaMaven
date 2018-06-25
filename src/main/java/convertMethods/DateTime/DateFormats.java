package convertMethods.DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

/****
 * 
 * DateFormats
 *
 */

public class DateFormats 
{

	public DateFormats() 
	{
		
	} //constructor

	
	private String calcDate(long millisecs) 
	{
	    SimpleDateFormat date_format = new SimpleDateFormat("MMM dd,yyyy HH:mm");
	    Date resultdate = new Date(millisecs);
	    System.out.println(resultdate);
	    
	    return date_format.format(resultdate);
	}//method

	
	public static void main(String[] args) {
//		DateFormats df = new DateFormats();

	}

}


