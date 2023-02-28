-- day08 �޴��� �Ǹ����� ���̺�
drop table mobile;
create table mobile (
name varchar2(12) not null,
telecom char(2) not null check(telecom in ('SK','KT','LG')),
price number not null check(price >= 0),
month number(2) check(month in (24, 30, 36)),
unique(name, telecom)
);
insert into mobile(name,telecom,price,month) 
values('������22s', 'SK', 1800000, null);
insert into mobile(name,telecom,price,month) 
values('������22s', 'KT', 1750000, 24);
insert into mobile(name,telecom,price,month) 
values('������14', 'LG', 2000000, 30);
insert into mobile(name,telecom,price,month) 
values('������14', 'SK', 1990000, null);
commit;

select * from mobile;