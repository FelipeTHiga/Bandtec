-- Criar database: 

        create database AC1_01202061; 

-- Usar database 

        use AC1_01202061;          

-- Criar tabela de pets 

        create table pet( 

        id_pet int primary key auto_increment, 

        especie varchar(100) not null, 

        nome varchar(100), 

        nascimento datetime, 

        castrado char(3) 

        )auto_increment=100; 

  

-- obs: campo "castrado" cadastrar apenas "sim" ou "não"  

  

-- Adicionar coluna complementar 

        alter table pet add column genero varchar(10); 

         

-- Preenchimento da tabela 

        insert into pet values 

(null,'cachorro','Rex','2010-9-10 19:30:55', 'sim','macho'), 

(null,'gato','Agata','2018-12-15 06:41:32','sim','fêmea'), 

(null,'cachorro','Bob','2020-08-10 17:54:12','não','macho'), 

(null,'gato','Alex','2014-02-13 15:32:22','não','macho'), 

(null,'papagaio','Sara','2019-2-25 13:21:42','não','fêmea'), 

(null,'cachorro','Perola','2012-11-16 16:41:33','sim','fêmea'), 

(null,'hamster','Bolinha','2019-12-13 20:00:22','não','macho'); 

  

  

-- Leituras feitas pelo usuário Leitor -- 

  

-- Exibição de todos os dados da tabela 

select * from pet; 

  

-- Exibir todos os dados da tabela em ordem descrescente de nomes 

select * from pet order by nome desc; 

  

-- Exibir apenas os dados da coluna especie 

select especie from pet; 

  

-- Exibir todos os dados da tabela, cujo genero tenha como penúltima letra a letra H 

select * from pet where genero like '%h_'; 

  

-- Exibir todos os dados da tabela, cujo nome tenha termine com a letra X 

select * from pet where nome like '%x'; 

  

-- -------------------------------------------------------- 

  

  

-- Atualizar dado da tabela, o gato Alex foi castrado (Id =103) 

update pet set castrado="não" where id_pet = 103; 

  

-- Exibir id do pet, nome e se esta castrado para verificar a atualização 

select id_pet,nome,castrado from pet where id_pet = 103; 

  

-- Eliminar o pet hamster (id-106) da tabela 

delete from pet where id_pet = 106; 

  

-- Exibir todos os dados da tabela para verificar a exclusão 

select * from pet; 

  

-- Eliminar tabela 

drop table pet; 

  
-- Eliminar banco de dados 

drop database AC1_01202061; 












	