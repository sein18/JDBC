create table BOARD(
	no int primary key  ,
	title varchar(100) not null  ,
	writer varchar(100) not null ,
	content varchar(500) not null  ,
	regdate date not null  
);

drop table board;