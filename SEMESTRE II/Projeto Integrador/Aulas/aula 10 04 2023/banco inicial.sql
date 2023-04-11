create database basenotafiscal;
use basenotafiscal;

create table notafiscal(
	idNota int auto_increment,
    numeroNota INT NOT NULL,
    valorNota DOUBLE NOT NULL,
    primary key (idNota)
);

select * from notafiscal;