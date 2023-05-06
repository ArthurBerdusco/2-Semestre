create database turmab;

use turmab;

create table arquivo1(
	codigo int primary key auto_increment,
	nome varchar(50))
;

create table arquivo2(
	codigo int primary key auto_increment,
	nome varchar(50))
;

insert into arquivo1 (nome) values 
    ('Fernanda'),
	('Josefa'),
    ('Luiz'),
    ('Fernando'),
    ('Romulo');
    
insert into arquivo2 (nome) values 
    ('Carlos'),
	('Manuel'),
    ('Luiz'),
    ('Fernando'),
    ('Romulo');
    
select * from arquivo1;
select * from arquivo2;

select * from arquivo1
				inner join arquivo2 on arquivo1.nome = arquivo2.nome;

select * from arquivo1 as A
				inner join arquivo2 as B on A.nome = B.nome;

select A.nome, A.nome from arquivo1 as A
				inner join arquivo2 as B on A.nome = B.nome;
                
##LEFT JOIN

select A.nome, B.nome from arquivo1 as A
				left join arquivo2 as B on A.nome = B.nome;
                

select A.nome, B.nome from arquivo1 as A
				left join arquivo2 as B on A.nome = B.nome
                where B.nome is null;


##RIGTH JOIN

select A.nome, B.nome from arquivo1 as A
				right join arquivo2 as B on A.nome = B.nome;

select A.nome, B.nome from arquivo1 as A
				right join arquivo2 as B on A.nome = B.nome
                where B.nome is null;
                
#OUTER JOIN
select A.nome, B.nome from arquivo1 as A
				left outer join arquivo2 as B on A.nome = B.nome;
