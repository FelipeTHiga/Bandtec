create database ac2felipe;

use ac2felipe;


-- Criação de planilhas
create table franquia (
	idfranquia int primary key auto_increment,
    nome varchar(45),
    orcamento float,
    duracao float,
    lancamentoBR date,
    lancamentoEUA date,
    diretor varchar(45),
    codiretor varchar(45) default 'Não há'
);

create table personagem(
	idpersonagem int auto_increment,
	nome varchar(45),
	especie varchar(45),
	papel varchar(45),
	fkFranquia int,
	foreign key (fkFranquia) references franquia(idFranquia),
	primary key (idpersonagem,fkFranquia),
    check (papel='protagonista' or papel='coadjuvante' or papel='vilão')
) auto_increment=1000;


-- Inserção de dados
insert into franquia (nome, orcamento,duracao, lancamentoBR,lancamentoEUA,diretor,codiretor) values
	('A pequena sereia',40000000, 83, '1990-11-30','1989-11-17','Ron Clements','John Musker'),
    ('Rei Leão',45000000,89,'1994-07-08','1994-06-15','Roger Allers','Rob Minkoff'),
    ('Lilo & Stich', 80000000,85,'2002-06-28','2002-06-21','Dean DeBlois','Chris Sanders'),
    ('Peter Pan', 4000000,76,'1954-07-12','1953-02-05','Clyde Geronimi','Wilfred Jackson'),
    ('Aladdin',28000000,90,'1993-06-25', '1992-11-25','Ron Clements','John Musker'),
    ('Mulan',90000000,95,'1998-07-01','1998-06-19','Tony Bancroft','Barry Cook')
;

insert into personagem (nome,especie,papel,fkfranquia) values
	('Ariel','sereia','protagonista', 1),
    ('Linguado','peixe','coadjuvante',1),
    ('Timão','suricato','coadjuvante',2),
    ('Pumba','javali','coadjuvante',2 ),
    ('Scar','leão','vilão',2),
    ('Lilo','humano','protagonista',3),
    ('Stich','extraterrestre','protagonista',3),
    ('Peter Pan','humano','protagonista',4),
    ('Sininho','fada','coadjuvante',4),
    ('Capitão-Gancho','humano','vilão',4),
    ('Aladdin', 'humano','protagonista',5),
    ('Jafar','humano','vilão',5),
    ('Mulan','humano','protagonista',6),
    ('Mushu','dragão','coadjuvante',6);

alter table franquia rename column nome to nomeFranquia;
alter table personagem rename column nome to nomePersonagem; 
 
-- Exibição de dados -- 

-- Exibir dados da tabela franquia
select * from franquia;

-- Exibir dados da tabela franquia
select * from personagem;

-- Exibir dados relacionados das duas tableas
select * from personagem, franquia where idfranquia=fkfranquia;



-- Exibir média do orçamento das franquias 
select truncate(avg(orcamento),1) as 'orçamento médio' from franquia;

-- Exibir filmes com orçamentos maiores que a média
select  nomefranquia, orcamento as 'Orçamento US$' from franquia where orcamento > (select avg(orcamento) from franquia);

    
drop table personagem;