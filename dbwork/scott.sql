--2023-09-20
--sal 이 1000~2000 사이 출력
SELECT ename,sal,comm from emp where sal>=1000 and sal<=2000; --방법1
SELECT ename,sal,comm from emp where sal BETWEEN 1000 and 2000; --방법2

--sal 이1000 -2000 을 제외하고 출력
SELECT ename,sal,comm from emp where sal not BETWEEN 1000 and 2000; --방법1
SELECT ename,sal,comm from emp where sal<1000 or sal>2000; --방법2

--comm 이 null 인 데이타 조회
SELECT * from emp where comm is null;
-- comm이 null이 아닌 데이터 조회
SELECT * from emp where comm is not null;
--comm 이 null 인경우 0으로 출력, 마지막 갈림에 sal+comm을 더한값을 출력
SELECT ename,sal,comm,sal+comm from emp;--숫자 +null=null


--NVR(컬럼명 ,값) : 해당 컬럼값이 null 이면 0으로 출력(mysql 에는 insnull)
SELECT ename,sal,NVL(comm,0), sal+NVL(comm,0) from emp;--컬러명 주목

--나중에 자바로 가져갈 경우 컬럼인덱스나 컬럼명으로 가져간다. 그래서 컬럼명이 복잡한경우 
-- 별칭을 지정한다
SELECT ename as "사원명",sal as "연봉" from emp; -- "별칭을 쓰는데 단 공백이 없을 경우 "" 생
SELECT ename 사원명 ,sal 연봉 from emp;
SELECT empno "사원 번호",sal 연봉 from emp;-- 별칭에 공백이 있는경우 반드시 ""안에(as는 생략)

SELECT ename 사원명,sal 연봉,NVL(comm,0)수수료,sal+NVL(comm,0) 총연봉 from emp;

--총 글갯수 출력
SELECT COUNT(*) from emp;
SELECT COUNT(*) count from emp;

--문자열을 이어서 출력 ||
SELECT ename||'님의 직업은 '||job||'입니다' member from emp;

-- xx님의 총연봉은 xxx입니다(sal+comm,널일경우 100으로 계산, 제목은 회원연봉
SELECT ename||'님의 연봉은 '||(sal+NVL(comm,100))||'입니다' 회원연봉 from emp;

----empno 여러개 조회
SELECT empno,ename from emp where empno=7369 or empno=7788 or empno=7900;

--여러개 조회시 in 을 사용해보자
SELECT empno,ename from emp where empno in (7369,7788,7900);

--위에 3개의 empno 을 빽 출력
SELECT empno,ename from emp where empno not in(7369,7788,7900)

--ename,job을 출력하는데 job이 salesman이거나 analyst,manager 3개의 직업만 출력


