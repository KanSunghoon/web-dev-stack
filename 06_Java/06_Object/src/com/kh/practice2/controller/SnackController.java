package com.kh.practice2.controller;

import com.kh.practice2.model.Snack;

public class SnackController {
	
	private Snack snack = new Snack();
	
	public void saveData(String kind, String name, String flavor, int numOf, int price) {
		snack.setKind(kind);
		snack.setName(name);
		snack.setFlavor(flavor);
		snack.setNumOf(numOf);
		snack.setPrice(price);
	}
	
	public String confirmData() {
		
	}
	
}

