use sakila;
select * from actor;

select * from customer;
select * from address;
select * from address where address_id = 406;

select first_name as Nome, last_name as Sobrenhome from customer where first_name like 'M%';

select * from customer where active = 1;

select first_name, case
						when active = 1 then 'Ativo'
                        when active = 0 then 'Inativo'
                        end
							from customer;

                            
/*Qual a quantidade de clientes ativos*/
select count(*) from customer where active = 1;

/* Gere uma listagem dos clientes em ordem crescente por sobrenome */
select * from customer order by last_name;