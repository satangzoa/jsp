package com.oraclejava.project.dao;

import java.sql.*;

public class OracleDBConnection {
	
	// jdbc 드라이버
	private final String DBDRIVER = "oracle.jdbc.OracleDriver";
	// db 접속 url
	private final String DBURL = "jdbc:oracle:thin:@localhost:1521:xe";
	// 사용자이름
	private final String DBUSER = "hr";
	// 사용자 비번
	private final String DBPASSWORD ="hr";
	// 커넥션 객체
	private Connection con = null;
	
	// 생성자(생성할 때 DB연결)
	public OracleDBConnection() {
		try {
			Class.forName(DBDRIVER);
			this.con = DriverManager.getConnection(DBURL,DBUSER, DBPASSWORD );
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("URL이나 사용자정보가 잘못되었습니다.");
			e.printStackTrace();
		}
	}
	
	// 접속된 커넥션을 취득
	public Connection getConnection() {
		return con;
	}
	
	// 접속 닫기
	public void close() {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("db를 닫는 도중 발생하는 에러");
			e.printStackTrace();
		}
	}
	
}
























