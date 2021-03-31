package thisComputer;

public class ThisComputer {

	// Getter/Setter

	public ThisComputer() {
		NetworkAddress na = new NetworkAddress();
		System.out.println("Host-Name-From-IP: " + na.getStHostNameFromIp());
		System.out.println("Host-Name: " + na.getStHostName());
		System.out.println("Ip: " + na.getStIPv4Address());

		// remote desktop
		// RemoteNetworks rn = new RemoteNetworks();

	}

}
