package org.suraj;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

 		TreeSet<Integer>treeSet = new TreeSet<>();
 		treeSet.add(1);
 		treeSet.add(9);
 		treeSet.add(7);
 		treeSet.add(5);
 		treeSet.add(4);
 		treeSet.add(2);
		
 		for (Integer integer : treeSet) {
 			System.out.println(integer);
 		}

		
	}

}
