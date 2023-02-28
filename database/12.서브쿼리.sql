/*
    서브 쿼리의 사용
*/

-- (Q) 가장 최근에 만든 상품 정보
-- 1. 가장 마지막 시간을 구하고 그와 같은 상품을 조회하라
select * from product 
where made = (select max(made) from product);

-- 2. 상품을 최신순으로 정렬하고 첫번째를 조회하라
-- 결과의 순서에 해당하는 항목을 알아야 함(rownum)
select product.*, rownum from product;
select product.*, rownum from product order by made desc;

select TMP.*, rownum from (
    select product.* from product order by made desc
) TMP;

select TMP.*, rownum from (
    select product.* from product order by made desc
) TMP where rownum=1;

select TMP.*, rownum from (
    select product.* from product order by made desc
) TMP where rownum between 1 and 3;

-- (Q) 가장 먼저 가입한 회원 정보

-- 1. 집계 함수 사용
select * from member 
where member_join = (select min(member_join) from member);

-- 2. rownum 사용
select TMP.*, rownum from(
    select * from member order by member_join asc
)TMP where rownum = 1;

-- rownum을 연구하면 페이징 처리가 가능하다
select TMP.*, rownum from(
    select * from member order by member_join asc
)TMP where rownum between 1 and 10;

-- rownum은 반드시 1부터 부여된다(1번부터 조회하지 않으면 나오지 않는다)
select TMP.*, rownum from(
    select * from member order by member_join asc
)TMP where rownum between 2 and 10;

-- 최종 구문(정렬 후 번호 붙인 뒤 조회) - Top N Query
select * from (
    select TMP.*, rownum RN from(
        select * from member order by member_join asc
    )TMP
) where RN between 2 and 10;


-- 공식
select * from (
    select TMP.*, rownum RN from(
        -- 조회 구문
    )TMP
) where RN between 시작 and 종료;

-- 가격 순으로 상품 3개 조회
select * from (
    select TMP.*, rownum RN from(
        select * from product order by price desc
    )TMP
) where RN between 1 and 3;

-- 포켓몬 번호순으로 5개 조회
select * from (
    select TMP.*, rownum RN from(
        select * from pocketmon order by no asc
    )TMP
) where RN between 1 and 5;

-- 학생 성적순으로 2등, 3등을 조회
select * from (
    select TMP.*, rownum RN from(
        select * from student order by (korean+english+math) desc        
    )TMP
) where RN between 2 and 3;




