package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.dto.DbtestDTO;

class UpdateTest {
    public UpdateTest() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 등록성공");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("드라이버 등록실패");
        }
    }

    // DB 접속
    public Connection getConnection() {
        Connection conn = null;
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
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

    public int updateArticle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("수정할 이름 입력 : ");
        String name = sc.next();

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
}


public class Exam04 {
    public static void main(String[] args) {
        UpdateTest updateTest = new UpdateTest();
        int su = updateTest.updateArticle();  // static이 아니므로 객체로 호출
        if (su > 0) {
            System.out.println(su + "개의 행이 수정되었습니다");
        } else {
            System.out.println("수정 실패");
        }
    }
}