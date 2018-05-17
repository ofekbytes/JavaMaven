package thisComputer;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class RemoteNetworks 
{

	/****
	 * Ip From Host-Name
	 */
	public void fnIpFromHostName(String stHostName)
	{
		
       try 
       {
            InetAddress host = InetAddress.getByName(stHostName);
            System.out.println(stHostName + " >> is >> " + host.getHostAddress());
        } 
       catch (UnknownHostException ex) 
       {
	        ex.printStackTrace();
	   }
	}
	
	

	/****
	 * Host-Name From Ip 
	 */
	public void fnHostNameFromIp(String stHostName)
	{
		
		
		
	}

	
	
	public RemoteNetworks() 
	{
		
		fnIpFromHostName("www.google.com"); //get IP from Host-Name.
		
	} //constructor

	
	
}
