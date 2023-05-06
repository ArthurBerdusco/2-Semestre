use sakila;

select * from customer;

select * from address;

select * from customer
			inner join address on customer.address_id = address.address_id;
            
select * from customer
			inner join address on customer.address_id = address.address_id
            inner join city on address.city_id = city.city_id
            inner join country on city.city_id = country.country_id;

select customer.first_name, customer.last_name,
			address.address, address.district,
            city.city,
            country.country
			from customer
			inner join address on customer.address_id = address.address_id
            inner join city on address.city_id = city.city_id
            inner join country on city.city_id = country.country_id;
            
select A.first_name, A.last_name,
			B.address, B.district,
            C.city,
            D.country
			from customer A
			inner join address B on A.address_id = B.address_id
            inner join city C on B.city_id = C.city_id
            inner join country D on C.city_id = D.country_id;
            
select A.first_name AS NOME, A.last_name AS SOBRENOME,
			B.address AS ENDERECO, B.district AS BAIRRO,
            C.city AS CIDADE,
            D.country AS PAIS
			from customer A
			inner join address B on A.address_id = B.address_id
            inner join city C on B.city_id = C.city_id
            inner join country D on C.city_id = D.country_id
            order by A.first_name
            ;
            
select A.first_name AS NOME, A.last_name AS SOBRENOME,
			B.address AS ENDERECO, B.district AS BAIRRO,
            C.city AS CIDADE,
            D.country AS PAIS
			from customer A
			inner join address B on A.address_id = B.address_id
            inner join city C on B.city_id = C.city_id
            inner join country D on C.city_id = D.country_id
            group by D.country
            order by D.country
            ;
            
select * from customer;

select * from payment;
select * from staff;

select payment.*, staff.first_name from payment
				inner join staff on payment.staff_id = staff.staff_id;
                
select staff.first_name, count(*) from payment
				inner join staff on payment.staff_id = staff.staff_id
                group by staff.first_name;
                
select staff.first_name, sum(payment.amount) from payment
				inner join staff on payment.staff_id = staff.staff_id
                group by staff.first_name;
                
select staff.first_name, sum(payment.amount)*0.05 from payment
				inner join staff on payment.staff_id = staff.staff_id
                group by staff.first_name;
                


#EXERCICIO
#1) QUANTO GASTOU A MARY COM LOCAÇÕES
select B.first_name as NOME, B.last_name AS SOBRENOME, sum(A.amount) AS GASTO from payment as A 
					inner join customer as B on A.customer_id = B.customer_id
                    WHERE B.customer_id = 1					
;
#id 3 linda

select B.first_name as NOME, B.last_name as SOBRENOME, sum(A.amount) as GASTO from payment as A
				inner join customer as B on B.customer_id = A.customer_id
                group by(B.customer_id)
                order by(GASTO) desc
;

#2) QUAIS OS TITULOS DOS FILMES QUE A MARY ASSISTIU

select distinct D.first_name, D.last_name,  C.title from rental as A
					inner join inventory B on A.inventory_id = B.inventory_id
                    inner join film C on C.film_id = B.film_id
                    inner join customer D on D.customer_id = A.customer_id
                    where A.customer_id = 1
; 

#3) QUAL O GENERO DE FILME QUE É MAIS ASSISTIDO

select D.name, count(D.name) AS contagem from rental as A
					inner join inventory B on A.inventory_id = B.inventory_id
                    inner join film_category C on B.film_id = C.film_id
                    inner join category D on D.category_id = C.category_id
                    group by (D.name)
                    order by (contagem) desc
	;
    
select C.title as FILME, count(C.title) as ALUGUEIS from rental as A
				inner join inventory as B on B.inventory_id = A.inventory_id 
                inner join film as C on C.film_id = B.film_id  
                group by (FILME)
                order by (alugueis) desc
;

select D.country as PAIS, A.first_name as NOME from customer as A
			inner join address as B on B.address_id = A.address_id
            inner join city as C on C.city_id = B.city_id
            inner join country as D on D.country_id = C.country_id
            where D.country = 'India'
            order by(A.first_name) asc  
		
;

