
select * from emp

select * from emp where empno = 7369

select * from emp where sal >1000

select * from emp where sal between 1000 and 2000

select * from emp where comm is not null

select * from emp where not comm is null

select * from emp where empno not in (7844,7499)

select * from emp where ename like '_A%'

select * from emp where deptno = 30 order by hiredate ,EMPNO desc

select upper('laowang') from dual

select lower('SLD') from dual

select sysdate+11 from dual

select systimestamp+11 from dual

select to_date('20200808','yyyy-MM-dd') from dual

select EMPNO,ENAME ,(sal+nvl(comm,0))*12 from emp 

select decode(1,1,'a',2,'as',3,'asd',5) from dual

select rownum rm,emp.* from emp where rownum <11

select * from(select rownum rm,emp.* from emp where rownum <7) temp 
where temp.rm>=4

select * from mydept
drop table mydept
create table mydept as select * from dept
max(rowid)
select * from mydept where deptno = 10
insert into mydept  values(10,'ACCOUNTING','NEW YORK')


delete 
from mydept me
where me.rowid > (
select  min(rowid) 
from mydept 
where deptno = 10 
)
and me.deptno = 10 ; 
-------------------------------------------------

create sequence s001

select * from user_sequences

select s001.nextval from dual

select s001.currval from dual

  create  table person(
     pid number(10),
     pname varchar2(255)
   )

select * from person

insert into person values(s002.nextval,'asd')

drop sequence s002

create sequence s002
increment by 2

create  view v001 as 
select * from  emp where deptno = 20 ;  

select * from v001

update v001 set ename='jONES' where empno = 7566

create  view v002 as 
select * from  emp where deptno = 20 
with read only;  

grant create view to scott

select * from v002

update v002 set ename='JONES' where empno = 7566

select * from emp 

create index emp_sal_ind on emp(sal)

select * from emp where sal >1500

drop index emp_sal_ind

create synonym em for emp

grant create synonym to scott

select * from em


   create  table p1(
     pid number(10),
     pname varchar2(255)
   );
--  ´´½¨±ílog_p1
   create  table  log_p1(
     pid number(10),
     pname varchar2(255)
   )

select * from p1
select * from log_p1

create or replace trigger t1
before
insert
on p1 
for each row 
  begin
     insert into log_p1 values (:new.pid,:new.pname);
  end;

insert into p1 values(1002,'a')

create or replace trigger t2
before
delete
on p1
for each row
  begin
    insert into log_p1 values (:old.pid,:old.pname);
  end;
delete from p1 where pid = 1001

create or replace trigger t3
before 
update
on p1
for each row 
  begin
    insert into log_p1 values (:new.pid,:new.pname);
    insert into log_p1 values (:old.pid,:old.pname);
  end;
  update p1 set pname='sd'where pid = 1002
