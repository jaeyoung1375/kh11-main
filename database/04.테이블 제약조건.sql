-- day08에 있는 요금제 테이블에 조건을 부여해서 생성

create table plan(
telecom char(2) not null check(telecom in ('SK','KT','LG')),
name varchar2(60) not null unique,
price number not null check(price >= 0),
data number not null check(data >= 0),
call number not null check(call >= 0),
sms number not null check(sms >= 0)
);
-- 이상 데이터 추가 테스트
insert into plan(telecom,name,price,data,call,sms)
values(null,null,null,null,null,null);

insert into plan(telecom,name,price,data,call,sms)
values('GS', '5G 언택트 52', 52000, 200, 1000, 2000);

insert into plan(telecom,name,price,data,call,sms)
values('SK', '5G 언택트 52', -52000, 200, 1000, 2000);

-- 정상 데이터(unique 때문에 2번 추가는 안된다)
insert into plan(telecom,name,price,data,call,sms)
values('SK', '5G 언택트 52', 52000, 200, 1000, 2000);

-- day08의 메뉴 테이블
-- 1. 데이터를 있는 그대로 해석
create table menu(
name varchar2(30) not null unique,
type varchar2(9) not null check(type in ('음료','디저트')),
price number not null check(price >= 0),
event char(9) check(event = '행사중')
);
insert into menu(name, type, price, event)
values('아메리카노', '음료', 2500, '행사중');
insert into menu(name, type, price, event)
values('모카라떼', '음료', 3500, null);
insert into menu(name, type, price)
values('모카라떼', '음료', 3500);
insert into menu(name, type, price, event)
values('치즈케이크', '디저트', 5000, '행사중');
insert into menu(name, type, price)
values('마카롱', '디저트', 3000);
commit;

select * from menu;

-- 자바에서의 논리는 데이터베이스에서 0/1로 처리한다
-- 0은 false, 1은 true로 사용
drop table menu;
create table menu(
name varchar2(30) not null unique,
type varchar2(9) not null check(type in ('음료','디저트')),
price number not null check(price >= 0),
event char(1) not null check(event in ('0','1'))
);

insert into menu(name, type, price, event)
values('아메리카노', '음료', 2500, '1');
insert into menu(name, type, price, event)
values('모카라떼', '음료', 3500, '0');
insert into menu(name, type, price, event)
values('치즈케이크', '디저트', 5000, '1');
insert into menu(name, type, price, event)
values('마카롱', '디저트', 3000, '0');
commit;

select * from menu;





