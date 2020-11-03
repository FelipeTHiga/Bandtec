select * from atleta;

-- Criação e inserção de dados na tabela pais
		create table pais
		(idPais int primary key auto_increment,
		nome varchar(30),
		capital varchar(30))auto_increment=100;

		insert into pais(nome, capital) values
		('EUA', 'Washington DC'),
		('Japão', 'Tokyo'),
		('Jamaica','Kingston'),
		('Alemanha','Berlin'),
		('Ucrânia', 'Kiev'),
		('Finlândia','Helsinque');

-- Verificação se a tabela foi criada corretamente
		select * from pais;

-- Criação da coluna fkPais e adição de foreign key
		select * from atleta;
		alter table atleta add column fkPais int;
		alter table atleta add foreign key (fkPais) references pais(idPais);

-- Add valores de fkPais em seus atletas correspondentes
		update atleta set fkPais = 100 where idatleta in ('102','103','106','107','110');
		update atleta set fkPais = 101 where idatleta =104;
		update atleta set fkPais = 102 where idatleta =101;
		update atleta set fkPais = 103 where idatleta =105;
		update atleta set fkPais = 104 where idatleta =109;
		update atleta set fkPais = 105 where idatleta =108;

-- Exibir todos os dados dos atletas e países correspondentes
		select * from atleta,pais where fkpais= idpais;

-- Exibir dados de todos os atletas dos EUA
	-- Possibilidade usando idPais
		select * from atleta,pais where fkpais= idpais and idpais=100;

	-- Teste usando nome da tabela e nome da coluna
		select * from atleta,pais where fkpais= idpais and pais.nome like "EUA";


-- Exibir apenas nomes e modalidades dos atletas e apenas o nome dos paises (Treino de select)
		select atleta.nome as 'Nome atleta',modalidade,pais.nome as "Nome país" from atleta, pais where idpais= fkpais;


-- Exercício 2--

select * from musica;

-- Criação e inserção de dados na tabea Album
		create table album 
		(idAlbum int auto_increment primary key, 
		nome varchar(30), 
		gravadora varchar(30))auto_increment=100;

		insert into album (nome, gravadora) values
		('Só sertanejo', 'Gravadora A'),
		('Melhores pops', 'Gravadora A'),
		('Rock Collection', 'Gravadora B'),
		('Sucessos Mix', 'Gravadora C');

-- Verificação se a tabela foi criada corretamente
		select * from album;

-- Criação da coluna fkAlbum e adição de foreign key
		select * from musica;
		alter table musica add column fkAlbum int;
		alter table musica add foreign key (fkAlbum) references album(idAlbum);
		desc musica;

-- Add dos fkAlbum em suas músicas correspondentes
		update musica set fkAlbum = 100 where idmusica in ('005','007');
		update musica set fkAlbum = 101 where idmusica in ('001','002','003','006');
		update musica set fkAlbum = 102 where idmusica in ('004','008');
		update musica set fkAlbum = 103 where idmusica in ('009','010');
		
 -- Exibir dados de músicas e seus albúns correspondentes
        select * from musica, album where idAlbum=fkalbum;

-- Exibir dados das músicas e dos álbuns somente do álbum "Só sertanejo"
	-- Possibilidade 1
		select * from musica, album where idAlbum=fkAlbum and idAlbum=100;
	-- Possibilidade 2	
        select * from musica, album where idalbum=fkAlbum and album.nome like "Só%";
	-- Possibilidade 3	
        select * from musica, album where idalbum=fkAlbum and album.nome = "Só sertanejo";

-- Exibir dados das músicas e dos albuns somente da gravadora A
	-- Possibilidade 1
		select * from musica, album where idAlbum=fkAlbum and album.gravadora='Gravadora A';
	-- Possibilidade 2 
		select * from musica, album where idAlbum=fkAlbum and album.gravadora like '%_A'
