package org.suraj;

public class Main {

   volatile	public static int flag =0 ;
	
	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					if(flag == 0) {
						System.out.println("Running");
					}else {
						break;
					}
				}			
			}
		}).start();
	
	
	new Thread(new Runnable() {
		
		@Override
		public void run() {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			flag = 1;
			System.out.println("Flag value is changed");
		}
	}).start();

	}

}
