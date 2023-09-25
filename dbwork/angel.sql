--angel 계정 연습
--전체 시퀀스 조회
SELECT * FROM seq;
--sequence 생성
CREATE SEQUENCE seq1 start with 1 INCREMENT by 1;
CREATE SEQUENCE seq2 start with 5 INCREMENT by 3; nocache


imtsert into test values (seq_test.nextval,'강호동','B'78.9,2000-10-10');
imtsert into test values (seq_test.nextval,'유재석','A'76.45,1990-11-09');
imtsert into test values (seq_test.nextval,'이영자','O'68.21,1980-05-08');

commit;

inser into test values;(seq_test.nextval,'김말동','B',56.78,'1989-09-09');

rollback;

update test set blood ='AB' where namw='강호동';

update test set weight=80.0,birthday=sysdate where num=7;

delete from test;
rollback;

--delete from in '7','9','10';
delete from test where num in (7,8,10);

drop table test;

drop sequence seq_test;

rollback;

creat table person(
num number(3) constraint person_pk_num primary key,
blood char(2)

alter table person drop constaint person_pk_num;


insert into person (name,blod,spring,score) values ('kee','o',90,34);

delete from student where num=2;

insert into student values (seq_stu.nextval, '영숙'.179.1,90,86,'햇님반');
insert into student values (seq_stu.nextval, '광수'.179.1,90,86,'별님반');
insert into student values (seq_stu.nextval, '영자'.179.1,90,86,'햇님반');

commit;

select name,ban,java,spring,java+spring total, (java+spring)/2 avg from student order by total desc;


create table stuinfo (
idx number(5) constraint stuinfo_px_idx primary key,
num number(5)
addr varchar2(20),
hp varchar2(20));

alter table stuinfo add constraint stuonfo_fk_num foreign key(num) references student(num);

insert inti=o stuinfo values (seq_stu,nextval,9,' 서울시 강남구','010-9898-7733');


insert inti=o stuinfo values (seq_stu,nextval,9,' 서울시 강남구','010-9898-7733');

insert inti=o stuinfo values (seq_stu,nextval,3,' 서울시 강남구','010-9898-7733');

--합쳐져서 나오게
where stu.num=info.num;

--개인정보가 등록 되어있지 않은 학생들을 출력해보자
--sub table(+) :   등록이 안된 컬럼은 null 값으로 출력

select
stu.name,stu.sprnig,stu.ban,infi,addr,info.hp
from student stu,stuinfo info
where stu.num-infi.num(+) and info.addr is null;

delete from student where num=3;

--student dml 3번 데이타를 지워보자
--자식 테이블(styinfo 의 num이 3인 데이타를 먼저 삭제후 student 삭제)

delete from stuinfo where num=3;
delete from student where num=3;

--부모 테이블 drop
drop table student;

문제
--시퀀스:seq_food 생성
--레스토랑의 메뉴 테이블 (테이블명 : food)
--food_num 숫자(5) 기본키, food_num 외부키 설정(csscsde 설정)
--person_name 문자열(10) : 고객명
--예약일 : bookingday : date 타입

--food 에 5개의 메뉴를 등록하자(스파게티,떡볶이 등등등..)
--주문한 고객정보를 추가해보자(같은 메뉴를 여러명 주문하기도 함..)
--메뉴중 스파게티를 삭제시 주문한 테이블에서도 지워지는지 확인
--조회 : 시퀀스,주문자명,음식명, 가격, 예약원(제목도 한글로 주기)

sum table = person table
alter table 
insert inti=o food values (seq_stu,nextval,5,' 스파게티','15000원');
insert inti=o food values (seq_stu,nextval,9,' 떡볶이','10000원');
insert inti=o food values (seq_stu,nextval,9,' 치킨','8000원');

delete from stuinfo where num=3;

select
f.food_num 메뉴번호,person_name 주줌자명


