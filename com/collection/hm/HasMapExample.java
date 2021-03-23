package com.collection.hm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HasMapExample {
	
     static void forEachMethod(Map<String, String> m){
		System.out.println("*****Iterating over Map.entrySet() using ForEach Loop : \n");
		for(Map.Entry<String, String> entry : ((Map<String,String>) m).entrySet())	
			System.out.println("Key="+entry.getKey()+ ", Value= " +entry.getValue());
		
	}
	static void keySetValuesMethod(Map<String, String> m){
		
		System.out.println("\n*****Iterating over keys or values using KeySet() and values() methods : \n");
		
		//using keySet() for iteration over keys
		
		for(String name : m.values())
			System.out.println("Key:" +name);
		
		//using values() for iteration over values

		for(String url : m.values())
			System.out.println("Value:" +url);

	}
	static void iteratorMethod(Map<String, String> m){
		System.out.println("\n*****Iterating using iterator : \n");

		Iterator<Map.Entry<String,String>> itr=m.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, String> entry=itr.next();
			System.out.println("Key =" +entry.getKey() + ", Value = " +entry.getValue());
		}
	}
static void searchingValuesMethod(Map<String, String> m){
		
		System.out.println("\n*****Iterating over keys and searching for values : \n");
		
		for(String name : m.keySet()){
			String url=m.get(name);
			System.out.println("Key:" +name + "Value:" +url);

		}
	}
static void forEachActionMethod(Map<String, String> m){
	
	System.out.println("\n*****Using forEach(action) method : \n");
	m.forEach((k,v) -> System.out.println("Key:" + k + "Value:" + v));

	}

	public static void main(String[] args) {
    Map<String,String> m=new HashMap<String,String>();
    m.put("Kavita", "Kaushik");
    m.put("Priya", "Bapat");
    m.put("Shreyash", "Iyer");
    m.put("Virat", "Kohli");
    m.put("Rohit", "Sharma");
    forEachMethod(m);
    keySetValuesMethod(m);
    iteratorMethod(m);
    searchingValuesMethod(m);
    forEachActionMethod(m);
	}

}
