-- Criar banco de dados Revista e seleciona-lo
create database Revista;
use Revista;

-- Criar tabela Revista
create table revista(
	idRevista int primary key auto_increment,
	nome varchar(40),
	categoria varchar(30));

-- Inserção de dados na tabela
insert into revista(nome) values 
	("Veja"),
	("Quatro rodas"),
	("Epoca"),
	("Isto é");

-- Exibir dados da tabela revista
select * from revista;

-- Adicionar dados no campo categoria da tabela Revista
update revista set categoria = "informações gerais" where idRevista in (1,3,4);
update revista set categoria ="Automóveis" where idRevista=2;

-- Exibir dados da tabela
select * from revista;

-- Inserir dados na tabela Revista
insert into revista(nome, categoria) values
	("Mundo Estranho", "Curiosidades"),
    ("Galileu","Cientifica"),
    ("Casa e Jardim", 'Arquitetura e decoração');
 
 -- Exibir dados e descrição da estrutura da tabela Revista
 select * from revista;
 desc revista;
 
 -- Alteração da tabela no campo categoria, aumento da quantidade máxima de caracteres para 40
 alter table revista modify column categoria varchar(40);
 
 -- Exibir descrição da estrutura da tabela Revista para verificar a alteração
 desc revista;
 
 -- Adição e remoção do campo periodicidade na tabela Revista
 alter table revista add column periodicidade varchar(15);
 select * from revista;
 alter table revista drop column periodicidade;
 
 
 -- Criação da tabela Editora
 create table Editora (
 idEditora int primary key auto_increment,
 nomeEditora varchar(40),
 dataFund date)auto_increment=1000;
 
 -- Inserção de dados na tabela Editora
 insert into editora(nomeEditora,dataFund) values
	("Editora Abril",'1950-5-27'),
    ("Editora Globo","1986-12-23"),
    ("Editora Três","1972-8-14");

-- Exibição dos dados da tabela Editora
select * from editora;

-- Adição da coluna fkEditora e atribuição desta como chave estrangeira na tabela Revista
Alter table revista add column fkEditora int;
Alter table revista add foreign key (fkEditora) references editora(idEditora);

-- Exibir descrição da estrutura da tabela Revista para verificar alterações
desc revista;

-- Atualização dos dados da coluna fkEditora
update revista set fkEditora = 1000 where idRevista in (1,2,5);
update revista set fkEditora = 1001 where idRevista in (3,6,7);
update revista set fkEditora = 1002 where idRevista = 4;

-- Exibir os dados da tabela Revista
select * from revista;

-- Exibir os dados das revista e editoras correspondentes
select * from revista,editora where idEditora = fkEditora;

-- Exibir dados das revistas e editoras, porém só da editora Abril
select * from revista,editora where idEditora = fkEditora and idEditora=1000;

-- Exibir dados das revista e apenas o nome das editoras
select revista.*,editora.nomeEditora from revista, editora where idEditora = fkEditora;

-- Exibir apenas nome das revistas e editoras
select revista.nome,editora.nomeEditora from revista,editora where idEditora = fkEditora;

-- Exibir apenas nome e categoria das revistas e apenas data de fundação das editoras
select revista.nome,categoria,editora.datafund from revista, editora where idEditora = fkEditora;

