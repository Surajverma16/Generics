package org.suraj;


// Wait and Notify method must/only can be called in an synchronization block or method 
// otherwise its gives runtime error 

public class Main {
	private static int balance =0;
	
	public void withdraw(int amount) {
		
		synchronized (this) {
			if(balance >=0) {
				try {
				System.out.println("Waiting for balance updatation");
				// wait method makes the thread stop running and makes it in waiting state until an notify function is called 
				// and when when an notify fun is called the thread resume to work
				wait();
				} catch (InterruptedException e) {
				e.printStackTrace();
				}
			balance = balance - amount;
			System.out.println("Amount withdrawed successfully");
			}
		}
	}
	
	public void deposit(int amount) {
		
		balance = balance + amount;
		System.out.println("Deposited Successfully");
		
		synchronized (this) {			
			// notifyAll, notifies all the waiting state thread to resume
			notifyAll();
		}
	}
	
	public static void main(String[] args) {
			
		Main main = new Main();
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				main.withdraw(1000);
			}
		});
		
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				main.deposit(1000);
				
			}
		});
		
		thread1.start();
		thread2.start();
	}

}
