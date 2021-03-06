package thisComputer;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkAddress {

	// variable (private)
	private String stIPv4Address = "";
	private String stIPv6Address = "";
	private String stSubnetMask = "";
	private String stDefaultGateway = "";
	private String stHostName = "";
	private String stHostNameFromIp = "";

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

	public String getStHostNameFromIp() {
		return stHostNameFromIp;
	}

	public void setStHostNameFromIp(String stHostNameFromIp) {
		this.stHostNameFromIp = stHostNameFromIp;
	}

	/****
	 * method (private)
	 */

	// *** Host-Name-local ***//
	private void fnCalcHostName() {
		InetAddress host = null;
		String stReturn = "";
		try {
			host = InetAddress.getLocalHost();
			stReturn = host.getHostName().toString();
			// System.out.println("hostname == " + host.getHostName());

		} catch (UnknownHostException ex) {
			stReturn = ". . . . ";
			ex.printStackTrace();
		}

		setStHostNameFromIp(stReturn);
	}

	// *** Host-Name-from IP ***//
	private void fnCalcHostNameFromIp() {
		InetAddress host = null;
		String stReturn = "";
		try {
			fnCalcIPv4Address(); // *** IP ***

			host = InetAddress.getByName(getStIPv4Address());
			stReturn = host.getHostName().toString();
			// System.out.println("hostname == " + host.getHostName());

		} catch (UnknownHostException ex) {
			stReturn = ". . . . ";
			ex.printStackTrace();
		}

		setStHostName(stReturn);
	}

//    private void fnCalcAllIPv4Address()
//    {
//    	InetAddress IP = null ;
//    	
//        InetAddress[] IP = InetAddress.getAllByName(args[0]);
//        for (int i = 0; i < addr.length; i++)
//          System.out.println(addr[i]);
//      }
//    }

	// *** IPv4 ***//
	private void fnCalcIPv4Address() {

		InetAddress IP = null;
		String stReturn = "";
		try {
			IP = InetAddress.getLocalHost();
			stReturn = IP.getHostAddress().toString();
		} catch (UnknownHostException e) {
			stReturn = ". . . . ";
			e.printStackTrace();
		}

		setStIPv4Address(stReturn);
	}

	// *** IPv6 ***//
	private void fnCalcIPv6Address() {
		setStIPv6Address(". . . . .");
	}

	// *** Subnet Mask ***//
	private void fnCalcISubnetMaskAddress() {
		System.out.println("fnCalcISubnetMaskAddress");
	}

	// *** Default Gateway ***//
	private void fnDefaultGatewayAddress() {
		System.out.println("fnDefaultGatewayAddress");
	}

	private void fnGetData() {
		System.out.println("");
		System.out.println("---[data Output]---- ");
		System.out.println("");
		System.out.println("---[Ip Address]---- ");
		System.out.println("ip 4: " + getStIPv4Address());
		System.out.println("ip 6: " +  getStIPv6Address());
		System.out.println("DefaultGateway: " + getStDefaultGateway());
		System.out.println("SubnetMask: " + getStSubnetMask());
		System.out.println("HostName: " + getStHostName());
		System.out.println("HostNameFromIp: " + getStHostNameFromIp());
	}
	
	/****
	 * constructor - load all method to getter/setter variable.
	 */
	public NetworkAddress() {
		fnCalcIPv4Address();
		fnCalcIPv6Address();
		fnCalcHostName();
		fnCalcHostNameFromIp();
//		fnGetData();
	} // constructor

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
