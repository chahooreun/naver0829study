--system �������� ������ ������ Ȯ���ϱ�, ���ٸ� ������ ��Ʈ��+����
select username,account_status from dba_users;--user��, ��� �������� Ȯ��

--scott ������ ��ݻ��·� �����غ���
alter user scott account lock;

--scott ������ lock �� Ǯ���
alter user scott account unlock;

-- angel ������ ������(��� a1234)
create user angel IDENTIFIED by a1234; -- ���� ����, c##�� �پ�߸� �Ѵ�
create user C##angel IDENTIFIED by a1234;--���������� ����

--������ ������ �����Ϸ���
drop user C##angel;

--C##�� �Ⱥ��̰� ������ �����Ϸ��� ������ �������� �����ؾ߸� �Ѵ�
alter session set "_ORACLE_SCRIPT"=true;
create user angel IDENTIFIED by a1234;

--������ ��߸� ���Ӱ� ����Ÿ ���� ����
GRANT CONNECT,RESOURCE TO angel;

--angel �� ���̺��� �����Ҽ� �ֵ���  tablespace ���
alter user angel DEFAULT TABLESPACE users QUOTA UNLIMITED ON users;
