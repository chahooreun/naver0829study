select 
e.name,e.job.sal,d.dname,d.loc
from emp e,dept d
where e.deptno=d.deptno;