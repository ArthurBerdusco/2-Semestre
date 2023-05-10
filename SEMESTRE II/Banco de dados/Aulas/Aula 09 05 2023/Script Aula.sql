USE SAKILA;

select first_name as NOME, last_name as SOBRENOME 
	from customer
	ORDER BY(NOME);

create view lista_cliente as 
	select first_name as NOME, last_name as SOBRENOME 
	from customer
	ORDER BY(NOME);
    
select * from lista_cliente;

select * from payment;

select sum(amount) from payment;

select * from staff;

select staff_id as ID, first_name AS NOME, sum(amount) AS PAGAMENT, format(sum(amount)*0.05,2) AS COMISSAO from payment
	inner join staff using(staff_id) 
	group by staff_id;
    
create view comissao as select staff_id as ID, first_name AS NOME, sum(amount) AS PAGAMENT, format(sum(amount)*0.05,2) AS COMISSAO from payment
	inner join staff using(staff_id) 
	group by staff_id;
    
select * from comissao;

update comissao set NOME = 'Arthur' where ID = 1;

/*	Criar uma view para listar os generos dos filmes
	classificados pelo mais utilizado. banco saikila*/
    
    
    select * from inventory;
    
select customer.first_name AS NOME ,category.name as CATEGORIA,count(*) LOCACOES from rental
		inner join customer using(customer_id)
		inner join inventory using(inventory_id)
		inner join film_category using(film_id)
		inner join category using (category_id)
        where customer.customer_id = 1
		group by (category.category_id)
		order by (LOCACOES) desc limit 1
;

DROP VIEW MARY_cATEGORIAS_PREF;

create view MARY_CATEGORIAS_PREF as select customer.first_name ,category.name as NOME,count(*) LOCACOES from rental
		inner join customer using(customer_id)
		inner join inventory using(inventory_id)
		inner join film_category using(film_id)
		inner join category using (category_id)
        where customer.customer_id = 1
		group by (category.category_id)
		order by (LOCACOES) desc
;

delimiter $$
CREATE FUNCTION Genero(idCliente int)
RETURNS varchar(15)
DETERMINISTIC
	BEGIN
		declare resultado varchar(50);
		select concat(customer.first_name ,category.name,count(*)) into  resultado from rental
		inner join customer using(customer_id)
		inner join inventory using(inventory_id)
		inner join film_category using(film_id)
		inner join category using (category_id)
        where customer.customer_id = idCliente
		group by (category.category_id)
		order by count(*) desc limit 1;
        return resultado;
	end
$$

select genero(3);

select * from language;

select * from customer;


select * from MARY_CATEGORIAS_PREF;




select * from rental where customer_id = 1;


/**/

SELECT * FROM RENTAL;

SELECT * FROM 
