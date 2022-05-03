package com.model.dto;

public class MyTest {
	private int mno; // INT
	private String mname; // varchar
	private String nickname; // varchar

	public MyTest() {
		super(); 
	}

	public MyTest(int mno, String mname, String nickname) {
		super();
		this.mno = mno;
		this.mname = mname;
		this.nickname = nickname;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "MyTest [mno=" + mno + ", mname=" + mname + ", nickname=" + nickname + "]";
	}

}
