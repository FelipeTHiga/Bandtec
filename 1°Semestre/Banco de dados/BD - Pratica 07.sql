create database PraticaJogador;
use PraticaJogador;


create table timeF
(idTime int primary key auto_increment,
nomeTime varchar(45),
tecnico varchar(45),
dataFormacao date
);

create table jogador
(idJogador int primary key auto_increment,
fktime int,
nomeJogador varchar(45),
posicao varchar(20),
salario decimal (11,2),
idconselheiro int,
check(salario>0),
foreign key (idconselheiro) references jogador(idJogador),
foreign key (fktime) references timeF(idTime)
)auto_increment=100;

create table seguidor 
(idseguidor int auto_increment,
fkjogador int,
nomeSeguidor varchar(45),
nickName varchar(45),
sexo char(1),
foreign key (fkjogador) references jogador(idjogador),
primary key(idseguidor, fkjogador),
check(sexo='m' or sexo='f' or sexo='n')
)auto_increment=1000;

insert into timeF (nometime,tecnico,dataFormacao) values
	('Futbol Club Barcelona','Ronald Koeman','1899-11-29'),
    ('Futball-Club Bayern München','Hans-Dieter Flick', '1900-02-27'),
    ("Paris Saint-Germain Football Club",'Thomas Tuchel','1970-08-12');


insert into jogador (fktime,nomeJogador,posicao,salario,idconselheiro) values
	(1,'Lionel Messi','Atacante',3739500.55 ,null),
    (1,'Pedro González López','Atacante',66770.32,100),
    (1,'Gerard Piqué','Defensor','1469141.94',null),
    (2,'Robert Lewandowski','Atacante','1602547.40',null),
    (2,'Tanguy Kouassi','Volante','63441.15',103),
    (2,'Alphonso Davies','Meio-campista',267092.02,103),
    (2,'Manuel Neuer','Goleiro',834781.85,null),
    (3,'Ángel Di María','Ponta',1068319.00,null),
    (3,'Neymar Jr','Atacante','1803114.00',null),
    (3,'Kays Ruiz-Atil','Meio-campista',10017.30,107),
    (3,'Kylian Mbappé','Atacante',1068867.50,107);
    
    
    
    select* from jogador;
insert into seguidor (fkjogador,nomeSeguidor,NickName,sexo) values
(100,'Manuel Dias','MD','m'),
(100,'Maria Dias','MaryDi','f'),
(100,'Pablo Sierra','PablitoS','m'),
(100,'Florencia Torres ','Flor','f'),
(108,'João Silva','Jão','m'),
(108,'Maria Silva','Naymazete','f'),
(108,'Bruno Canet','Brunin','m'),
(108,'Gabriel Caneco','Caneco','n');


-- Exibir todos os dados de cada tabela criada, separadamente.
	select * from timeF;
	Select * from jogador;
	select* from seguidor;


-- Exibir apenas os nomes dos times e dos técnicos de todos os times cujo nome começa com uma determinada letra.
	select nomeTime, tecnico from timeF where nomeTime like 'F%';

--  Exibir todos os dados dos jogadores em ordem decrescente pela posição.
	select * from jogador order by posicao desc;
    
-- Exibir os dados dos jogadores que jogam em uma determinada posição.
	select * from jogador where posicao='atacante';

-- Exibir os dados dos times em que o técnico tenha a 2a letra de trás para frente igual a uma determinada letra.
	select * from timeF where tecnico like '%a_';

-- Exibir os dados dos times em ordem crescente pelo nome do técnico.
	select * from timeF order by tecnico;

-- Exibir os dados dos times em ordem decrescente pela data de fundação do time.
	select * from timeF order by dataFormacao desc;

-- Alterar a posição de algum jogador
	update jogador set posicao= 'Lateral' where idjogador=104;
	
    select * from jogador where idJogador=104;

-- Exibir os dados dos times e dos seus respectivos jogadores.
	select * from timeF,jogador where idtime=fktime;

-- Exibir os dados de um determinado time (PSG) e dos seus respectivos jogadores.
	select * from timeF,jogador where idtime=fktime and idtime=3;
    
--  Exibir os dados dos jogadores e os dados dos seus respectivos conselheiros.
	select 
		jogador.*,
        conselheiro.nomejogador as 'Nome conselheiro',
		conselheiro.posicao as 'Posição conselheiro',
		conselheiro.salario as 'Salario conselheiro'
        from 
			jogador,
            jogador as conselheiro 
            where
				jogador.idconselheiro=conselheiro.idjogador;

-- Exibir os dados de um jogador (Kylian Mbappé), os dados do seu conselheiro e do seu time.

	select 
		jogador.*,
        conselheiro.nomejogador as 'Nome conselheiro',
		conselheiro.posicao as 'Posição conselheiro',
		conselheiro.salario as 'Salario conselheiro',
        timeF.*
        from 
			jogador,
            jogador as conselheiro,
            timeF
            where
				jogador.idConselheiro=conselheiro.idJogador
                and
					idTime=jogador.fktime
                and
					jogador.idJogador=110;
                    
-- Exibir os dados dos jogadores e de seus seguidores.
	select * from seguidor,jogador where idjogador=fkjogador;
    
-- Exibir os dados de apenas um jogador (Neymar) e os dados de seus seguidores
	select * from seguidor,jogador where idjogador=fkjogador and idjogador=108;
    
-- Excluir algum jogador.
	delete from jogador where idjogador=102;

-- Exibir a quantidade de jogadores em um determinado time (Barcelona)
    select 
		timef.*,
		count(idjogador) as 'Quantidade de jogadores'  
        from 	
			jogador,
            timef 
            where
				fktime=1 and fktime=idTime;

-- Exibir menor sálario e o nome do jogador que recebe-o.
	select 
		min(salario), 
		nomeJogador 
        from 
			jogador 
            where 
				salario=(select min(salario) from jogador);
	
    -- !! OBS: !!
	-- a query "select min(salario), nomeJogador from jogador"  Não retorna o valor da forma esperada,  o nome do jogador que
    -- aparece é o nome do jogador de id = 1 e não o nome do jogador com menor sálario.
    
-- Exibir maior sálario e o nome do jogador que recebe-o.
	select 
		max(salario), 
        nomeJogador 
        from 
			jogador 
            where 
				salario=(select max(salario) from jogador);
 
-- Exibir média de salario dos jogadores
	select truncate(avg(salario),2) as 'salario médio (R$)' from jogador;

-- Exibir informações dos jogadores e nome dos times dos jogadores com salário acima da média
	select 
		jogador.*, 
        timeF.nomeTime 
        from 
			jogador,
            timeF 
            where 
				idtime=fktime 
                and 
					salario> (select avg(salario) as 'salario médio (R$)' from jogador);

-- Excluir as tabelas.
    drop table timeF;
	drop table jogador;
	drop table seguidor;