--angel ���� ����
--��ü ������ ��ȸ
SELECT * FROM seq;
--sequence ����
CREATE SEQUENCE seq1 start with 1 INCREMENT by 1;
CREATE SEQUENCE seq2 start with 5 INCREMENT by 3; nocache


imtsert into test values (seq_test.nextval,'��ȣ��','B'78.9,2000-10-10');
imtsert into test values (seq_test.nextval,'���缮','A'76.45,1990-11-09');
imtsert into test values (seq_test.nextval,'�̿���','O'68.21,1980-05-08');

commit;

inser into test values;(seq_test.nextval,'�踻��','B',56.78,'1989-09-09');

rollback;

update test set blood ='AB' where namw='��ȣ��';

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

insert into student values (seq_stu.nextval, '����'.179.1,90,86,'�޴Թ�');
insert into student values (seq_stu.nextval, '����'.179.1,90,86,'���Թ�');
insert into student values (seq_stu.nextval, '����'.179.1,90,86,'�޴Թ�');

commit;

select name,ban,java,spring,java+spring total, (java+spring)/2 avg from student order by total desc;


create table stuinfo (
idx number(5) constraint stuinfo_px_idx primary key,
num number(5)
addr varchar2(20),
hp varchar2(20));

alter table stuinfo add constraint stuonfo_fk_num foreign key(num) references student(num);

insert inti=o stuinfo values (seq_stu,nextval,9,' ����� ������','010-9898-7733');


insert inti=o stuinfo values (seq_stu,nextval,9,' ����� ������','010-9898-7733');

insert inti=o stuinfo values (seq_stu,nextval,3,' ����� ������','010-9898-7733');

--�������� ������
where stu.num=info.num;

--���������� ��� �Ǿ����� ���� �л����� ����غ���
--sub table(+) :   ����� �ȵ� �÷��� null ������ ���

select
stu.name,stu.sprnig,stu.ban,infi,addr,info.hp
from student stu,stuinfo info
where stu.num-infi.num(+) and info.addr is null;

delete from student where num=3;

--student dml 3�� ����Ÿ�� ��������
--�ڽ� ���̺�(styinfo �� num�� 3�� ����Ÿ�� ���� ������ student ����)

delete from stuinfo where num=3;
delete from student where num=3;

--�θ� ���̺� drop
drop table student;

����
--������:seq_food ����
--��������� �޴� ���̺� (���̺�� : food)
--food_num ����(5) �⺻Ű, food_num �ܺ�Ű ����(csscsde ����)
--person_name ���ڿ�(10) : ����
--������ : bookingday : date Ÿ��

--food �� 5���� �޴��� �������(���İ�Ƽ,������ ����..)
--�ֹ��� �������� �߰��غ���(���� �޴��� ������ �ֹ��ϱ⵵ ��..)
--�޴��� ���İ�Ƽ�� ������ �ֹ��� ���̺����� ���������� Ȯ��
--��ȸ : ������,�ֹ��ڸ�,���ĸ�, ����, �����(���� �ѱ۷� �ֱ�)

sum table = person table
alter table 
insert inti=o food values (seq_stu,nextval,5,' ���İ�Ƽ','15000��');
insert inti=o food values (seq_stu,nextval,9,' ������','10000��');
insert inti=o food values (seq_stu,nextval,9,' ġŲ','8000��');

delete from stuinfo where num=3;

select
f.food_num �޴���ȣ,person_name �����ڸ�


