/* 
    ������ �߰�
    - �����ʹ� ��ü�� �ƴϴ�(CREATE�� �������� �ʴ´�)
    - ���̺��� �̹� �����Ǿ� �־�� �Ѵ�
    - ���ڴ� ����ǥ�� ������ �ʴ´�(�ڹٿ� ����)
    - ���ڿ��� ����ǥ�� 1��¥���� �����Ѵ�(�ڹٿ� �ٸ�)
    
    INSERT INTO ���̺��̸�(��������÷�) VALUES(���������);
*/

INSERT INTO WORLDCUP(RANK, NAME, NATION, GOAL)
VALUES(1, '������', '������', 8);
INSERT INTO WORLDCUP(RANK, NAME, NATION, GOAL)
VALUES(2, '������ �޽�', '�Ƹ���Ƽ��', 7);
insert into worldcup(rank, name, nation, goal)
values(3, '�ø��� ����', '������', 4);
insert into worldcup(rank, name, nation, goal)
values(4, '�Ǹ��� �˹ٷ���', '�Ƹ���Ƽ��', 4);

-- ������ ��ȸ
SELECT * FROM WORLDCUP;

-- ���ϸ��� ������ �߰�
insert into pocketmon(no,name,type) values(1,'�̻��ؾ�','Ǯ');
insert into pocketmon(no,name,type) values(4,'���̸�','�Ҳ�');
insert into pocketmon(no,name,type) values(7,'���α�','��');
insert into pocketmon(no,name,type) values(25,'��ī��','����');

select * from pocketmon;

-- �޴޸���Ʈ ������ �߰�
insert into medalist(name,event,type,gold,silver,bronze)
values('������','���','�ϰ�',4,2,0);
insert into medalist(name,event,type,gold,silver,bronze)
values('�����','���','�ϰ�',4,1,1);
insert into medalist(name,event,type,gold,silver,bronze)
values('���̰�','��ƮƮ��','����',4,0,1);

select * from medalist;

rollback;--��������� �۾������� ��ȿȭ
commit;--��������� �۾������� ��������


insert into worldcup(rank,name,nation,goal) 
values(null,null,null,null);






