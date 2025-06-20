package com.kh.practice2;

import java.util.Scanner;

import com.kh.practice2.controller.SnackController;
import com.kh.practice2.model.Snack;

public class Application {
		
	public static void main(String[] args) {	
		Snack snack = new Snack();
		SnackController controller = new SnackController();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		String kind = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("맛 : ");
		String flavor = sc.nextLine();
		System.out.print("개수 : ");
		int numOf = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.println("저장 완료되었습니다.");
		System.out.println("빵(케이크 - 블루베리) 1개 15000원");
		
	}

}
