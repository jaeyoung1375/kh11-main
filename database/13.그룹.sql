/*
    그룹(Group)
    - 어떤 기준을 두고 해당 기준에 따라 집합으로 구분하여 결과를 표시
    - OO별 이라고 할 경우 모두 그룹에 해당
    - 집계 함수와 결합하여 사용한다
*/

select * from product;

-- 분류별 OOO를 조회
select type from product;

select type, sum(price) 합계 from product group by type;
select type, avg(price) 평균 from product group by type;
select type, max(price) 최대 from product group by type;
select type, min(price) 최소 from product group by type;
select type, count(*) 개수 from product group by type;

select type, sum(price) 합계 from product group by type
order by 합계 desc;

-- 참고 : 중복제거
select distinct type from product;


-- 연도별 제품 개수를 출력
select extract(year from made) from product;
select extract(year from made) 연도 from product 
group by extract(year from made);

select 
    extract(year from made) 연도, 
    count(*) 개수, 
    sum(price) 합계,
    avg(price) 평균,
    max(price) 최대,
    min(price) 최소
from product 
    group by extract(year from made);

-- 등급별 회원 수를 출력
select 
    member_level, 
    count(*), 
    sum(member_point), 
    avg(member_point), 
    max(member_point), 
    min(member_point) 
from member group by member_level;

-- 그룹에는 having 키워드로 조건을 사용할 수 있다(그룹 성립 조건이므로 where와 다름)
select type, count(*) from product group by type having count(*) >= 3;

-- 그룹이 여러 항목일 경우에는 조회항목과 그룹에 각각 전부 작성하면 된다
select extract(year from made) 연도, type 분류, count(*) 개수 from product 
group by extract(year from made), type
order by 연도 asc, 개수 asc;
