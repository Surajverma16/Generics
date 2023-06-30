package org.suraj;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		/*
		Map<Integer, String> names = new HashMap<>();
		names.put(1,"Kalki");
		names.put(2,"NarSinh");
		names.put(3,"Buddha");
		names.put(4,"Parshuram");
		names.put(5,"vaman");
		names.put(6,"matsya");
		names.put(7,"Ram");
		names.put(8,"Krishna");
		names.put(9, "Kurma");
		names.put(10,"Varha");		
		*/
		
		
		// HashTable has implemented with map in the array form
		Hashtable<Integer, String> names = new Hashtable<>();
		names.put(10,"Varha");
		names.put(1,"Kalki");
		names.put(2,"NarSinh");
		names.put(8,"Krishna");
		names.put(9, "Kurma");
		names.put(4,"Parshuram");
		names.put(5,"vaman");
		names.put(3,"Buddha");
		names.put(6,"matsya");
		names.put(7,"Ram");		
		// HasTable gives output in reverse order
		
		// finds and replaces the given value of the key
		names.replace(3, "Buddha", "varha");
		
		// returns the value of the key else the returns the default set value in the below
		System.out.println(names.getOrDefault(1, "not found"));
		
		
		
		// For each loop to print the map 
		for(Map.Entry<Integer,String> entry : names.entrySet()) {
			System.out.println(entry);
		}
			
	}
}
