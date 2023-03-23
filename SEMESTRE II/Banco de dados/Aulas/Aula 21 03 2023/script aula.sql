describe cliente;

alter table cliente add column telefone varchar(14);
select * from cliente;

insert into cliente(cod_cli, nome_cli, endereco, cidade, cep, uf, telefone) values(1, 'Arthur', 'Rua Adelaide Braga Negrelli', 'São Paulo', '05782350', 'SP', '11932045718');
insert into cliente(cod_cli, nome_cli, endereco, cidade, cep, uf, telefone) values(2, 'Carlos', 'Avenida das Nacoes Unidas', 'São Paulo', '04037102', 'SP', '11972567808');

alter table cliente add column estado_civil varchar(15);
alter table cliente modify nome_cli varchar(50);

alter table cliente drop column estado_civil;
alter table cliente change nome_cli nome varchar(50) not null;

update cliente set nome = 'Flavia' where nome = 'Arthur';

/*Inserir 5 registros nas tabelas cliente, produto, vendedor */