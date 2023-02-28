-- 테이블(table)
-- 데이터가 저장되는 객체
-- 표 형태이다

create table attendance(
no number(10),
name varchar2(21),
phone char(13)
);

drop table attendance;

-- day08 월드컵 테이블
create table worldcup(
rank number(3),
name varchar2(39),
nation varchar2(15),
goal number(2)
);

CREATE TABLE WORLDCUP (
RANK NUMBER(3),
NAME VARCHAR2(39),
NATION VARCHAR2(15),
GOAL NUMBER(2)
);

DROP TABLE WORLDCUP;

-- day08 포켓몬테이블
CREATE TABLE POCKETMON(
NO NUMBER,--안쓰면 자동으로 38자리가 됨
NAME VARCHAR2(21),
TYPE VARCHAR2(9)
);
DROP TABLE POCKETMON;

-- day08 메달리스트 테이블
CREATE TABLE MEDALIST(
NAME VARCHAR2(21),
EVENT VARCHAR2(30),
TYPE CHAR(6),
GOLD NUMBER(2),
SILVER NUMBER(2),
BRONZE NUMBER(2)
);
DROP TABLE MEDALIST;






