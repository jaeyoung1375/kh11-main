/*
    함수(function)
    - 특정 기능을 실행하는 코드 집합
    - 자바에서는 메소드라고 부름
    - 단일행 함수, 집계함수, 분석함수로 구분
*/

-- 단일행 함수 : 결과집합의 행마다 연산하는 함수
select member_id, upper(member_id) 대문자 from member;
select member_id, lower(member_id) 소문자 from member;

select * from member where instr(member_id, 'kh') > 0;
select * from member where instr(lower(member_id), lower('kh')) > 0;

-- 집계 함수 : 데이터를 종합하여 하나의 결과를 만드는 함수(합계,평균,개수,최대,최소)
-- (주의) 일반적인 항목과 같이 출력할 수 없다
select price from product;

select sum(price) 합계 from product;

-- select name, sum(price) 합계 from product;-- 개수가 맞지 않아 조회 불가

select avg(price) 평균 from product;
select max(price) 최대 from product;
select min(price) 최소 from product;
select count(price) 개수 from product;--가격이 몇 개 있는가?(null 제외)
select count(*) 개수 from product;--데이터가 몇 개 있는가?(null 포함)

select sum(price) 합계, avg(price) 평균 from product;

-- (Q) 가장 비싼 상품의 이름을 출력(product)
-- select name from product where price = max(price);

-- 서브 쿼리(sub query) - 구문을 중첩시켜 순차적으로 실행하도록 구성
select name from product 
where price = (select max(price) from product);


