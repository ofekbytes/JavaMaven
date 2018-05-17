package thisComputer;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class WhoAmI 
{
	/****
	 * 
	 */
	private String OsName = "";	
	public String getOsName() {
		return OsName;
	}
	public void setOsName(String osName) {
		OsName = osName;
	}

	

	/****
	 * 
	 */
	private String OsUser = "";
	public String getOsUser() {
		return OsUser;
	}
	public void setOsUser(String osUser) {
		OsUser = osUser;
	}



	private void IpAddress()
	{
		NetworkAddress na = new NetworkAddress();
		System.out.println("Ip: " + na.getStIPv4Address());
	}
	
	
	
	public WhoAmI() 
	{
		//TODO: move method to diffrent class
		//TODO ::: generate a basic os informaton for the old command howami
		setOsName(System.getProperty( "os.name" ).toLowerCase().toString());
		setOsUser(System.getProperty( "user.name" ).toLowerCase().toString());
		
	}

	//TODO erase this class.

}


