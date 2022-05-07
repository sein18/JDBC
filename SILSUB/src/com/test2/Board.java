package com.test2;

import java.util.Date;

public class Board {
	private int b_no;
	private String b_title;
	private String b_writer;
	private String b_content;
	private Date b_date;
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Board(int b_no, String b_title, String b_writer, String b_content, Date b_date) {
		super();
		this.b_no = b_no;
		this.b_title = b_title;
		this.b_writer = b_writer;
		this.b_content = b_content;
		this.b_date = b_date;
	}
	public int getB_no() {
		return b_no;
	}
	public void setB_no(int b_no) {
		this.b_no = b_no;
	}
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public String getB_writer() {
		return b_writer;
	}
	public void setB_writer(String b_writer) {
		this.b_writer = b_writer;
	}
	public String getB_content() {
		return b_content;
	}
	public void setB_content(String b_content) {
		this.b_content = b_content;
	}
	public Date getB_date() {
		return b_date;
	}
	public void setB_date(Date b_date) {
		this.b_date = b_date;
	}
	
	@Override
	public String toString() {
		return b_no+ "  " + b_title + "  " + b_writer + "  " + b_content + "  " + b_date;
	}
	
}
