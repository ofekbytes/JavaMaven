package dataArrays.examples;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapAndArrayList 
{

	public HashMapAndArrayList() 
	{
	    HashMap<String, String> stOslist = new HashMap<String, String>();
		ArrayList <String> stHtmlPage = new ArrayList<String>();
		String stReturnValue = "";
		
		
	    stOslist.clear();
	    stOslist.put("titleMain", "Os Information");
	    stOslist.put("titileUserId","Current user: ");
	    stOslist.put("userId", System.getProperty( "user.name" ) );
	    stOslist.put("titleDomain","Domain: ");
	    stOslist.put("Domain", "domain name method");
	    stOslist.put("titleIp", "IpAddress: ");
	    stOslist.put("Ip","ip address method");

		
		stHtmlPage.clear();
		stHtmlPage.add("<h1>" + stOslist.get("titleMain") + "</h1><hr/>");
		stHtmlPage.add("<h3>" + stOslist.get("titileUserId") + "  <i>" + stOslist.get("userId") + "</i></h3>");
		stHtmlPage.add("<h3>" + stOslist.get("titleDomain") + "  <i>" + stOslist.get("Domain") + "</i></h3>");
		stHtmlPage.add("<h3>" + stOslist.get("titleIp") + "  <i>" + stOslist.get("Ip") + "</i></h3>");
		
		
	    
	    for (int i=0; i<stHtmlPage.size();i++)
	    {
	    	stReturnValue = stReturnValue + stHtmlPage.get(i);
	    }
	    
	    System.out.println("stReturnValue === " + stReturnValue);
	    
		
	}

	public static void main(String[] args) 
	{
		HashMapAndArrayList hashMapAndArrayList = new HashMapAndArrayList();

	}

}
