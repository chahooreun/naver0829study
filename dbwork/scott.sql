--2023-09-20
--sal �� 1000~2000 ���� ���
SELECT ename,sal,comm from emp where sal>=1000 and sal<=2000; --���1
SELECT ename,sal,comm from emp where sal BETWEEN 1000 and 2000; --���2

--sal ��1000 -2000 �� �����ϰ� ���
SELECT ename,sal,comm from emp where sal not BETWEEN 1000 and 2000; --���1
SELECT ename,sal,comm from emp where sal<1000 or sal>2000; --���2

--comm �� null �� ����Ÿ ��ȸ
SELECT * from emp where comm is null;
-- comm�� null�� �ƴ� ������ ��ȸ
SELECT * from emp where comm is not null;
--comm �� null �ΰ�� 0���� ���, ������ ������ sal+comm�� ���Ѱ��� ���
SELECT ename,sal,comm,sal+comm from emp;--���� +null=null


--NVR(�÷��� ,��) : �ش� �÷����� null �̸� 0���� ���(mysql ���� insnull)
SELECT ename,sal,NVL(comm,0), sal+NVL(comm,0) from emp;--�÷��� �ָ�

--���߿� �ڹٷ� ������ ��� �÷��ε����� �÷������� ��������. �׷��� �÷����� �����Ѱ�� 
-- ��Ī�� �����Ѵ�
SELECT ename as "�����",sal as "����" from emp; -- "��Ī�� ���µ� �� ������ ���� ��� "" ��
SELECT ename ����� ,sal ���� from emp;
SELECT empno "��� ��ȣ",sal ���� from emp;-- ��Ī�� ������ �ִ°�� �ݵ�� ""�ȿ�(as�� ����)

SELECT ename �����,sal ����,NVL(comm,0)������,sal+NVL(comm,0) �ѿ��� from emp;

--�� �۰��� ���
SELECT COUNT(*) from emp;
SELECT COUNT(*) count from emp;

--���ڿ��� �̾ ��� ||
SELECT ename||'���� ������ '||job||'�Դϴ�' member from emp;

-- xx���� �ѿ����� xxx�Դϴ�(sal+comm,���ϰ�� 100���� ���, ������ ȸ������
SELECT ename||'���� ������ '||(sal+NVL(comm,100))||'�Դϴ�' ȸ������ from emp;

----empno ������ ��ȸ
SELECT empno,ename from emp where empno=7369 or empno=7788 or empno=7900;

--������ ��ȸ�� in �� ����غ���
SELECT empno,ename from emp where empno in (7369,7788,7900);

--���� 3���� empno �� �� ���
SELECT empno,ename from emp where empno not in(7369,7788,7900)

--ename,job�� ����ϴµ� job�� salesman�̰ų� analyst,manager 3���� ������ ���


