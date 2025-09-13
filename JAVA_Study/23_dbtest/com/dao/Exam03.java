package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.DbtestDTO;

class SelectTest{
	//1.Driver확인
	public SelectTest() {
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
		public List<DbtestDTO> selectArticle(){
			List<DbtestDTO> list = new ArrayList<>();
			String sql = "select * from dbtest";
			//DB에 접속
			Connection conn = getConnection();
			PreparedStatement pstmt = null;
			ResultSet rs = null; // pstmt 객체가 db에서 넘어온 데이터를 저장하는 클래스
			
			try {
				pstmt = conn.prepareStatement(sql);
	
				//DB에 요청&DB 응답처리
				rs = pstmt.executeQuery(); // 쿼리실행 값 읽어온 데이터를 리턴 
				// 응답결과 처리
				while(rs.next()) {
					String name = rs.getString("name");
					int age = rs.getInt("age");
					double height = rs.getDouble("height");
					String logtime = rs.getString("logtime");
					//자바 빈즈에 1명 데이터 저장
					DbtestDTO dto = new DbtestDTO(name, age, height,logtime);
					//리스트에 저장
					list.add(dto);
				}
				
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
			return list;
		}
		
}

public class Exam03 {
	public static void main(String[] args) {
		SelectTest selectTest = new SelectTest();
		List<DbtestDTO> list =  selectTest.selectArticle();
		
		for(int i=0;i<list.size();i++) {
			DbtestDTO dto = list.get(i);
			System.out.println(dto);
		}
	}
}
