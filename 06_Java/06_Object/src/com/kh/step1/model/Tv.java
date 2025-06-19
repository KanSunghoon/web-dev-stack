package com.kh.step1.model;

public class Tv {

	/*
	 * 1. 추상화 : 공통적인 특성만 뽑아내어 단순화
	 * - 개발하는데 중요한 것만 뽑고 불필요한 정보는 숨긴다
	 */
	
	// TV라는 객체의 설계도 클래스
	// 속성(property)
	// - 멤버변수(member variable), 필드(field), 특성(attribute)
	public boolean power; // 전원상태(on/off)
	public int channel; // 채널
	
	// 기능(function)
	// - 메서드(method), 함수(function)
	public void power() { // TV를 끄거나 키는 기능
		power = !power;
	}
	
	public void channelUp() { // 채널 번호를 높이는 기능
		channel++;
	}
	
	public void channelDown() { // 채널 번호를 내리는 기능
		channel--;
	}
	
	public static void main(String[] args) {
		/* 객체 생성
		 * 
		 * 클래스명 변수명 = new 클래스명();
		 * 
		 * - new 연산자를 사용해서 생성
		 * - new 연산자는 Heap 영역에 객체를 생성하고 객체의 주수값을 반환
		 * - 객체의 주소값을 참조 타입의 변수에 저장해서 객체 사용
		 * 
		 */
		// 객체 생성 = 메모리에 올린다 = 객체의 구성요소(field, method)가 다 올라간다
		Tv tv = new Tv();
		System.out.println("TV 상태 : " + tv.power); // false - TV가 꺼진 상태
		tv.power(); // TV 켜기
		System.out.println("TV 상태 :" + tv.power); // true - TV가 켜진 상태
		
		System.out.println("TV 채널 : " + tv.channel); // 0
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelDown();
		tv.channelDown();
		tv.channelUp();
		tv.channelUp();
		System.out.println("TV 채널 : " + tv.channel); // 3
	}

}
