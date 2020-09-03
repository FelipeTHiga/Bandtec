
create database sprint1;
use sprint1;

create table atleta(
idAtleta int primary key,
nome varchar(40),
modalidade varchar (40),
qtdMedalha int
);

-- Adicionar coluna nova
alter table atleta add column data_medalha datetime;

-- Atualizar dados da tabela
update atleta set data_medalha ='2000-12-30 12:13:12' where idAtleta = 101;

update atleta set data_medalha='2020-2-4' where idAtleta in (102,103);



insert into atleta values
	('101','Usain Bolt','atletismo','8');

select * from atleta;

insert into atleta values
	('102','Matt Biondi', 'natação','11'),
    ('103','Jenny Thompson','natação','12'),
    ('104','Sawao Kato','ginástica artística','12'),
    ('105','Birgit Fischer','canoagem', '12'),
    ('106','Carl Lewis','atletismo','10'),
	('107','Mark Spitz','natação','11'),
    ('108','Paavo Nurmi','atletismo','12'),
    ('109','Larysa Latynina','ginástica artística','18'),
    ('110','Michael Phelps','natação', '28');

    select * from atleta;
    select nome,qtdMedalha from atleta;
    select * from atleta where modalidade='natação';
    select * from atleta order by modalidade, nome asc;
    select * from atleta order by qtdMedalha desc;
    select * from atleta where nome like'%n%';
    select * from atleta where nome like'M%';
    select * from atleta where nome like'%o';
    select * from atleta where nome like '%o_';
    
    -- Diferente de atletismo
    select * from atleta where modalidade != "atletismo";
	-- Atletas com mais de 15 medalhas
	select * from atleta where qtdMedalha >= 15;
    
    
 drop table atleta;
 
 create table musica (
 idmusica varchar(40) primary key,
 titulo varchar(40),
 artista varchar(40),
 genero varchar(40)
 );
 
 insert into musica values
	('001','Perfect', 'Ed Sheeran', 'pop'),
    ('002','Photograph','Ed Sheeran','pop'),
    ('003','I m yours','Jason Mraz', 'pop'),
	('004','Welcome to the jungle','Guns n Roses','rock'),
    ('005','Ai se eu te pego','Michel Teló','sertanejo'),
    ('006','Lucky','Jason Mraz','pop'),
	('007','Cheirosa','Jorge & Mateus','sertanejo'),
    ('008', 'American idiot','Green Day','rock'),
    ('009','Fake love','BTS','kpop'),
    ('010','Aquarela','Toquinho','mpb')
    ;
    
select * from musica;
-- Seleciona nome da musica e artista
select titulo,artista from musica;

-- Exibe todos os artistas do genero pop
select * from musica where genero ='pop';
-- Exibe todas as informações do artista Ed Sheeran
select * from musica where artista= 'Ed Sheeran';
-- Exibe todas as informações em ordem alfabética de nome da música
select * from musica order by titulo asc;
-- Exibe todas as informações em ordem decrescente de nome de artista
select * from musica order by artista desc;

select * from musica where titulo like 'a%';

select titulo from musica where artista like "%Sheeran";

select * from musica where genero like '_o%';

select * from musica where titulo like '%l_';

drop table musica;

create table livro (
codigo int, nome varchar(100), autor varchar(100), assunto varchar(100), quantidade int);

insert into livro values (
'101', 'Java como Programar', 'Paul Deitel', 'programação','10');

select * from livro;

insert into livro values (
102,'banco de dados','Sadruga Puga',"Banco de dados",20),
(103,'sistemas operacionais', 'Paul Deitel',"sistemas operacionais",5),
(104,'C++ como programar',"Harvey Deitel","programação",15);

select nome from livro where autor like '%Deitel';