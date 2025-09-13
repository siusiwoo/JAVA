package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dto.DbtestDTO;

public class DbtestDAO {
	public DbtestDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
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
	//DB 삽입
	public int insertArticle(DbtestDTO dto) {
		
		int su = 0; // 응답 결과를 저장할 변수
		String sql = "INSERT INTO dbtest Values (?,?,?,sysdate)";
		//DB에 접속
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,dto.getName());
			pstmt.setInt(2,dto.getAge());
			pstmt.setDouble(3,dto.getHeight());
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
	
	
	// 읽기
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
	//update
	 public int updateArticle(String name) {
	        int su = 0;
	        String sql = "UPDATE dbtest SET age = age + 1 WHERE name LIKE ?";
	        Connection conn = getConnection();
	        PreparedStatement pstmt = null;

	        try {
	            pstmt = conn.prepareStatement(sql);
	            pstmt.setString(1, "%" + name + "%");
	            su = pstmt.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (pstmt != null) pstmt.close();
	                if (conn != null) conn.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        return su;
	    }
	 
	 //delete
	 public int deleteArticle(String name) {
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
	 
	 
	 
	 
	 
	 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

