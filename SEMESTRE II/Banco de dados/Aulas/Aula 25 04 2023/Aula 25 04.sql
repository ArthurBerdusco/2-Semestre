use sakila;
show tables;
describe actor;
select * from actor;
select first_name, last_name from actor;
select first_name as Nome,last_name as Sobrenome from actor order by first_name desc;
select * from actor order by first_name asc;
select * from actor where last_update < '2006-02-16' order by actor_id desc;
select * from actor where time(last_update) < '12:00' order by actor_id desc;
select * from actor where date(last_update) < '2006-02-16' order by actor_id desc;
select * from actor where first_name like 'a%' order by actor_id desc;
select * from actor where first_name = 'a%' order by actor_id desc;
select * from actor where first_name like 'a%' order by actor_id desc;
select * from actor order by first_name, last_name;
update actor first_name set last_update = ('2006-02-15 04:34:33') where last_update = '2007-02-15 04:34:33';
SELECT * FROM ACTOR;

select * from customer;
select * from customer where first_name like 'J%' order by first_name;
select count(*) as total from customer where last_name like '%SILVA%' order by first_name;
select count(*) as total from customer;
update customer set first_name = null where customer_id = 6;
select count(first_name) from customer;

insert into actor (first_name, last_name, last_update) values (null, 'Maia', now());

use clinica;
select * from paciente;
select * from paciente order by idade;
select max(idade) from paciente;
select sum(idade) from paciente;
select * from paciente where idade > 29 and idade < 40;
select distinct especialidade from medico;
select * from paciente;
select * from consulta, paciente where consulta.fk_codp = paciente.codp;
select * from consulta, paciente where consulta.fk_codp = paciente.codp and paciente.nome = 'ana';

select * from consulta
			inner join paciente on consulta.fk_codp = paciente.codp;

use sakila;

select * from customer;
select * from address;
select * from customer
	inner join address on customer.address_id = address.address_id;
    
    select * from city;
    
select * from customer
	inner join address on customer.address_id = address.address_id
    inner join city on address.city_id = city.city_id
    where customer.customer_id = 1
    ;
    
    use clinica;
    select * from medico;
    
    select count(*) from medico;
    select especialidade, count(*) from medico group by especialidade;
    
    use sakila;
    select * from customer;
    
    select count(*) from customer;
    select active, count(*) from customer group by active;
    
    select case active  when 0 then 'INATIVO' when 1 then 'ATIVO' end, count(*) from customer group by active;
    
    
    