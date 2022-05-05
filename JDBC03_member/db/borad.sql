create table BOARD(
	no int primary key 글번호,
	title varchar(100) not null 제목,
	writer varchar(100) not null 작성자,
	content varchar(500) not null 내용,
	regdate date not null 날짜
);

drop table board;