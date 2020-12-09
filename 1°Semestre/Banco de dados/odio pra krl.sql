CREATE DATABASE ac3_FelipeHiga; 
USE	ac3_FelipeHiga;


CREATE TABLE especiePokemon (
 idEspecie INT PRIMARY KEY,
 nomeEspecie varchar(25),
 
 -- Os atributos  tipo e subTipo descrevem quais elementos (fogo, gelo, agua, etc...) caracterizam determida espécie
 tipo varchar(25),
 subTipo varchar(25),
 
 -- Algumas espécies podem evoluir para um ou mais tipos de espécies já existentes, 
 -- o campo preEvolucao informa qual o estágio anterior de determinada espécie.
 preEvolucao INT,
 FOREIGN KEY (preEvolucao) REFERENCES especiePokemon(idEspecie)
 );

CREATE TABLE localOrigem
 (idOrigem INT PRIMARY KEY AUTO_INCREMENT,
 cidade VARCHAR(45),
 regiao VARCHAR(45)
 )AUTO_INCREMENT=100;


 CREATE TABLE treinador(
 idtreinador INT PRIMARY KEY AUTO_INCREMENT,
 nomeTreinador VARCHAR(45),
 fkOrigem INT,
 FOREIGN KEY (fkOrigem)  REFERENCES localOrigem (idOrigem)
 ) AUTO_INCREMENT=1000;


CREATE TABLE pokemon
 (idpokemon INT,
 fktreinador INT,
 fkespecie INT,
 nivel INT NOT NULL,
 CHECK (nivel<0 or nivel<=100),
 PRIMARY KEY(fktreinador,fkespecie,idpokemon),
 FOREIGN KEY (fktreinador) REFERENCES treinador (idtreinador),
 FOREIGN KEY (fkespecie) REFERENCES especiePokemon(idEspecie));
 
INSERT INTO especiePokemon VALUES
	 (1,'Bulbasaur','grama','venenoso',NULL),
	 (2,'Ivyasaur','grama','venenoso',1),
	 (3,'Venusaur','grama','venenoso',2),
	 (4,'Charmander','fogo',NULL ,NULL),
	 (5,'Pikachu','eletrico',NULL, NULL),
	 (6,'Raichu','eletrico',NULL,5),
	 (7,'Oddish','Grama','venenoso', NULL),
	 (8,'Gloom','Grama','venenoso', 7),
	 (9,'Vileplume','Grama','venenoso', 7),
	 (10,'Chansey','Normal',NULL,NULL),
	 (11, 'Scyther','inseto','voador',NULL),
     (12, 'Lapras','água','gelo',NULL),
	 (13,'Articuno','Gelo','Voador',NULL),
	 (14,'Zaptos','Eletrico','Voador',NULL),
	 (15,'Moltres','Fogo','Voador',NULL);
 

 
 INSERT INTO localOrigem (cidade, regiao) VALUES
 ('Pallet','Kanto'),
 ("Paniola Town","Alola"),
 ("Floarama","Sinnoh"),
 ("Azalea Town","Johto"),
 ("Petalburg ","Hoenn");
 
 INSERT INTO treinador (nomeTreinador,fkOrigem) VALUES
 ('Yuki Kato',100),
 ('Gurin Leaf',100),
 ('Hikari Koki',101),
 ('Rosa Mei', 102);
 
 insert into pokemon values
 -- (idPokemon, fkTreinador,fkEspecie,Nivel)
  (1,1000,1,8),
  (2,1000,4,15),
  (3,1000,5,20),
  (1,1001,2,16),
  (2,1001,6,34),
  (3,1001,7,24),
  (1,1002,3,58),
  (2,1002,8,44),
  (3,1002,9,54),
  (1,1003,10,60),
  (2,1003,11,90),
  (3,1003,12,86),
  (4,1003,5,99);
  
  -- Exibições dos dados das tabelas criadas separadamente;
	-- Tabela especiePokemon
    SELECT * FROM especiePokemon;
    
    SELECT 
		especiePokemon.* ,
        preEvo.nomeEspecie as 'Nome pré Evolucão'
		FROM especiePokemon
			LEFT JOIN especiePokemon as preEvo
				ON especiePokemon.preEvolucao=preEvo.idEspecie; 
    
    -- Tabela treinador
    SELECT * FROM treinador; 
    
    -- Tabela localOrigem
    SELECT * FROM localOrigem;
    
    -- Tabela pokemon
    SELECT * FROM pokemon;
  
  
  -- Exibições dos dados das tabelas, de forma correspondente;
  -- Exibir dados dos treinadores e seus respectivos locais de origem
  
  SELECT * FROM treinador 
	INNER JOIN localOrigem
		ON idOrigem=fkOrigem;
   
   -- Exibir dados dos locais de origem e dos treinadores que ali nasceram, se houver
   SELECT * FROM localOrigem
		LEFT JOIN treinador
			ON idOrigem=fkOrigem;
   
   -- Exibir dados dos treinadores e local de origem dos treinadores que nasceram em um local especifico
  SELECT * FROM treinador 
	   INNER JOIN localOrigem 
			ON idOrigem=fkOrigem           
				WHERE idOrigem=100; 
  
-- Exibir todos os dados relacionados a um determinado treinador
	  SELECT
		treinador.*, 
		localOrigem.*,
		pokemon.nivel,
		especiePokemon.* ,
		preEvo.nomeEspecie AS 'Nome pré Evolucão'
			FROM treinador
				INNER JOIN pokemon ON fktreinador=idtreinador
				INNER JOIN localOrigem ON fkOrigem=idOrigem 
				INNER JOIN especiePokemon ON fkEspecie=idEspecie
				LEFT JOIN especiePokemon AS preEvo ON especiePokemon.preEvolucao=preEvo.idEspecie
					WHERE idtreinador= 1000;


-- Exibir dados de todas as espécies de pokemon e dos treinadores que as possuem, se existirem
SELECT 
     especiePokemon.*,
     preEvo.nomeEspecie AS 'Nome pré Evolucão',
     treinador.*
		FROM especiePokemon
		  LEFT JOIN Pokemon ON fkEspecie=idEspecie
		  LEFT JOIN treinador ON fktreinador=idtreinador
		  LEFT JOIN especiePokemon AS preEvo ON especiePokemon.preEvolucao=preEvo.idEspecie;
  
  -- Exibir dados de todas as espécies de pokemon e dos treinadores que as possuem, se existirem, de um determinado tipo/subtipo de pokemon
SELECT
     especiePokemon.*,
     preEvo.nomeEspecie AS 'Nome pré Evolucão',
     treinador.*
		FROM especiePokemon
		  LEFT JOIN Pokemon ON fkEspecie=idEspecie
		  LEFT JOIN treinador ON fktreinador=idtreinador
		  LEFT JOIN especiePokemon AS preEvo ON especiePokemon.preEvolucao=preEvo.idEspecie
			WHERE especiePokemon.tipo LIKE 'gelo' OR especiePokemon.subtipo LIKE 'gelo';
  
  
  
  -- Exibir os dados dos treinadores, seus respectivos locais de origem, seus pokemons e suas informações de espécie e nível
  
  SELECT
	treinador.*, 
	localOrigem.*,
	pokemon.nivel,
	especiePokemon.* ,
	preEvo.nomeEspecie AS'Nome pré Evolucão'
		FROM treinador
			INNER JOIN pokemon ON fktreinador=idtreinador
			INNER JOIN localOrigem ON fkOrigem=idOrigem 
			INNER JOIN especiePokemon ON fkEspecie=idEspecie
			LEFT JOIN especiePokemon AS preEvo ON especiePokemon.preEvolucao=preEvo.idEspecie;

-- Exibir os dados dos pokemons, suas informações de espécie e nível, os dados de seus treinadores e seus respectivos locais de origem, apenas dos 
-- pokemons que tiverem nivel acima da média
	SELECT
		pokemon.nivel,
		especiePokemon.* ,
		preEvo.nomeEspecie AS 'Nome pré Evolucão',
		treinador.*, 
		localOrigem.*
			FROM pokemon
				INNER JOIN treinador ON fktreinador=idtreinador
				INNER JOIN localOrigem ON fkOrigem=idOrigem 
				INNER JOIN especiePokemon ON fkEspecie=idEspecie
				LEFT JOIN especiePokemon AS preEvo ON especiePokemon.preEvolucao=preEvo.idEspecie
					WHERE pokemon.nivel> (SELECT AVG(nivel) FROM pokemon);	


-- Exibir os dados da tabela associativa com pelo menos 1 função aprendida e agrupando esses dados por um determinado campo (GROUP BY).
-- Exibir a quantidade de pokemons de cada treinador - (sem o atributo numérico) 
SELECT 
  treinador.nomeTreinador, 
     COUNT(idpokemon) as 'Quantidade de Pokemons'
   FROM pokemon 
    INNER JOIN treinador ON fktreinador=idtreinador 
     GROUP BY idtreinador;
	
-- Exibir o nivel médio dos pokemons de cada treinador
	SELECT 
		treinador.nomeTreinador, 
		TRUNCATE(AVG(pokemon.nivel),2) as 'Nivel médio'
			FROM treinador 
				INNER JOIN pokemon ON fkTreinador = idTreinador
					GROUP BY idTreinador;


  