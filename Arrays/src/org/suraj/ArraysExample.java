package org.suraj;


public class ArraysExample {

	public static void main(String[] args) {

		String[] name = {"Suraj", "sachin", "dhoni", "virat"};
		ArraysExample arraysExample = new ArraysExample();
	   	arraysExample.displayName(name);
		
	   	System.out.println();
		
		System.out.println(arraysExample.displayName(name));
	}
	
	String displayName(String[] names) {
		for(String nameString : names) {
			System.out.println(nameString);
		}
		names[1]= "Bablu";
		
		return names[1];
	}
	

}
