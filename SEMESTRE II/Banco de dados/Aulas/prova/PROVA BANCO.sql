CREATE DATABASE escola;

USE escola;

create table aluno(
	nome VARCHAR(40) NOT NULL,
    cpf int PRIMARY KEY NOT NULL,
    idade int NOT NULL,
    fk_id_sala int,
    foreign key(fk_id_sala) references sala(id)    
);


create table sala(
	id int primary key auto_increment,
    numero int NOT NULL,
    capacidade_alunos int NOT NULL,
    fk_id_locador int,
    fk_cpf_aluno int,
    multimidia boolean,
    computador boolean,
    foreign key(fk_id_locador) references locador(id), 
    foreign key(fk_cpf_aluno) references aluno(cpf)
);

create table locador(
	nome varchar(40),
    id int primary key auto_increment,
    fk_id_curso int,
	fk_id_sala int,
    foreign key(fk_id_curso) references curso(id), 
    foreign key(fk_id_sala) references sala(id)
);

create table curso(
	nome varchar(40),
    id int primary key auto_increment,
    fk_id_locador int,
    descricao varchar(200),
    foreign key(fk_id_locador) references locador(id)
);

