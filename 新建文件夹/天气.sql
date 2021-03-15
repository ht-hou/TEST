
create sequence seq_city
minvalue 1
maxvalue 99999
start with 1
increment by 1 
cache 10 ;

create table city
(
id varchar(5) not null primary key ,
pid varchar(5) not null  ,
city_code char(9),
city_name varchar(100)
)

create table city_now_weather 
(
id varchar (30) not null ,
shidu varchar(30),
pm25 varchar (30),
pm10 varchar(30),
quality varchar(30),
wendu varchar(30),
ganmao varchar (255)
);
create table city_more_weather
(
id varchar (30) not null,
weather_date varchar(30),
high varchar (30),
low varchar (30),
ymd varchar(30),
week varchar(30),
sunrise varchar (30),
sunset varchar (30),
aqi varchar (30),
fx varchar (30),
fl varchar (30),
type char (30),
notice varchar (255)
)
drop table city;
drop table city_now_weather;

drop table city_more_weather;
