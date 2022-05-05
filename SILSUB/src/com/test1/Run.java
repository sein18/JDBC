package com.test1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.test1.Board;

public class Run {

	public static void main(String[] args) {
		List<Board> listb = new ArrayList<Board>();
		listb.add(new Board(1,"안녕하세요","홍길동",new Date(),"처음 작성 하는 글입니다.",1));
		listb.add(new Board(1,"반가워요","김유신",new Date(),"글은 처음으로 적어보네요.",3));
		listb.add(new Board(1,"가입했습니다.","이순신",new Date(),"만나서 반갑습니다 등럽",22));
		listb.add(new Board(1,"무슨일이죠?","유관순",new Date(),"접속이 잘 안되네요ㅠ",14));
		listb.add(new Board(1,"물어볼게 있습니다.","신사임당",new Date(),"탈퇴는 어떻게 하는건가요?",9));
		for(int i=0;i<listb.size();i++) {
			System.out.println(listb.get(i)); 
		}	}

}
