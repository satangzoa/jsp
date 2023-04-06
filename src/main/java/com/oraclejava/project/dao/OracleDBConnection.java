package com.oraclejava.project.dao;

import java.sql.*;

public class OracleDBConnection {
	
	// jdbc ����̹�
	private final String DBDRIVER = "oracle.jdbc.OracleDriver";
	// db ���� url
	private final String DBURL = "jdbc:oracle:thin:@localhost:1521:xe";
	// ������̸�
	private final String DBUSER = "hr";
	// ����� ���
	private final String DBPASSWORD ="hr";
	// Ŀ�ؼ� ��ü
	private Connection con = null;
	
	// ������(������ �� DB����)
	public OracleDBConnection() {
		try {
			Class.forName(DBDRIVER);
			this.con = DriverManager.getConnection(DBURL,DBUSER, DBPASSWORD );
		} catch (ClassNotFoundException e) {
			System.out.println("����̹��� ã�� �� �����ϴ�!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("URL�̳� ����������� �߸��Ǿ����ϴ�.");
			e.printStackTrace();
		}
	}
	
	// ���ӵ� Ŀ�ؼ��� ���
	public Connection getConnection() {
		return con;
	}
	
	// ���� �ݱ�
	public void close() {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("db�� �ݴ� ���� �߻��ϴ� ����");
			e.printStackTrace();
		}
	}
	
}
























