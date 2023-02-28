/*
    테이블 조인(Table Join)
    - 분리되어 있는 테이블을 특정 기준에 의해서 합치는 것
    - 합칠 때의 기준이 있어야 함
    - 연관이 있는 테이블을 합쳐야 한다
*/

-- 아래 코드는 의미가 없다
-- select * from pocketmon, student;

-- 연습용 테이블 생성(학원과 강의장)
create table academy(
academy_no number primary key,
academy_name varchar2(30) not null
);
create table room (
room_no number primary key,
room_name varchar2(30) not null,
room_size number not null,
academy_no references academy(academy_no) on delete cascade
);

insert into academy(academy_no, academy_name) values(100, 'KH 강남점');
insert into academy(academy_no, academy_name) values(200, 'KH 당산점');
insert into academy(academy_no, academy_name) values(300, 'KH 종로점');

insert into room(room_no, room_name, room_size, academy_no) values(1, 'A강의장', 10, 200);
insert into room(room_no, room_name, room_size, academy_no) values(2, 'B강의장', 20, 200);
insert into room(room_no, room_name, room_size, academy_no) values(3, 'C강의장', 20, 200);
insert into room(room_no, room_name, room_size, academy_no) values(4, '101호', 10, 100);
insert into room(room_no, room_name, room_size, academy_no) values(5, '102호', 10, 100);

commit;

-- INNER JOIN은 연결된 데이터만 조회가 가능하다
-- 구문 : select 항목 from A테이블 inner join B테이블 on 연결조건
-- (주의!) 중복되는 컬럼명을 제거하거나 별칭으로 변경해야 함

-- select * from academy+room;
select academy.*, room.room_no, room.room_name, room.room_size
from academy inner join room 
    on academy.academy_no = room.academy_no;

-- 별칭 추가
select A.*, R.room_no, R.room_name, R.room_size
from academy A inner join room R
    on A.academy_no = R.academy_no;

-- 문제 : 게시글 조회 시 회원 닉네임을 같이 조회
-- (문제점) 회원이 탈퇴하여 작성자가 null이 되면 조회가 이루어지지 않는다
-- (해결책) outer join 사용
select 
    B.* , M.member_nick
from board B inner join member M on B.board_writer = M.member_id;

-- OUTER JOIN 은 특정 테이블을 기준으로 하여 연관된 데이터를 합쳐 조회한다
-- 기준 테이블이 어느 위치에 있느냐에 따라 방향이 결정된다
-- A ← B 면 A left outer join B
-- A → B 면 A right outer join B
-- A ↔ B 면 A full outer join B
-- 기준 테이블은 연관 데이터가 없어도 모두 조회가 된다

-- ex : 학원을 기준으로 강의장 정보까지 조회
select A.*, R.room_no, R.room_name
from 
    academy A left outer join room R 
        on A.academy_no = R.academy_no;
        
-- ex : 학원 별 강의장 개수를 출력
-- (주의!) count(*)를 사용하면 null이 카운팅된다
select A.academy_name, count(R.room_no)
from academy A left outer join room R on A.academy_no = R.academy_no
group by A.academy_name;


-- 문제 : 회원별 게시글 작성 개수 출력
select M.member_id, M.member_nick, count(B.board_no) CNT
from member M left outer join board B on M.member_id = B.board_writer
group by M.member_id, M.member_nick
order by CNT desc;

-- 문제 : 포켓몬 정보와 이미지 번호를 출력
select P.*, IMG.attachment_no
from pocketmon P left outer join pocketmon_image IMG on P.no = IMG.pocketmon_no;

-- 문제 : 게시글 정보와 회원 닉네임, 프로필 이미지 번호를 조회
select B.*, M.member_nick, P.attachment_no
from board B
    left outer join member M on B.board_writer = M.member_id
    --left outer join member_profile P on B.board_writer = P.member_id;
    left outer join member_profile P on M.member_id = P.member_id;




