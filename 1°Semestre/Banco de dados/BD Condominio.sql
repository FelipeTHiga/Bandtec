create database desafio;
use desafio;

-- Tabela CEP
create table cep (
CEP int primary key,
logradouro varchar(45),
numero int,
bairro varchar(45),
cidade varchar(45)
);

insert into cep values
	(03204900,'Rua Alves',190,'Vila Madalena','São Paulo'),
    (03207030, 'Rua das Bandeiras',241,'Vila Mariana','São Paulo');

    
-- Tabela condominio
create table condominio(
idCond int primary key auto_increment,
nomeCond varchar(45),
descricao varchar(45),
fkcep int,
foreign key (fkcep) references cep(CEP)
);

insert into condominio (nomeCond,descricao,fkcep) values
	('Vila Flora','Apts 4 quartos, suite e piscina',03204900), 
    ('Albatroz','Apts 2 quartos, piscina e salão de jogos',03207030); 


-- Tabela pessoa
create table pessoa	(
idPessoa int primary key auto_increment,
nomePessoa varchar(45),
telefoneCelular varchar(30),
telefoneRes varchar(30)
)auto_increment=100;

insert into pessoa (nomePessoa,telefoneCelular,telefoneRes) values

('Artur Silva','980406070','1149586478'),
('Maria Silva','987590678','1149586478'),
('Julia Gomes','983749585','1198484030'),
('Marcos Souza','94048383','1185903004'),
('João Silva','940383049','1149586478'),
('Bianca Nunes','93123745','10293845')
;


-- Tabela unidade
create table unidade (
idUnid int,
apartamento int,
andar int,
fkCond int,
fkpessoa int,
foreign key (fkCond) references condominio(idCond),
foreign key (fkpessoa) references pessoa(idpessoa),
primary key (idUnid,fkCond,apartamento)
);

insert into unidade values
(1001,46,4,1,105),
(1002,32,3,1,null),
(1001,10,1,2,102);


-- Tabela possui
create table possui (
fkpessoa int,
fkcond int,
fkUnid int,
porcentagem int,
foreign key (fkcond) references condominio(idcond),
foreign key (fkpessoa) references pessoa(idpessoa),
foreign key (fkUnid) references unidade(idUnid),
primary key (fkpessoa,fkcond,fkunid)
);

insert into possui values
(101,1,1001,50),
(102,2,1001,100),
(103,1,1002,100),
(104,1,1001,50);


-- select das informações da tabela dos apartamentos com inquilinos
	select 
		cep.*,
		cond.nomeCond, 
		cond.descricao, 
		pessoa.nomepessoa as 'Nome dos proprietários', 
		possui.porcentagem,
        idunid,
        unidade.apartamento, 
		unidade.andar, 
		unidade.fkpessoa ,
		inquilino.nomepessoa as 'Inquilino'
	from
		cep,
		condominio as cond,
		pessoa,
		unidade,
		possui,
		pessoa as inquilino
   where
		cep.CEP=fkcep
	and
		idcond=unidade.fkcond
	and
		idcond=possui.fkcond
	and 
		pessoa.idpessoa=possui.fkpessoa
	and
		idunid=possui.fkunid
	and 
		inquilino.idpessoa=unidade.fkpessoa;
       
       -- exibir o nome do condominio, o andar e o apartamento da unidade e o nome do proprietario da unidade
       
       select 
	cond.nomeCond, 
	pessoa.nomepessoa as 'Nome dos proprietários',
	unidade.idUnid,
    unidade.apartamento, 
	unidade.andar, 
	unidade.fkpessoa
    from
		condominio as cond,
		pessoa,
		unidade,
		possui
    where
		idcond=unidade.fkcond
	and
		idcond=possui.fkcond
	and 
		pessoa.idpessoa=possui.fkpessoa
	and
		idunid=possui.fkunid;
        
        -- exibir o nome do condominio, o andar e o apartamento da unidade e o nome de quem está alugando a unidade
        
	select 
		cep.*,
		cond.nomeCond,
        idunid,
        unidade.apartamento, 
		unidade.andar, 
		inquilino.nomepessoa as 'Inquilino'
	from
		cep,
		condominio as cond,
		unidade,
		pessoa as inquilino
   where
		cep.CEP=fkcep
	and
		idcond=unidade.fkcond
	and 
		inquilino.idpessoa=unidade.fkpessoa;
       