create table User (
	id int primary key,
	username varchar(20) unique not null,
	password varchar(20) not null,
	first_name varchar(30) not null,
	last_name varchar(30) not null,
	email varchar(30) not null
);
insert into User values(10001, 'mvc', '123456', 'm', 'vc', 'mvc@m24.com');
