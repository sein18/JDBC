package com.controller;

import java.util.List;

import com.model.dto.Member;
import com.model.sevice.MemberBizImpl;

public class MemberController {
	MemberBizImpl biz =new MemberBizImpl();
	
	
	public List<Member> selectAll(){
		return biz.selectAll();
	}
	public Member selectOne(int no) {
		return biz.selectOne(no);
	}
	public int insert(Member m) {
		return biz.insert(m);
	}
	public int delete(int no) {
		return biz.delete(no);
	}
	public int update(Member m) {
		return biz.update(m);
	}
}
