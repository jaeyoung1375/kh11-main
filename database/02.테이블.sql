-- ���̺�(table)
-- �����Ͱ� ����Ǵ� ��ü
-- ǥ �����̴�

create table attendance(
no number(10),
name varchar2(21),
phone char(13)
);

drop table attendance;

-- day08 ������ ���̺�
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

-- day08 ���ϸ����̺�
CREATE TABLE POCKETMON(
NO NUMBER,--�Ⱦ��� �ڵ����� 38�ڸ��� ��
NAME VARCHAR2(21),
TYPE VARCHAR2(9)
);
DROP TABLE POCKETMON;

-- day08 �޴޸���Ʈ ���̺�
CREATE TABLE MEDALIST(
NAME VARCHAR2(21),
EVENT VARCHAR2(30),
TYPE CHAR(6),
GOLD NUMBER(2),
SILVER NUMBER(2),
BRONZE NUMBER(2)
);
DROP TABLE MEDALIST;






