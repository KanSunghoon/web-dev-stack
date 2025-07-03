package dao;

import java.sql.Connection;
import java.util.ArrayList;

import vo.Book;

public class BookDAO {
	
	// 1. 전체 책 조회
	public ArrayList<Book> printBookAll() {
		return null;
	}
	
	// 2. 책 등록
	public void registerBook(String title, String author, int accessAge) {
		Connection connect = connect();
		String query = "INSERT INTO book(title, author, accessAge) VALUES(?, ?, ?) "
	}
	
	// 3. 책 삭제
	public void sellBook(int bookNo) {
		
	}
}
