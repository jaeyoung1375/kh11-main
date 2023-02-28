-- day09 학원강의 요금표 문제
create table subject (
no number primary key,
name varchar2(60) not null,
period number not null check(mod(period, 30) = 0),
price number not null check(price >= 0),
type varchar2(12) not null check(type in ('온라인','오프라인','혼합'))
);
create sequence subject_seq;

insert into subject(no,name,period,price,type) 
values(subject_seq.nextval,'자바 마스터과정', 90, 1000000, '온라인');
insert into subject(no,name,period,price,type) 
values(subject_seq.nextval,'파이썬 기초', 60, 600000, '온라인');
insert into subject(no,name,period,price,type) 
values(subject_seq.nextval,'웹 개발자 단기완성', 120, 1200000, '오프라인');

commit;
select * from subject;
