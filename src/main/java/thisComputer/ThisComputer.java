package thisComputer;

public class ThisComputer 
{

	
	//Geter/Setter
	
	public ThisComputer() 
	{
		NetworkAddress na = new NetworkAddress();
		System.out.println("Host-Name-From-IP: " + na.getStHostNameFromIp());
		System.out.println("Host-Name: " + na.getStHostName());
		System.out.println("Ip: " + na.getStIPv4Address());

		
		//remote desktop
		//RemoteNetworks rn = new RemoteNetworks();
		
		
	}

	public static void main(String[] args) 
	{
		
		ThisComputer tc = new ThisComputer();
	}

	//main method
	
}

