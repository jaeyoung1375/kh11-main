-- day08 휴대폰 판매정보 테이블
drop table mobile;
create table mobile (
name varchar2(12) not null,
telecom char(2) not null check(telecom in ('SK','KT','LG')),
price number not null check(price >= 0),
month number(2) check(month in (24, 30, 36)),
unique(name, telecom)
);
insert into mobile(name,telecom,price,month) 
values('갤럭시22s', 'SK', 1800000, null);
insert into mobile(name,telecom,price,month) 
values('갤럭시22s', 'KT', 1750000, 24);
insert into mobile(name,telecom,price,month) 
values('아이폰14', 'LG', 2000000, 30);
insert into mobile(name,telecom,price,month) 
values('아이폰14', 'SK', 1990000, null);
commit;

select * from mobile;