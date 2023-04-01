create database clinica;
use clinica;
create table ambulatorio(
	nroa int primary key auto_increment,
    andar int not null,
    capacidade smallint
);

create table paciente(
	codp int primary key auto_increment,
    nome varchar(40) not null,
    idade smallint not null,
    cidade char(30),
    CPF varchar(11) unique not null,
    doenca varchar(40) not null
);
create table funcionario(
	codf int primary key auto_increment,
    nome varchar(40) not null,
    idade smallint,
    cidade varchar(30),
    salario decimal(10,2),
    cpf varchar(11) unique not null,
	cargo char(20)
);
create table medico(
	codm int primary key auto_increment,
    nome varchar(40) not null,
    idade smallint not null,
    especialidade char(20),
    cpf varchar(11) unique not null,
    fk_nroa int,
    foreign key(fk_nroa) references ambulatorio(nroa)
);

create table consulta(
	num_consulta int primary key auto_increment,
    data_consulta date,
    hora time,
    fk_codp int,
    foreign key(fk_codp) references paciente(codp),
    fk_codm int,
    foreign key(fk_codm) references medico(codm)
);

insert into ambulatorio(andar,capacidade) values
						(1,30),
                        (1,50),
                        (2,40),
                        (2,25),
                        (2,55)
;

select * from ambulatorio;
			