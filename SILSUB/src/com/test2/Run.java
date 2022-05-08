package com.test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("*****Board*****");
			System.out.println("1. selectAll [1번]");
			System.out.println("2. insert [2번]");
			System.out.println("3.  종 료  [3번]");
			System.out.print("원하는 번호 입력: ");
			int num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				selectAll();
				break;
			case 2:
				insert();
				break;
			case 3:
				System.out.println("시스템이 종료 되었습니다.");
				return;
			}
		}
	}

	public static void selectAll() {
		System.out.println("**************전체 정보*****************");

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
		System.out.println("**************************************");
	}

	public static void insert() {
		System.out.println("**************정보 추가*****************");
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;

		Board b = new Board();

		System.out.print("no입력: ");
		int no = sc.nextInt();
		sc.nextLine();
		b.setB_no(no);
		System.out.print("title입력: ");
		String title = sc.nextLine();
		b.setB_title(title);
		System.out.print("writer입력: ");
		String writer = sc.nextLine();
		b.setB_writer(writer);
		System.out.print("content입력: ");
		String content = sc.nextLine();
		b.setB_content(content);

		try {
			pstm = con.prepareStatement("INSERT INTO BOARD VALUES(?,?,?,?,NOW())");
			pstm.setInt(1, b.getB_no());
			pstm.setString(2, b.getB_title());
			pstm.setString(3, b.getB_writer());
			pstm.setString(4, b.getB_content());
			res = pstm.executeUpdate();

			if (res != 0) {
				System.out.println("정보가 추가되었습니다.");
				Commit(con);
			} else {
				System.out.println("정보를 추가하지 못했습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Close(pstm);
			Close(con);
		}
		System.out.println("**************************************");
	}
	//커넥션연결
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

	// close 예외 처리
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

	// 커밋,롤백 예외처리
	public static void Commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void Rollback(Connection con) {

		try {
			con.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
