create database springbootjdbc;

use springbootjdbc;

create table tbl_employees (
                               id int primary key auto_increment,
                               name varchar(255) not null,
                               email varchar(255) not null,
                               department varchar(255) not null
);

insert into tbl_employees (name, email, department)
values('Guilherme', 'guilherme@gmail.com', 'IT');

insert into tbl_employees (name, email, department)
values('John', 'jonathan@gmail.com', 'Sales');