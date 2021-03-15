create table T_USER
(
user_id Integer not null,
user_name NVARCHAR2(50),
user_pwd  Nvarchar2(64),
  u_token            NVARCHAR2(200),
  u_token_createtime DATE,
  u_token_overtime   DATE
)
create sequence t_user_ID
minvalue 1             
nomaxvalue           
increment by 1      
start with 1   
;

create or replace trigger t_user_ID_auto
before insert on T_USER  /*触发条件：当向表dectuser执行插入操作时触发此触发器*/
 for each row     /*对每一行都检测是否触发*/
begin   /*触发器开始*/
select  t_user_ID.nextval into :new.user_id from dual;
/*触发器主题内容，即触发后执行的动作，在此是取得序列dectuser_tb_seq的下一个值插入到表dectuser中的userid字段中*/
end;
drop table T_user
