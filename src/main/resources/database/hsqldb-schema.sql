--create schema SCHEMA1 AUTHORIZATION shared;
--create schema AUTHORIZATION shared;
--set schema SCHEMA1; 

create table favorate (
	id int GENERATED BY DEFAULT AS IDENTITY (START WITH 1, INCREMENT BY 1) not null,
	name varchar(50),
	location varchar(50),
	address varchar(50),
	tel varchar(50),
	url varchar(50),
	constraint pk_favorate primary key (id)
);