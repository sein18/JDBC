drop table member;
create table member(
	M_NO INT AUTO_INCREMENT PRIMARY KEY,
	M_NAME VARCHAR(20) NOT NULL,
	M_AGE INT NOT NULL,
	M_GENDER VARCHAR(3) CHECK(M_GENDER IN('M','F')) NOT NULL,
	M_LOCATION VARCHAR(20),
	M_JOB VARCHAR(10),
	M_TEL VARCHAR(20),
	M_EMAIL VARCHAR(100)
);



INSERT INTO member VALUES(NULL,'박세인',19,'M','화성','강사','010-1234-5678','LEECJ@lee.com');
select *from member;

create table BOARD(
	no int primary key 글번호,
	title varchar(100) not null 제목,
	writer varchar(100) not null 작성자,
	content varchar(500) not null 내용,
	regdate date not null 날짜
);

drop table board;


 