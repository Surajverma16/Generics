package org.suraj;

public class Main {

	public static void main(String[] args) {
		
		Door door = new Door();
		System.out.println(door.getLock().isUnlocked("abc"));

	}

}
