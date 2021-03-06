drop table UD_Mas
create table UD_Mas(
file_id integer  not null  primary key ,
file_path varchar(255),
file_name varchar(255),
create_time date ,
update_time date
)
create sequence blog_id_sequence
increment by 1
start with 1
nomaxvalue
nocache;

create or replace trigger UD_Mas_auto
before insert on UD_Mas  /*触发条件：当向表dectuser执行插入操作时触发此触发器*/
 for each row     /*对每一行都检测是否触发*/
begin   /*触发器开始*/
select  blog_id_sequence.nextval into :new.file_id from dual;
/*触发器主题内容，即触发后执行的动作，在此是取得序列dectuser_tb_seq的下一个值插入到表dectuser中的userid字段中*/
end;


insert into UD_Mas (file_path,
file_name ) values ('asd','asd')
commit
