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

insert into medico (nome,idade,especialidade,cpf,cidade,fk_nroa) Values
                   ('João',40,'Ortopedia','10000100000','Florianopolis',1),
                   ('Maria',42,'Traumatologia','10000110000','Blumenau',2),
                   ('Pedro',51,'Pediatria','11000100000','São José',2),
                   ('Carlos',28,'Ortopedia','11000110000','Joinville',4),
                   ('Marcia',33,'Neurologia','11000111000','Biguacu',3);
insert into paciente (nome,idade,cidade,cpf,doenca)
      values     ('ana',20,'Florianopolis','20000200000','Gripe'),
                 ('Paulo',24,'Palhoca','20000220000','fratura'),
				 ('Lucia',30,'Biguacu','22000200000','Tendinite'),
                  ('Carlos',28,'Joinville','11000110000','Sarampo');
insert into funcionario (nome,idade,cidade,salario,cpf)
	values   ('Rita',32,'São José',1200.00,'20000100000'),
              ('Maria',55,'Palhoca',1220.00,'30000110000'),
              ('caio',45,'Florianopolis',1100.00,'41000100000'),
              ('Carlos',44,'Florianopolis',1200.00,'51000110000'),
               ('Paula',33,'Florianopolis',2500.00,'61000111000');
insert into consulta (fk_codm, fk_codp,data_consulta,hora)
             values (1,1,'2006/06/12','14:00'),
             (1,4,'2006/06/13','10:00'),
             (2,1,'2006/06/13','09:00'),
             (2,2,'2006/06/13','11:00'),
             (2,3,'2006/06/14','14:00'),
             (2,4,'2006/06/14','17:00'),
             (3,1,'2006/06/19','18:00'),
             (3,3,'2006/06/12','10:00'),
             (3,4,'2006/06/19','13:00'),
             (4,4,'2006/06/20','13:00'),
             (4,4,'2006/06/22','19:30');




select * from consulta;
alter table medico add column cidade varchar(40);
alter table funcionario add constraint foreign key(nroa) references ambulatorio(nroa);
alter table funcionario drop column cargo;
update paciente set cidade = 'ilhota' where codp = 2;
update consulta set data_consulta = '2006-07-04', hora = '12:00:12'
	where fk_codm = 1 and fk_codp =4;
update consulta set data_consulta = '2006-07-04', hora = '12:00'
	where num_consulta = 2;

select * from paciente;
update paciente set doenca = 'hepatite', idade = idade+1 where codp =1;
select * from consulta;
update consulta set hora = addtime(hora, '00:00:10') where num_consulta = 9;
describe consulta;
select * from funcionario;
delete from funcionaro where codf = 4;
select * from consulta;
delete from consulta where hora > '19:00';
select * from paciente;
delete from paciente where doenca = 'cancer' or idade < 10;
select* from medico where cidade = 'Biguacu' or cidade = 'Palhoca';
delete from medico where cidade = 'Biguacu' or cidade = 'Palhoca';
delete from medico where cidade in('Biguacu', 'Palhoca');



    

