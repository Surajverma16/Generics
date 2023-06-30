package org.suraj;

public class Main {

	private static int counter = 0;

	public void count() {
		for (int i = 0; i < 1000; i++) {
			counter++;
		}
	}

	public static void main(String[] args) {
		Main main = new Main();

		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				main.count();
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					thread1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				main.count();
			}
		});
		
		thread1.start();
		thread2.start();
		
		
		
		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The counter value is "+ counter);
	}
}
