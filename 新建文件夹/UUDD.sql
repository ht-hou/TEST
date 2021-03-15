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
before insert on UD_Mas  /*���������������dectuserִ�в������ʱ�����˴�����*/
 for each row     /*��ÿһ�ж�����Ƿ񴥷�*/
begin   /*��������ʼ*/
select  blog_id_sequence.nextval into :new.file_id from dual;
/*�������������ݣ���������ִ�еĶ������ڴ���ȡ������dectuser_tb_seq����һ��ֵ���뵽��dectuser�е�userid�ֶ���*/
end;


insert into UD_Mas (file_path,
file_name ) values ('asd','asd')
commit
