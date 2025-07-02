package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import config.ServerInfo;

public class PersonController {

	// 리턴 타입이나 파라미터 자유롭게 변경 가능!
	// 메서드 추가 가능!
	
	public PersonController() {
		try {
			// 1. 드라이버 로딩
			Class.forName(ServerInfo.DRIVER);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	// person 테이블에 데이터 추가 - INSERT
	public void addPerson() {
		Connection connect;
		try {			
			connect = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASSWORD);
			String query = ""
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	// person 테이블에서 데이터 전체 보여주기 - SELECT
	public void searchAllPerson() {
		Connection connect;
		try {
			connect = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASSWORD);
			String query = "SELECT * FROM person";
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// peron 테이블에서 데이터 한개만 가져오기 - SELECT -> id로!
	public void searchPerson() {
		Connection connect;
		try {
			connect = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// person 테이블에 데이터 수정 - UPDATE
	public void updatePerson() {
		Connection connect;
		try {
			connect = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASSWORD);
			String query = "UPDATE person SET id = ?, name = ?, age = ?, addr = ?";
			

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} 
	
	// person 테이블에 데이터 삭제 - DELETE
	public void deletePerson() {
		Connection connect;
		try {
			connect = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
