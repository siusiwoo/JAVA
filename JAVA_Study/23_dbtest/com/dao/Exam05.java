package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class DeleteTest {
	public DeleteTest() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

// DB에 접속
	public Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 오라클 데이터베이스 접속 주소
		String username = "C##dbexam"; // 사용자 계정
		String password = "m1234"; // 비밀번호
		try {
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("접속 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

// 2. DB에 접속
// 3. DB에 요청
// 4. DB 응답처리
// 5. 접속끊기
public int deleteArticle() {
Scanner sc = new Scanner(System.in);

System.out.print("삭제할 이름 입력 : ");
String name = sc.next();
int su = 0;
String sql = "delete dbtest where name=?";
// 2. DB 접속
Connection conn = getConnection();
// 요청, 응답 처리 클래스
PreparedStatement pstmt = null;
try {
pstmt = conn.prepareStatement(sql);
pstmt.setString(1, name);
// 3. DB에 요청
// 4. DB 응답처리
// db에 요청 및 응답값 리턴
su = pstmt.executeUpdate();
} catch (SQLException e) {
e.printStackTrace();
} finally {
// 접속 끊기
try {
if (pstmt != null) pstmt.close();
if (conn != null) conn.close();
} catch (SQLException e) {
e.printStackTrace();
}
}
return su;
}
}

public class Exam05 {
	public static void main(String[] args) {
		DeleteTest deleteTest = new DeleteTest();
		int su = deleteTest.deleteArticle();
		if (su > 0) {
			System.out.println(su + "개의 행이 삭제되었습니다.");
		} else {
			System.out.println("삭제 실패");
		}
	}
}