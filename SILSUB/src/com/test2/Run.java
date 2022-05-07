package com.test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Run {

	public static void main(String[] args) {

		selectAll();
	}

	public static void selectAll() {
		Connection con = getConnection();
		Statement stmt = null;
		ResultSet res = null;
		List<Board> list = new ArrayList<Board>();
		try {
			stmt = con.createStatement();
			res = stmt.executeQuery("SELECT * FROM BOARD");
			while (res.next()) {
				Board tmp = new Board();
				tmp.setB_no(res.getInt(1));
				tmp.setB_title(res.getString(2));
				tmp.setB_writer(res.getString(3));
				tmp.setB_content(res.getString(4));
				tmp.setB_date(res.getDate(5));
				list.add(tmp);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			Close(res);
			Close(stmt);
			Close(con);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
	}

	public static void insert() {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		
	}

	public static void select() {

	}

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("[Error] 드라이버 등록 실패");
			e.printStackTrace();
		}
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/multi", "root", "1234");
			con.setAutoCommit(false);
		} catch (SQLException e) {
			System.out.println("[Error] 커넥션 연결 실패");
			e.printStackTrace();
		}
		return con;

	}

	public static void Close(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void Close(Statement stmt) {
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void Close(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
