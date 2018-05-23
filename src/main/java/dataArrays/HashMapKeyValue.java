package dataArrays;

import java.util.HashMap;
import java.util.Map;

public class HashMapKeyValue 
{
	private Map<String,String> myMap = new HashMap<String,String>();
	
	public HashMapKeyValue() 
	{
		//clear
		myMap.clear();
		
		//assign
		myMap.put("key1","value1");
		myMap.put("key2","value2");
		myMap.put("key3","value3");

		//serach a word
		String strKeySearch = "key1";
		
		//serach string in hash map
		String str = myMap.get(strKeySearch);
		
		//print the value of the key (key:value)
		System.out.println(strKeySearch + " >> " + str);
		
	}

	public static void main(String[] args) 
	{
		HashMapKeyValue m = new HashMapKeyValue();

	}

}
