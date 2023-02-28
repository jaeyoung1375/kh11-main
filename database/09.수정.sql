/*
    ����(update)
    - �̹� �����ϴ� �����͸� ��ġ�� ��
    - commit / rollback�� ������ ����
    - ��ü�� �����ϴ� ���� ���� ����, ������ ���� ���ϴ� �׸��� �����Ѵ�
    - Ư�� PK(Primary key)�� �̿��Ͽ� �ϳ��� �׸� ��ġ�� ��찡 ���.
    
    update ���̺��̸� set �ٲܳ��� [����]
*/

-- ��� ��ǰ ������ 0������ ����
update product set price = 0;

-- 1�� ��ǰ�� ������ 1500������ ����
update product set price = 1500 where no = 1;

-- (Q) ��ũ������ ������ 2000������ ����
update product set price = 2000 where name = '��ũ����';

-- (Q) ���佺�� ������ 1000������ �����ϰ� �з��� ���ڷ� ����
update product set price = 1000, type = '����' where name = '���佺';

-- ���� ���� ó��(���� : ����Ŭ���� ���մ��� ������ ����)
-- (Q) ���� ���� 500�� ����
update product set price -= 500 where type = '����';

-- (Q) ���̽�ũ�� ���� 10% �λ�

select * from product;
rollback;