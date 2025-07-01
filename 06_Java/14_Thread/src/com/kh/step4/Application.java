package com.kh.step4;

// 프로세스 - 두 스레드 간의 Communication은 프로세스 자원으로 한다.
public class Application {

	boolean check = false;
	
	public static void main(String[] args) {

		Application process = new Application();
		
		CountThread count = new CountThread();
		InputThread input = new InputThread();
		
		count.start();
		input.start();
		
	}

}
