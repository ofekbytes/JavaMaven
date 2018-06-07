package dataArrays.template2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.List;
public class DataArraysTemplateRw 
{
	//global
	//private HashMap<String,String> hmOne = new HashMap<String, String>();  
	 private List<DataTemplate> Scans = new ArrayList<DataTemplate> 
	 	(
		 	Arrays.asList (
			new DataTemplate("jron", "kessler", "2222", "jron@gmail.com"),
			new DataTemplate("shalom","lizerovitch", "3333", "shalom@gmail.com")
		) 
	 );

	 private void fnPrint()
	 {
		 String stResult = "";
		 
		 for (int i=0; i < Scans.size(); i++)
		 {
			 stResult = ""  
					 + Scans.get(i).getStFirstName() + " , " 
					 + Scans.get(i).getStLastName() + " , " 
					 + Scans.get(i).getPhone() + " , "
					 + Scans.get(i).getPhone() ;
			 System.out.println(stResult);
		  }
		 
	 }
	
	/***
	 * DataArraysTemplateRw - constructor - set, print
	 */
	private DataArraysTemplateRw() 
	{
		fnPrint();
		
	}
	
	public static void main (String [] args)
	{
		//call constructor
		DataArraysTemplateRw dataArraysTemplateRw = new DataArraysTemplateRw();
		
	}
}
