package adLdap;

import javax.naming.NamingException;

public class main {

//	public main() {
//	}

	public static void main(String[] args) 
	{

//		//method OK
//		System.out.println("\n***Method #1: \n");
//		OutsideDomain o = new OutsideDomain();

		
		
		OutsideDomainMemberOf omf = null;
		
		try 
		{
			System.out.println("\n***Method #2: \n");
			omf = new OutsideDomainMemberOf();
		}
		catch (NamingException e) 
		{
			
			e.printStackTrace();
		}
		
	}

}
