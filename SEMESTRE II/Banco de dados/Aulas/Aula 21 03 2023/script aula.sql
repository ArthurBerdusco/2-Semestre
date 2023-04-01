describe vendedor;

alter table cliente add column telefone varchar(14);
select * from produto;

insert into cliente(cod_cli, nome_cli, endereco, cidade, cep, uf, telefone) values(1, 'Arthur', 'Rua Adelaide Braga Negrelli', 'São Paulo', '05782350', 'SP', '11932045718');
insert into cliente(cod_cli, nome_cli, endereco, cidade, cep, uf, telefone) values(2, 'Carlos', 'Avenida das Nacoes Unidas', 'São Paulo', '04037102', 'SP', '11972567808');

alter table cliente add column estado_civil varchar(15);
alter table vendedor modify nome_vend varchar(60);

alter table cliente drop column estado_civil;
alter table cliente change nome_cli nome varchar(50) not null;

update cliente set nome = 'Flavia' where nome = 'Arthur';

/*Inserir 5 registros nas tabelas cliente, produto, vendedor */
/* CLIENTE */
insert into cliente(cod_cli, nome, endereco, cidade, cep, uf, telefone) values(1, 'Arthur', 'Rua Adelaide Braga Negrelli', 'São Paulo', '05782350', 'SP', '11932045718');
insert into cliente(cod_cli, nome, endereco, cidade, cep, uf, telefone) values(2, 'Carlos', 'Avenida das Nacoes Unidas', 'São Paulo', '04037102', 'SP', '11972567808');
insert into cliente(cod_cli, nome, endereco, cidade, cep, uf, telefone) values(3, 'João', 'Avenida Berrini', 'São Paulo', '02839457', 'SP', '11982737099');
insert into cliente(cod_cli, nome, endereco, cidade, cep, uf, telefone) values(4, 'Maria', 'Rua Santa Rita', 'São Paulo', '07629370', 'SP', '11972638108');
insert into cliente(cod_cli, nome, endereco, cidade, cep, uf, telefone) values(5, 'Clara', 'Rua Antonio Ambuba', 'São Paulo', '03479128', 'SP', '11962581902');
/* PRODUTO */
insert into produto(unid_prod, desc_prod, val_unit) values('UND', "BOLACHA MAIZENA", 6.59);
insert into produto(unid_prod, desc_prod, val_unit) values('KG', "BANANA NANICA", 4.49);
insert into produto(unid_prod, desc_prod, val_unit) values('UND', "SHAMPOO CLEAR ANTI CASPA", 13.99);
insert into produto(unid_prod, desc_prod, val_unit) values('UND', "REFRIGERANTE COCA-COLA 2L", 8.29);
insert into produto(unid_prod, desc_prod, val_unit) values('UND', "CHOCOTONE TRUFADO BAUDUCO", 27.99);
/* VENDEDOR */
insert into vendedor(nome_vend, sal_fixo, faixa_comiss) values('ARTHUR SILVA BERDUSCO DE SOUZA', 159530.00, 'A');
insert into vendedor(nome_vend, sal_fixo, faixa_comiss) values('CARLA SOUZA BRITO', 39200.00, 'A');
insert into vendedor(nome_vend, sal_fixo, faixa_comiss) values('VANESSA CAMARGO AMARO', 29380.00, 'A');
insert into vendedor(nome_vend, sal_fixo, faixa_comiss) values('ROBERTO CARLOS SILVA', 92830.00, 'B');
insert into vendedor(nome_vend, sal_fixo, faixa_comiss) values('JOÃO MARQUES VELEZ', 18200.00, 'C');

select * from vendedor;




