package thisComputer;

public class ThisComputer {

	public ThisComputer() 
	{
		NetworkAddress na = new NetworkAddress();
		System.out.println("Ip: " + na.getStIPv4Address());
	}

	public static void main(String[] args) 
	{
		ThisComputer tc = new ThisComputer();
	}

	//main method
	
}

