package thisComputer;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkAddress 
{
	
	//variable (private)
	private String stIPv4Address = "";
	private String stIPv6Address = "";
	private String stSubnetMask  = "";
	private String stDefaultGateway = "";
	private String stHostName = "";

	
	

	/***
	 * 
	 * Getter and Setter (public)
	 */
	public String getStIPv4Address() {
		return stIPv4Address;
	}
	public void setStIPv4Address(String stIPv4Address) {
		this.stIPv4Address = stIPv4Address;
	}


	public String getStIPv6Address() {
		return stIPv6Address;
	}
	public void setStIPv6Address(String stIPv6Address) {
		this.stIPv6Address = stIPv6Address;
	}


	public String getStSubnetMask() {
		return stSubnetMask;
	}
	public void setStSubnetMask(String stSubnetMask) {
		this.stSubnetMask = stSubnetMask;
	}


	public String getStDefaultGateway() {
		return stDefaultGateway;
	}
	public void setStDefaultGateway(String stDefaultGateway) {
		this.stDefaultGateway = stDefaultGateway;
	}
	
	
	public String getStHostName() {
		return stHostName;
	}
	public void setStHostName(String stHostName) {
		this.stHostName = stHostName;
	}



	/****
	 * method (private)
	 */
	
	//*** HostName ***//
	private void fnCalcHostName()
	{
		InetAddress host = null;
		String stReturn = "";
        try 
        {
            host = InetAddress.getByName(getStIPv4Address());
            stReturn =  host.getHostName().toString();
            //System.out.println("hostname == " + host.getHostName());
            
        } 
        catch (UnknownHostException ex) 
        {
        	stReturn = ". . . . ";
            ex.printStackTrace();
        }
        
        setStHostName(stReturn);
	}
	
	
	//*** IPv4 ***//
	private void fnCalcIPv4Address()
	{

		InetAddress IP = null ;
		String stReturn = "";
		try 
		{
			IP = InetAddress.getLocalHost();
			stReturn = IP.getHostAddress().toString();
		} 
		catch (UnknownHostException e) 
		{
			stReturn = ". . . . ";
			e.printStackTrace();
		}
		
		setStIPv4Address(stReturn);
	}
	
	
	
	
	//*** IPv6 ***//
	private void fnCalcIPv6Address()
	{			
	    setStIPv6Address(". . . . .");
	}
	
	
	
	
	//*** Subnet Mask ***//
	private void fnCalcISubnetMaskAddress()
	{			
	    System.out.println("fnCalcISubnetMaskAddress");
	}
	
	
	
	//*** Default Gateway ***//
	private void fnDefaultGatewayAddress()
	{			
	    System.out.println("fnDefaultGatewayAddress");
	}
	
	
	
	/****
	 * constructor - load all method to getter/setter variable.
	 */
	public NetworkAddress() 
	{
		fnCalcIPv4Address();
		fnCalcIPv6Address();
		fnCalcHostName();
	} //constructor

}



//Connection-specific DNS Suffix  . : 
//Link-local IPv6 Address . . . . . : 
//IPv4 Address. . . . . . . . . . . : 
//Subnet Mask . . . . . . . . . . . : 
//Default Gateway . . . . . . . . . : 



//InetAddress localHost = Inet4Address.getLocalHost();
//NetworkInterface networkInterface = NetworkInterface.getByInetAddress(localHost);
//networkInterface.getInterfaceAddresses().get(0).getNetworkPrefixLength();
//a more complete approach:
//
//InetAddress localHost = Inet4Address.getLocalHost();
//NetworkInterface networkInterface = NetworkInterface.getByInetAddress(localHost);
//
//for (InterfaceAddress address : networkInterface.getInterfaceAddresses()) {
//    System.out.println(address.getNetworkPrefixLength());
//}
///24 means 255.255.255.
//
//shareimprove this answer
