package com.ustglobal.thread.pausing;

public class MyJoinThread extends Thread {

	@Override
	public void run() {

		for(int i=0; i<5;i++) {

			System.out.println("Child Thread");
			
			try {
			
				Thread.sleep(2000);
			
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}

	}

}
