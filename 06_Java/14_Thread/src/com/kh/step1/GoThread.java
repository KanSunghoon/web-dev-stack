package com.kh.step1;

public class GoThread {
	
	public GoThread(String name) {
		super();
	}
	
	public void run() {
			
			for(int i = 0; i < 100; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				String name = Thread.currentThread().getName();
				System.out.println("CurrentThread : " + name + ", " + i);

			}
	}
}
