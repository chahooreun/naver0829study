--PL-SQL이란?
--SQL 언어에 절차적 언어요소를 추가해서 프로그래밍한것을 PL-SQL 이라고 한다
--예제1
DECLARE
--변수 선언 하는 영역
v_no NUMBER(4,1); --4자리에 소숫점이하 1자리 값을 넣는 변수 선언
BEGIN
--SQL구문인 PL-SQL 문으로 코딩하는 영역

--sql구문이나 pl-sql문으로 코딩하는 영역
v_no:=12.7;
dbms_output.put_line(v_no);--출력

END;
/
DECLARE--예제2

vname varchar2(20);
vban varchar2(20);
BEGIN
SELECT
name,ban
into vname,vban
from student where num=1;
dbms_output.put_line(vname||'님은'||vban||'입니다');
END;
/

--person과food테이블을 조인하여person_sum이 9인사람의 이름, 주문한 메뉴,가격을 출력하시오
DECLARE--예제 3
vperson varchar2(20);
vfood varchar2(20);

BEGIN
SELECT person_name,fname,fprice
into vname,vfood,vprice
from food f,person p
where f.food_num=p.food+num and person_num=9;
dbms_output.put_line('주문자'||vname);
dbms_output.put_line('메뉴'||vfood);
dbms_output.put_line('가격'||vprice);

END;
/
DECLARE--예제4--상품명을 변수에 저장한후 해당 상품명의 가격과 색상을 출력
vsangpum VARCHAR2(20) :='체크자켓';
vcolor VARCHAR2(20);
vprice number(7);
BEGIN
SELECT snag_price,sang_color
into vprice,vcolor,vprice2
from shop where san_name=vsangpum;

dbms_output.put_line('상품명'||vname);
dbms_output.put_line('색상'||vfood);
dbms_output.put_line('단가'||vprice);
dbms_output.put_line('단가'||vprice2);

END;
/

/*
if 조건식 then
    문장1;
    else
    문장2'
    end if;
    
    다중 if문
    if 조건식1 then
    문장1;
    elsif 조건2 then
    문장2;
    ...
    end if;
    
    DECLARE
    v_sno number(3) :=20;
    v_shop angel.shop%rowtype;
BEGIN
    select * into v shop
    fro shop where sang_no=v_sno;
    
    DBMS Output_put_line('상품명:'||v shop.sang_name);
    DBMS Output_put_line('조회된 실행갯수:'||sql%rowcount);--1
    
    --student 의 java 점수 변경하기
    update student set java=99;
    DBMS Output_put_line('실행갯수:'||sql%rowcount);--3
END;
/

--여러 레코드 조회
--예제 13
DECLARE
    Cursor s1
    is
    select * from shop;
    
BEGIN
    

dbms_output.put_line(' 상품번호 상품명 색상 가격');
dbms_output.put_line(' -------------------------');
for s in s1 loop
    exit when s1%notfound;--더이상 데이터가 없으면 빠져나간다
    dbms_output.put_line(s.sang_no||'  '||s.sang_price);
    end loop;
END;
/


--예제14
--상풍명,색상,가격을 입력하며 나오게해보자
accept isang prompt 'sangpum?';
accept icolor prompt 'color?;
accept iprice prompt 'price?';
DECLARE
    v_sang shop.sang_name%TYPE='&isang';
     v_color shop.sang_color%TYPE='&icolor';
      v_price shop.sang_price%TYPE='&iprice';
BEGIN
    insert into shop values (seq_shop.nextval,v_sang,v_price,volor);
    commit;
dbms_output.put_line('상품정보를 추가했습니다');


END;
/

--문제 : food 테이블
-- fname,fprice, no 입력을 받아서
--no 가 1 이면 fname,fprice 로 데이타 추가하고
--no 가 2면 food 전체 데이타 출력

DECLARE
  v_fname VARCHAR2(100);
  v_fprice NUMBER;
  v_no NUMBER;
BEGIN
 
  v_no := &no;
  IF v_no = 1 THEN
    
    v_fname := '&fname';
    v_fprice := &fprice;

    
    INSERT INTO food (fname, fprice) VALUES (v_fname, v_fprice);

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('데이터가 성공적으로 추가되었습니다.');
  ELSIF v_no = 2 THEN
    
    FOR rec IN (SELECT * FROM food) LOOP
      DBMS_OUTPUT.PUT_LINE('fname: ' || rec.fname || ', fprice: ' || rec.fprice);
    END LOOP;
  ELSE
    DBMS_OUTPUT.PUT_LINE('잘못된 번호입니다.');
  END IF;
END;
/

