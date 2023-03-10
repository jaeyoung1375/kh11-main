/* 
    데이터 추가
    - 데이터는 객체가 아니다(CREATE로 시작하지 않는다)
    - 테이블은 이미 생성되어 있어야 한다
    - 숫자는 따옴표를 붙이지 않는다(자바와 동일)
    - 문자열은 따옴표를 1개짜리로 설정한다(자바와 다름)
    
    INSERT INTO 테이블이름(집어넣을컬럼) VALUES(집어넣을값);
*/

INSERT INTO WORLDCUP(RANK, NAME, NATION, GOAL)
VALUES(1, '음바페', '프랑스', 8);
INSERT INTO WORLDCUP(RANK, NAME, NATION, GOAL)
VALUES(2, '리오넬 메시', '아르헨티나', 7);
insert into worldcup(rank, name, nation, goal)
values(3, '올리비에 지루', '프랑스', 4);
insert into worldcup(rank, name, nation, goal)
values(4, '훌리안 알바레스', '아르헨티나', 4);

-- 데이터 조회
SELECT * FROM WORLDCUP;

-- 포켓몬스터 데이터 추가
insert into pocketmon(no,name,type) values(1,'이상해씨','풀');
insert into pocketmon(no,name,type) values(4,'파이리','불꽃');
insert into pocketmon(no,name,type) values(7,'꼬부기','물');
insert into pocketmon(no,name,type) values(25,'피카츄','전기');

select * from pocketmon;

-- 메달리스트 데이터 추가
insert into medalist(name,event,type,gold,silver,bronze)
values('진종오','사격','하계',4,2,0);
insert into medalist(name,event,type,gold,silver,bronze)
values('김수녕','양궁','하계',4,1,1);
insert into medalist(name,event,type,gold,silver,bronze)
values('전이경','쇼트트랙','동계',4,0,1);

select * from medalist;

rollback;--현재까지의 작업내역을 무효화
commit;--현재까지의 작업내역을 최종저장


insert into worldcup(rank,name,nation,goal) 
values(null,null,null,null);






