-- 공지사항을 상단에 조회하고 나머지를 하단에 위치하도록 조회
-- 서로 다른 두 개의 조회 구문을 사용한 뒤 결과를 합침(집합연산)
-- UNION ALL - 합집합
-- UNION DISTINCT - 합집합에서 중복제거
-- INTERSECT - 교집합
-- MINUS - 차집합

create view board_notice as
select * from board where board_head = '공지' order by board_no desc;
create view board_other as
select * from board where board_head is null or board_head != '공지' order by board_no desc;

select * from board_notice
union all
select * from board_other;
