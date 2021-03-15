select * from student where class_no='c002' and s_Sex='Ů';

select to_char(s_birthday,'yyyy-mm-dd') from student 

select * from student where s_score+s_addf between 550 and 900

select * from student where S_name like '%С%'

select * from student order by (s_score+s_addf )

select * from student where s_score>(
select Avg(s_score) from student
)
