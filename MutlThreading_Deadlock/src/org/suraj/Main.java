package org.suraj;

import java.util.concurrent.locks.ReentrantLock;

// if the two thread object wants to execute same lock then the thread goes in deadlock, 
// so to free from the deadlock the reentrant lock is used to lock and unlock the usage of the lock

public class Main {

	public static void main(String[] args) {

		ReentrantLock lock1 = new ReentrantLock();
		ReentrantLock lock2 = new ReentrantLock();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				boolean flagLock1 = false;
				boolean flagLock2 = false;
				boolean doneFlag1 = false;
				boolean doneFlag2 = false;

				while (true) {
					try {

						flagLock1 = lock1.tryLock();
						flagLock2 = lock2.tryLock();

					}finally {
						if(flagLock1 && !doneFlag1) {
							System.out.println("Thread 1 - lock 1");
							lock1.unlock();
							doneFlag1 = true;
						}
						
						if(flagLock2 && !doneFlag2) {
							System.out.println("Thread 1 - lock 2");
							lock2.unlock();
							doneFlag2 = true;
						}
						
						if(flagLock1 && flagLock2) {
							break;
						}
					}

				}
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				boolean flagLock1 = false;
				boolean flagLock2 = false;
				boolean doneFlag1 = false;
				boolean doneFlag2 = false;

				while (true) {
					try {

						flagLock1 = lock1.tryLock();
						flagLock2 = lock2.tryLock();

						
					}finally {
						if(flagLock1 && !doneFlag1) {
							System.out.println("Thread 2 - lock 1");
							lock1.unlock();
							doneFlag1 = true;
						}
						
						if(flagLock2 && !doneFlag2) {
							System.out.println("Thread 2 - lock 2");
							lock2.unlock();
							doneFlag2 = true;
						}
						
						if(flagLock1 && flagLock2) {
							break;
						}
					}

				}
			}
		});

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main Thread");

	}

}
