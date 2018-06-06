package dataArrays.template;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataArraysTemplateRw 
{
	private HashMap<String,String> hmOne = new HashMap<String, String>();  
	
	public DataArraysTemplateRw() 
	{
		ArrayList<DataTemplate> arrDataTempalte = new ArrayList<DataTemplate>();
		
		hmOne.clear();
		arrDataTempalte.clear();
		arrDataTempalte.add(new DataTemplate("Amelia", "Oliver"  , "6649", "Amelia@gmail.co.il.uk"));
		arrDataTempalte.add(new DataTemplate("Olivia", "Jack"    , "5804", "Olivia@gmail.co.il.uk"));
		arrDataTempalte.add(new DataTemplate("Isla"  , "Harry"   , "5379", "Isla@gmail.co.il.uk"));
		arrDataTempalte.add(new DataTemplate("Emily" , "Jacob"   , "5050", "Emily@gmail.co.il.uk"));
		arrDataTempalte.add(new DataTemplate("Poppy" , "Charlie" , "4642", "Poppy@gmail.co.il.uk"));
		
		
		for (int x=0; x < arrDataTempalte.size(); x++)
		{
			
			//earch from one record.
			if (arrDataTempalte.get(x).getStFirstName().equals("Olivia") )
			{
				hmOne.put("FirstName", arrDataTempalte.get(x).getStFirstName());
				hmOne.put("LastName",arrDataTempalte.get(x).getStLastName());
				hmOne.put("phone",arrDataTempalte.get(x).getPhone());
				hmOne.put("email",arrDataTempalte.get(x).getEmail());
				
//			System.out.print(arrDataTempalte.get(x).getStFirstName() + " , ");
//			System.out.print(arrDataTempalte.get(x).getStLastName() + " , ");
//			System.out.print(arrDataTempalte.get(x).getPhone() + " , ");
//			System.out.print(arrDataTempalte.get(x).getEmail() + " \n");
				
			}
		}
			System.out.println("searching for ::: " + hmOne.get("FirstName")) ;
			System.out.println(hmOne.get("FirstName") + " , " 
								+ hmOne.get("LastName") + " , " 
								+ hmOne.get("phone") + " , "
								+ hmOne.get("email") );

	}

	
	public static void main (String [] args)
	{
		DataArraysTemplateRw dataArraysTemplateRw = new DataArraysTemplateRw();
	}
}
