/*
    조회(Read)
    - 미리 테이블에 넣어둔 데이터를 원하는 목적에 맞게 탐색
    - 조건, 그룹, 정렬
*/

create table product(
no number primary key,
name varchar2(30) not null,
type varchar2(15) check(type in ('과자','아이스크림','주류','사탕')),
price number,
made date,
expire date
);

insert into product values(1, '스크류바', '아이스크림', 1200, '2020-05-01', '2020-10-01');
insert into product values(2, '마이쮸', '사탕', 900, '2020-01-01', '2021-01-01');
insert into product values(3, '초코파이', '과자', 3000, '2020-01-01', '2021-01-01');
insert into product values(4, '맛동산', '과자', 2200, '2020-02-01', '2020-10-20');
insert into product values(5, '참이슬', '주류', 1000, '2020-01-05', '2020-04-05');
insert into product values(6, '처음처럼', '주류', 1000, '2020-03-15', '2020-08-15');
insert into product values(7, '바나나킥', '과자', 1500, '2020-05-03', '2020-06-03');
insert into product values(8, '빠삐코', '아이스크림', 1000, '2019-12-01', '2020-06-01');
insert into product values(9, '멘토스', '사탕', 1200, '2020-03-20', '2020-12-31');
insert into product values(10, '오레오', '과자', 2100, '2019-06-01', '2020-06-01');

commit;


-- 전체 데이터 조회
select * from product;

-- 특정 항목만 조회
select name from product;
select name,price from product;

-- 없는 항목은 조회할 수 없다
-- select name,price,point from product;

-- 모든 항목을 조회
select no,name,price,type,made,expire from product;
select * from product;

-- 계산한 항목을 추가로 조회
select name, made, expire, expire-made from product;

-- 에러 : 와일드카드는 단독으로만 사용 가능
-- select *, expire-made from product;

select product.*, expire-made from product;

-- 조건(필터) : 숫자, 문자열, 날짜
-- select * from product where 필터링조건;

-- 조건 1개
select * from product where price < 1000;

-- 조건이 2개 이상이라면 자바에서는 && , || 을 사용하여 처리
-- 오라클에서는 &&는 입력기호, ||는 문자열 덧셈기호라서 불가
-- 대신 알파벳 형태의 연산을 지원한다(and, or)
select * from product where price >= 1000 and price <= 2000;

-- (Q) 가격이 1000원 미만이거나 2000원 초과인 제품을 조회
select * from product where price < 1000 or price > 2000;

-- (주의) 오라클에서 같다는 = 1개로 처리한다
-- 번호가 5번인 상품을 조회
select * from product where no = 5;

-- 번호가 5번이 아닌 상품을 조회
select * from product where no != 5;
select * from product where no <> 5;

-- 문자열 조건 : 일치, 유사 검색
-- 유사 검색 명령이 2가지이므로 구분하여 사용할 수 있어야 한다
-- like는 %를 사용하여 패턴 검사를 하는 방식
-- instr은 특정 키워드가 몇 번째 위치에 존재하는지를 알아내는 방식
-- 전체적인 성능은 instr이 우세하지만 시작검사만큼은 like가 빠름

select * from product where name = '스크류바';

-- 이 경우는 like가 처리 속도가 빠름(시작검사)
select * from product where name like '스크류%';
select * from product where instr(name, '스크류') = 1;

-- 이 경우는 instr이 처리 속도가 빠름(시작검사 제외)
select * from product where name like '%이%';
select * from product where instr(name, '이') > 0;

-- (Q) 과자와 아이스크림을 조회
select * from product where type = '과자' or type = '아이스크림';
select * from product where type in ('과자', '아이스크림');

-- (Q) 과자와 주류 중에서 가격이 1000원 이상 2000원 이하인 제품 조회
select * from product 
where 
(type = '과자' or type = '주류')
and 
(price >= 1000 and price <= 2000);

select * from product 
where type in ('과자', '주류')
and 
(price >= 1000 and price <= 2000);

select * from product 
where type in ('과자', '주류')
and 
price between 1000 and 2000;

-- (Q) 이름에 '초코'가 들어있는 제품을 조회(instr 우세)
select * from product where name like '%초코%';
select * from product where instr(name, '초코') > 0;

-- (Q) 이름이 '바나나'로 시작하는 제품을 조회(like 우세)
select * from product where name like '바나나%';
select * from product where instr(name, '바나나') = 1;

-- (Q) 이름에 '이' 라는 글자가 들어있지 않은 제품을 조회
-- (참고) not은 부정연산 자리에 쓸 수 있는 영어 단어형 연산 기호
select * from product where name not like '%이%';
select * from product where instr(name, '이') = 0;

-- 날짜
-- 기본 형식은 YYYY-MM-DD HH24:MI:SS (자바와 약간 다름, 대소문자 구분안함)
-- 문자열 처럼도 사용할 수 있지만 국가마다 날짜 형식이 달라서 위험
-- 날짜용 명령들이 존재(to_char, to_date, extract)

-- extract는 날짜에서 원하는 항목을 숫자로 추출하는 명령이다
select name, made, extract(year from made) from product;

-- (ex) 2019년에 생산한 제품 조회
select * from product where extract(year from made) = 2019;

-- (Q) 여름(6, 7, 8월)에 생산한 제품 조회
select * from product 
where extract(month from made) = 6
    or extract(month from made) = 7
    or extract(month from made) = 8;
    
select * from product 
where extract(month from made) in (6, 7, 8);

select * from product 
where extract(month from made) between 6 and 8;

-- to_char 명령은 날짜를 원하는 서식의 문자열로 변경하는 명령
-- (자바의 SimpleDateFormat과 유사한 느낌이지만 대소문자는 구분하지 않음)
select name, made, to_char(made, 'yyyy-mm-dd hh24:mi:ss') from product;

-- (ex) 2019년에 생산한 제품 조회
select * from product where to_char(made, 'yyyy') = '2019';

-- (ex) 봄(3,4,5월)에 생산한 제품 조회
select * from product
where
    to_char(made, 'mm') = '03'
    or to_char(made, 'mm') = '04'
    or to_char(made, 'mm') = '05';

select * from product
where to_char(made, 'mm')  in ('03','04','05');

select * from product
where regexp_like(to_char(made, 'mm'), '^0[345]$');

-- 그냥 날짜 자체로 비교도 가능한가?

-- (ex) 2019년에 생산한 제품 조회 = 2019-01-01부터 2019-12-31까지

-- 문자열과 날짜를 혼용하면 국가나 지역에 따라 작동하지 않을 수 있다
-- select * from product where made >= '2019-01-01' and made <= '2019-12-31';

-- to_date를 사용하면 문자열을 날짜로 바꿀 수 있다(형식을 알려줘야 한다)
select * from product where made >= to_date('2019-01-01 00:00:00','yyyy-mm-dd hh24:mi:ss');
select * from product where made <= to_date('2019-12-31 23:59:59','yyyy-mm-dd hh24:mi:ss');

select * from product where
    made between to_date('2019-01-01 00:00:00','yyyy-mm-dd hh24:mi:ss') 
        and to_date('2019-12-31 23:59:59','yyyy-mm-dd hh24:mi:ss');

-- 날짜에서 sysdate라는 키워드는 현재시각에 대한 날짜 객체를 말한다

-- 최근 1년간 생산된 제품 조회
select * from product where made between sysdate-365 and sysdate;

-- 최근 5분간 내역 조회
select * from product where made between sysdate-5/24/60 and sysdate;


-- 정렬
-- 조회가 끝난 데이터를 원하는 순서대로 나열하는 작업
-- 오름차순(ascending, asc)과 내림차순(descending, desc)으로 구분
-- (주의) 정렬은 데이터가 확정된 이후에 해야한다

select * from product order by no asc;
select * from product order by price asc;
select * from product order by price desc;

-- 정렬은 마지막에!
-- select * from product order by price desc where price between 1000 and 2000;
select * from product where price between 1000 and 2000 order by price desc;

-- 만약 정렬 시 동일한 항목이 존재한다면, 하위 정렬 기준을 추가해야 한다
select * from product order by price desc, no asc;

-- (Q) 최근에 제조한 상품부터 출력
select * from product order by made desc, no asc;

-- (Q) 이름순으로 출력
select * from product order by name asc, no asc;

-- (Q) 과자와 주류 상품들을 가격이 비싼 순으로 출력
select * from product 
where type in ('과자', '주류') 
order by price desc, no asc;

-- (Q) 유통기한이 가장 짧은 상품부터 출력
select * from product order by expire-made asc, no asc;

select product.*, expire-made from product 
order by expire-made asc, no asc;

-- 조회하는 항목은 별칭을 붙여 원하는 이름으로 바꿀 수 있다
select product.*, expire-made 유통기한일수 from product 
order by 유통기한일수 asc, no asc;

-- 별칭에 띄어쓰기를 쓰고 싶다면 쌍따옴표로 감싼다
-- (참고) 자바에서 명령문을 만들 때에는 쓰기가 어렵다
select product.*, expire-made "유통 기한 일수" from product 
order by "유통 기한 일수" asc, no asc;









