/*
    ����(delete)
    - �����ϴ� �����͸� ����� �۾�
    - �������� ������ ����Ƿ� commit / rollback �ʿ�
    - ������ ��κ� ���
    
    delete ���̺��̸� [����]
*/

-- ��ü ����
delete product;
-- delete from product;

-- (Q) 1�� ��ǰ ����
delete product where no = 1;

-- (Q) 2020�� ��ݱ⿡ ������ ��ǰ ������ ����
-- delete product where 2020�� ��ݱ�;
delete product 
where extract(year from made) = 2020 
    and extract(month from made) between 1 and 6;

delete product
where regexp_like(to_char(made, 'yyyy-mm'), '^2020-0[1-6]$');

delete product
where made between 
    to_date('2020-01-01 00:00:00', 'yyyy-mm-dd hh24:mi:ss')
    and
    to_date('2020-06-30 23:59:59', 'yyyy-mm-dd hh24:mi:ss');

select * from product;
rollback;