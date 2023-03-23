show databases;
create database estoque_turmab;
use estoque_turmab;

/*Tabela cliente*/
create table cliente (
	cod_cli smallint primary key,
    nome_cli varchar(40) not null,
    endereco varchar(40) not null,
    cidade varchar(20) not null,
    cep varchar(9) not null,
    uf char(2) not null
);

/*Tabela vendedor*/
create table vendedor (
	cod_vend smallint not null primary key auto_increment,
    nome_vend varchar(40) not null,
    sal_fixo decimal(9,2) not null,
    faixa_comiss char(1) not null
);

/*Tabela produto*/
create table produto (
	cod_prod smallint not null auto_increment primary key,
    unid_prod char(3) not null,
    desc_prod varchar(20) not null,
    val_unit numeric(9,2) not null
);

/*Tabela pedido*/
create table pedido (
	num_ped smallint not null primary key auto_increment,
    prazo_entr smallint not null,
    fk_cd_cli smallint not null,
    fk_cd_vend smallint not null,
    foreign key (fk_cd_cli) references cliente (cod_cli),
    foreign key (fk_cd_vend) references vendedor (cod_vend)
);

/*Tabela Item pedido*/
create table item_pedido (
	fk_no_ped smallint not null,
    fk_cd_prod smallint not null,
    qtd_ped float not null,
    foreign key (fk_no_ped) references pedido (num_ped),
    foreign key(fk_cd_prod) references produto(cod_prod)
);

