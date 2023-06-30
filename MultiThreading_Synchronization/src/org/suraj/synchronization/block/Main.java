package org.suraj.synchronization.block;

class Brackets {
	private int count ;
	
	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public void displayBrackets() {

		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				/*
				 * try { Thread.sleep(25); } catch (InterruptedException e) { // TODO
				 * Auto-generated catch block e.printStackTrace(); }
				 */
				if (i <= 5) {
					System.out.print("[");
				} else {
					System.out.print("]");
				}
			}
			System.out.println();
		}
	}
}

public class Main {

	public static void main(String[] args) {

		Brackets brackets = new Brackets();
		brackets.setCount(10);
		System.out.println(brackets.getCount());
		
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
