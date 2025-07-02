package view;

import java.sql.SQLException;
import java.util.Scanner;

import controller.PersonController;

public class PersonView {

	public static void main(String[] args) throws SQLException {
		
		PersonController pc = new PersonController();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 > ");
		String name = sc.nextLine();
		System.out.print("나이 > ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("주소 > ");
		String addr = sc.nextLine();

		pc.addPerson(name, age, addr);
		System.out.println();
		
		// 테스트 용도!
	}

}
