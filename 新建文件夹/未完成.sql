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
before insert on T_USER  /*���������������dectuserִ�в������ʱ�����˴�����*/
 for each row     /*��ÿһ�ж�����Ƿ񴥷�*/
begin   /*��������ʼ*/
select  t_user_ID.nextval into :new.user_id from dual;
/*�������������ݣ���������ִ�еĶ������ڴ���ȡ������dectuser_tb_seq����һ��ֵ���뵽��dectuser�е�userid�ֶ���*/
end;
drop table T_user
