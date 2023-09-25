--PL-SQL�̶�?
--SQL �� ������ ����Ҹ� �߰��ؼ� ���α׷����Ѱ��� PL-SQL �̶�� �Ѵ�
--����1
DECLARE
--���� ���� �ϴ� ����
v_no NUMBER(4,1); --4�ڸ��� �Ҽ������� 1�ڸ� ���� �ִ� ���� ����
BEGIN
--SQL������ PL-SQL ������ �ڵ��ϴ� ����

--sql�����̳� pl-sql������ �ڵ��ϴ� ����
v_no:=12.7;
dbms_output.put_line(v_no);--���

END;
/
DECLARE--����2

vname varchar2(20);
vban varchar2(20);
BEGIN
SELECT
name,ban
into vname,vban
from student where num=1;
dbms_output.put_line(vname||'����'||vban||'�Դϴ�');
END;
/

--person��food���̺��� �����Ͽ�person_sum�� 9�λ���� �̸�, �ֹ��� �޴�,������ ����Ͻÿ�
DECLARE--���� 3
vperson varchar2(20);
vfood varchar2(20);

BEGIN
SELECT person_name,fname,fprice
into vname,vfood,vprice
from food f,person p
where f.food_num=p.food+num and person_num=9;
dbms_output.put_line('�ֹ���'||vname);
dbms_output.put_line('�޴�'||vfood);
dbms_output.put_line('����'||vprice);

END;
/
DECLARE--����4--��ǰ���� ������ �������� �ش� ��ǰ���� ���ݰ� ������ ���
vsangpum VARCHAR2(20) :='üũ����';
vcolor VARCHAR2(20);
vprice number(7);
BEGIN
SELECT snag_price,sang_color
into vprice,vcolor,vprice2
from shop where san_name=vsangpum;

dbms_output.put_line('��ǰ��'||vname);
dbms_output.put_line('����'||vfood);
dbms_output.put_line('�ܰ�'||vprice);
dbms_output.put_line('�ܰ�'||vprice2);

END;
/

/*
if ���ǽ� then
    ����1;
    else
    ����2'
    end if;
    
    ���� if��
    if ���ǽ�1 then
    ����1;
    elsif ����2 then
    ����2;
    ...
    end if;
    
    DECLARE
    v_sno number(3) :=20;
    v_shop angel.shop%rowtype;
BEGIN
    select * into v shop
    fro shop where sang_no=v_sno;
    
    DBMS Output_put_line('��ǰ��:'||v shop.sang_name);
    DBMS Output_put_line('��ȸ�� ���హ��:'||sql%rowcount);--1
    
    --student �� java ���� �����ϱ�
    update student set java=99;
    DBMS Output_put_line('���హ��:'||sql%rowcount);--3
END;
/

--���� ���ڵ� ��ȸ
--���� 13
DECLARE
    Cursor s1
    is
    select * from shop;
    
BEGIN
    

dbms_output.put_line(' ��ǰ��ȣ ��ǰ�� ���� ����');
dbms_output.put_line(' -------------------------');
for s in s1 loop
    exit when s1%notfound;--���̻� �����Ͱ� ������ ����������
    dbms_output.put_line(s.sang_no||'  '||s.sang_price);
    end loop;
END;
/


--����14
--��ǳ��,����,������ �Է��ϸ� �������غ���
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
dbms_output.put_line('��ǰ������ �߰��߽��ϴ�');


END;
/

--���� : food ���̺�
-- fname,fprice, no �Է��� �޾Ƽ�
--no �� 1 �̸� fname,fprice �� ����Ÿ �߰��ϰ�
--no �� 2�� food ��ü ����Ÿ ���

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
    DBMS_OUTPUT.PUT_LINE('�����Ͱ� ���������� �߰��Ǿ����ϴ�.');
  ELSIF v_no = 2 THEN
    
    FOR rec IN (SELECT * FROM food) LOOP
      DBMS_OUTPUT.PUT_LINE('fname: ' || rec.fname || ', fprice: ' || rec.fprice);
    END LOOP;
  ELSE
    DBMS_OUTPUT.PUT_LINE('�߸��� ��ȣ�Դϴ�.');
  END IF;
END;
/

