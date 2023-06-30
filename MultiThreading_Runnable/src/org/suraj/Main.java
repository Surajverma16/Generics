package org.suraj;


class Counter implements Runnable {
	
	private int threadNo;

	public Counter(int threadNo) {
		this.threadNo = threadNo;
	}

	

	@Override
	public String toString() {
		return "counter [threadNo=" + threadNo + "]";
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0; i<10; i++) {
			System.out.println("The value of i is "+ i+" and the Thread No. is "+ threadNo);
		}	
	}
}

public class Main {

	public static void main(String[] args) {
		/*
		Thread thread = new Thread(new Counter(1));
		Thread thread2 = new Thread(new Counter(2));
		thread.start();
		thread2.start();
		*/
		
		
		// If you want execute thread only for one time using Anonymous object
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0 ; i<=9; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(i);
				}
				
			}
		}).start();
	
	}
}










