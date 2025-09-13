package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 *1.Driver확인
 *2.DB접속
 *3.DB에 요청
 *4.DB 응답처리
 *5.접속끊기
 */
class InsertTest{
	public InsertTest() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 등록실패");
		}
	}
	//2.DB에 접속하기 위해 커넥션 객체를 얻어옴 : connection'
	public Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";//오라클 세부정보
		String username = "C##dbexam";
		String password = "m1234";
		try {
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("접속성공");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("접속실패");
		}
		return conn;
	}
	

	//3.db에요청
	//4.DB 응답처리
	//5.접속끊기
	public int insertArticle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 :");
		String name = sc.next();
		System.out.println("나이 입력 :");
		int age = sc.nextInt();
		System.out.println("키 입력 :");
		double height = sc.nextDouble();
		
		int su = 0; // 응답 결과를 저장할 변수
		String sql = "INSERT INTO dbtest Values (?,?,?,sysdate)";
		//DB에 접속
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,name);
			pstmt.setInt(2,age);
			pstmt.setDouble(3,height);
			//DB에 요청&DB 응답처리
			su = pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			//접속 끊기
			if(pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
		}
		return su;
		
	}	
}

public class Exam02 {
	public static void main(String[] args) {
		InsertTest insertTest = new InsertTest();
		int su = insertTest.insertArticle();
			if(su>0) {
				System.out.println(su+"개의 행이 만들어졌습니다");
			}else {
				System.out.println("저장 실패");
			}
		}
}
