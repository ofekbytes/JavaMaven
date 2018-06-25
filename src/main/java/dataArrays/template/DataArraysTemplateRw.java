package dataArrays.template;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataArraysTemplateRw 
{
	//global
	private HashMap<String,String> hmOne = new HashMap<String, String>();
	
	/***
	 *  fnData() - method: set 
	 */
	public void fnData() 
	{
		//local
		ArrayList<DataTemplate> arrDataTempalte = new ArrayList<DataTemplate>();
		
		/**
		 * add arrays
		 */
		hmOne.clear();
		arrDataTempalte.clear();
		arrDataTempalte.add(new DataTemplate("Amelia", "Oliver"  , "6649", "Amelia@gmail.co.il.uk"));
		arrDataTempalte.add(new DataTemplate("Olivia", "Jack"    , "5804", "Olivia@gmail.co.il.uk"));
		arrDataTempalte.add(new DataTemplate("Isla"  , "Harry"   , "5379", "Isla@gmail.co.il.uk"));
		arrDataTempalte.add(new DataTemplate("Emily" , "Jacob"   , "5050", "Emily@gmail.co.il.uk"));
		arrDataTempalte.add(new DataTemplate("Poppy" , "Charlie" , "4642", "Poppy@gmail.co.il.uk"));

		
		
		/**
		 * print all array #1
		 */
		System.out.println("\n");
		System.out.println(":::print array list #1:::");
		
		for (int x=0; x < arrDataTempalte.size(); x++)
		{
			System.out.print(arrDataTempalte.get(x).getStFirstName() + " , ");
			System.out.print(arrDataTempalte.get(x).getStLastName() + " , ");
			System.out.print(arrDataTempalte.get(x).getPhone() + " , ");
			System.out.print(arrDataTempalte.get(x).getEmail() + " \n");				
		}


		/**
		 * print all array 2
		 */
		System.out.println("\n");
		System.out.println(":::print array list #2:::");
		
		for (int x=0; x < arrDataTempalte.size(); x++)
		{
			/**
			 * add and print
			 */
			hmOne.put("FirstName", arrDataTempalte.get(x).getStFirstName());
			hmOne.put("LastName",arrDataTempalte.get(x).getStLastName());
			hmOne.put("phone",arrDataTempalte.get(x).getPhone());
			hmOne.put("email",arrDataTempalte.get(x).getEmail());

			
			System.out.println(hmOne.get("FirstName") + " , " 
					+ hmOne.get("LastName") + " , " 
					+ hmOne.get("phone") + " , "
					+ hmOne.get("email") );
		}
		
		
	

		/**
		 * search for array
		 */
		System.out.println("\n");
		for (int x=0; x < arrDataTempalte.size(); x++)
		{
			
			//earch from one record.
			if (arrDataTempalte.get(x).getStFirstName().equals("Poppy") )
			{
				hmOne.put("FirstName", arrDataTempalte.get(x).getStFirstName());
				hmOne.put("LastName",arrDataTempalte.get(x).getStLastName());
				hmOne.put("phone",arrDataTempalte.get(x).getPhone());
				hmOne.put("email",arrDataTempalte.get(x).getEmail());				
			}
		}

	}

	
	/***
	 *  fnPrintHashMap() - method: print 
	 */
	private void fnPrintHashMap()
	{
		/**
		 * print result
		 */
			System.out.println("searching for ::: " + hmOne.get("FirstName")) ;
			System.out.println(hmOne.get("FirstName") + " , " 
								+ hmOne.get("LastName") + " , " 
								+ hmOne.get("phone") + " , "
								+ hmOne.get("email") );

	}
	
	/***
	 * DataArraysTemplateRw - constructor - set, print
	 */
	private DataArraysTemplateRw() 
	{
		fnData();
		fnPrintHashMap();
	}
	
	public static void main (String [] args)
	{
		//call constructor
		DataArraysTemplateRw dataArraysTemplateRw = new DataArraysTemplateRw();
		
	}
}
