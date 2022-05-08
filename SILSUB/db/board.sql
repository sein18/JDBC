drop table board;

create table BOARD(
	no int primary key  ,
	title varchar(100) not null  ,
	writer varchar(100) not null ,
	content varchar(500) not null  ,
	regdate date not null  
);

insert into board values(1,'안녕하세요','홍길동','처음 작성 하는 글입니다.',now());
insert into board values(2,'너무 반가워요','김유신','글은 처음으로 적어보네요.',now());
insert into board values(3,'가입했습니다.','이순신','만나서 반갑습니다 등업 부탁해요.',now());
insert into board values(4,'무슨일이죠?','유관순','접속이 잘 안되네요ㅠ 어쪄죠?',now());
insert into board values(5,'물어볼게 있습니다.','신사임당','탈퇴는 어떻게 하는건가요?',now());
select *from board;