package org.suraj;

// Synchronization is the method where if an variable or method is declared by "synchronized" keyword, 
//then only a single thread can use the method/variable at a time

class Brackets {
	
	// synchronization depends on the objects usage of the class, 
	//if two different objects of same try to access the synchronization method then it will same as beforewithout sync
	
	synchronized public void displayBrackets() {
		for (int i = 1; i <= 10; i++) {
			if (i <= 5) {
				System.out.print("[");
			} else {
				System.out.print("]");
			}
		}
		System.out.println();
	}
}

public class Main {

	private static int counter = 0;

	public static void main(String[] args) {

		/*
		 * Thread thread1 = new Thread(new Runnable() {
		 * 
		 * @Override public void run() { for (int i = 0; i <= 1000; i++) { counter++; }
		 * 
		 * } });
		 * 
		 * Thread thread2 = new Thread(new Runnable() {
		 * 
		 * @Override public void run() { for (int i = 0; i <= 1000; i++) { counter++; }
		 * 
		 * } });
		 * 
		 * thread1.start(); thread2.start();
		 * 
		 * try { Thread.sleep(2000);
		 * 
		 * // the output will be not be perfect and vary due to the 2 thread share same
		 * // variable for usage, So the thread are not synchronized
		 * System.out.println("the value of counter is " + counter);
		 * 
		 * } catch (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */

		Brackets brackets = new Brackets();
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 5; i++) {
					brackets.displayBrackets();
				}
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 5; i++) {
					brackets.displayBrackets();
				}
			}
		}).start();
	}

}
