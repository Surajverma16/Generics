package org.suraj;

class Counter extends Thread {
	
	private int threadNo;

	public Counter(int threadNo) {
		this.threadNo = threadNo;
	}

	@Override
	public void run() {
		display();
	}

	@Override
	public String toString() {
		return "counter [threadNo=" + threadNo + "]";
	}

	public int getThreadNo() {
		return threadNo;
	}

	public void setThreadNo(int threadNo) {
		this.threadNo = threadNo;
	}

	public void display() {
		for (int i = 0; i <= 9; i++) {

			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(" Loop no : " + i + " Thread No:  " + threadNo);
		}
	}

}

public class Main {

	public static void main(String[] args) {
		Counter counter1 = new Counter(1);
		Counter counter2 = new Counter(2);
		
		counter1.start();
		counter2.start();
		System.out.println("Hello");
	}
}










