package view;

import controller.PersonController;

public class PersonView {
	
	

	public static void main(String[] args) {
		
		PersonController pc = new PersonController();

		pc.addPerson();
		System.out.println();
		// 테스트 용도!
	}

}
