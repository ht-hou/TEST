
create sequence file_key
minvalue 1
maxvalue 99999
start with 1
increment by 1 
cache 10 ;


create table testfile(
id char(10)not null primary key,
username char(30),
name char(50),
url char(100)
)


create or replace trigger table1_file_key
before insert on testfile for each row
begin
select file_key.nextval into:new.id from dual;
end;
