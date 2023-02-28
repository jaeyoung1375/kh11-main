-- 뷰(View) - 자주 사용하는 조회 구문을 테이블화 시키는 도구
-- 논리 테이블 혹은 가상 테이블이라고 부름
-- 조회만 하고 등록,수정,삭제는 가급적 지양한다
create view pocketmon_stat as
select type, count(*) cnt from pocketmon group by type
order by cnt desc, type asc;

select * from pocketmon_stat;

-- subject 통계를 위한 view 
create or replace view subject_stat as
select type, avg(price) average, count(*) cnt from subject group by type;

select * from subject_stat order by cnt desc, average desc;

-- member 통계
create view member_stat as
select 
    member_level,
    count(*) cnt,
    sum(member_point) total,
    avg(member_point) average,
    max(member_point) max,
    min(member_point) min
from member group by member_level;




