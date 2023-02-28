-- day08�� �ִ� ����� ���̺� ������ �ο��ؼ� ����

create table plan(
telecom char(2) not null check(telecom in ('SK','KT','LG')),
name varchar2(60) not null unique,
price number not null check(price >= 0),
data number not null check(data >= 0),
call number not null check(call >= 0),
sms number not null check(sms >= 0)
);
-- �̻� ������ �߰� �׽�Ʈ
insert into plan(telecom,name,price,data,call,sms)
values(null,null,null,null,null,null);

insert into plan(telecom,name,price,data,call,sms)
values('GS', '5G ����Ʈ 52', 52000, 200, 1000, 2000);

insert into plan(telecom,name,price,data,call,sms)
values('SK', '5G ����Ʈ 52', -52000, 200, 1000, 2000);

-- ���� ������(unique ������ 2�� �߰��� �ȵȴ�)
insert into plan(telecom,name,price,data,call,sms)
values('SK', '5G ����Ʈ 52', 52000, 200, 1000, 2000);

-- day08�� �޴� ���̺�
-- 1. �����͸� �ִ� �״�� �ؼ�
create table menu(
name varchar2(30) not null unique,
type varchar2(9) not null check(type in ('����','����Ʈ')),
price number not null check(price >= 0),
event char(9) check(event = '�����')
);
insert into menu(name, type, price, event)
values('�Ƹ޸�ī��', '����', 2500, '�����');
insert into menu(name, type, price, event)
values('��ī��', '����', 3500, null);
insert into menu(name, type, price)
values('��ī��', '����', 3500);
insert into menu(name, type, price, event)
values('ġ������ũ', '����Ʈ', 5000, '�����');
insert into menu(name, type, price)
values('��ī��', '����Ʈ', 3000);
commit;

select * from menu;

-- �ڹٿ����� ���� �����ͺ��̽����� 0/1�� ó���Ѵ�
-- 0�� false, 1�� true�� ���
drop table menu;
create table menu(
name varchar2(30) not null unique,
type varchar2(9) not null check(type in ('����','����Ʈ')),
price number not null check(price >= 0),
event char(1) not null check(event in ('0','1'))
);

insert into menu(name, type, price, event)
values('�Ƹ޸�ī��', '����', 2500, '1');
insert into menu(name, type, price, event)
values('��ī��', '����', 3500, '0');
insert into menu(name, type, price, event)
values('ġ������ũ', '����Ʈ', 5000, '1');
insert into menu(name, type, price, event)
values('��ī��', '����Ʈ', 3000, '0');
commit;

select * from menu;





