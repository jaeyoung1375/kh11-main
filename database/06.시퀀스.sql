/*
    시퀀스(SEQUENCE)
    - 번호를 이용하여 데이터들을 구분해야 하는 경우 번호를 생성하는 도구
    - 한 번 발급한 번호는 절대로 다시 발급하지 않음
    
    생성 : CREATE SEQUENCE 이름 [옵션];
    사용 : 이름.NEXTVAL
    조회 : SELECT * FROM USER_SEQUENCES;
    삭제 : DROP SEQUENCE 이름;
*/

create sequence item_seq;
select * from user_sequences;

drop table item;
create table item (
--대표항목(not null+unique)
no number primary key,
name varchar2(60) not null check(regexp_like(name,'^[가-힣0-9]+$')),
type varchar2(15) not null,
price number not null check(price >= 0),
early char(1) not null check(early in ('0','1')),
event char(1) not null check(event in ('0','1'))
);

insert into item(no,name,type,price,early,event)
values(item_seq.nextval,'참이슬후레시','주류',1200,'1','1');
insert into item(no,name,type,price,early,event)
values(item_seq.nextval,'클라우드맥주','주류',3000,'0','1');
insert into item(no,name,type,price,early,event)
values(item_seq.nextval,'바나나킥','과자',1500,'0','1');
insert into item(no,name,type,price,early,event)
values(item_seq.nextval,'허니버터칩','과자',2000,'1','0');
commit;

select * from item;
