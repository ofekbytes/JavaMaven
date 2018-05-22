package calc;

import java.util.HashMap;
import java.util.Map;

public class HashMapKeyValue 
{
	private Map<String,String> myMap = new HashMap<String,String>();
	
	public HashMapKeyValue() 
	{
		myMap.clear();
		
		myMap.put("key1","value1");
		myMap.put("key2","value2");
		myMap.put("key3","value3");

		String strKeySearch = "key1";
		String str = myMap.get(strKeySearch);
		
		System.out.println(strKeySearch + " >> " + str);
		
	}

	public static void main(String[] args) 
	{
		HashMapKeyValue m = new HashMapKeyValue();

	}

}
