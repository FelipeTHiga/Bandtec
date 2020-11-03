create table cliente	(
idCliente int primary key auto_increment,
nome varchar(30),
telefoneFixo varchar(20),
telefoneCelular varchar(20),
rua varchar(30),
numero int
)auto_increment=1;


insert into cliente (nome,telefoneFixo, telefoneCelular, rua, numero) values
			("Bruno Alves",'1112930485','1132183274','Rua das ameixas','312'),
			('Artur Santos', '1131238532','112314846','Rua Ipiranga','32'),
			('Luisa Alves','1112394823','123812937','Rua Bruno Barros', '20'),
			('Alberto Barros', '11912658475','123982483','Rua do padre', '65'),
			('Ana Melo','1137543576','123817494','Rua doze', '123'),
			('Carol Dias','1185746493','9932847121','Rua Holanbra','966'),
			('Júlio Fernandes','11938504070','238174643','Rua Ilha Seca', '241'),
			('Estevan Alves','11970169306','12381274312','Rua das rosas', '239'),
			('Raissa Araujo','1192482375','3124187273', 'Rua Pernambuco', '49');


select * from cliente;

create table pet
	(idPet int primary key auto_increment,
	nome varchar(40),
    tipo varchar(30),
	raca varchar(40),
	dataNascimento date,
    fkCliente int,
    foreign key (fkCliente) references cliente(idCliente) 
    )auto_increment=101;
    
	desc pet;
    
insert into pet (nome,tipo,raca,dataNascimento,fkCliente) values
			("Pelotas","Cachorro","Vira-lata",'2020-01-09',1),
			("Princesa","Cachorro","Vira-lata",'2016-01-03',1),
			("Kevinho ","Cachorro","Vira-lata",'2012-03-12',2),
            ("Bino","Cachorro","Dalmata",'2015-09-10' ,3),
			("Thor","Cachorro","Labrador",'2019-10-02' ,4),
			("Botas","Gato","Persa",'2011-08-03',5),
			("Dona","Gato","Siames", '2018-09-13 ',5),
			("Sidy","Gato","Ragdoll", '2019-10-12',7),
			("Arthur","Ave","Calopsita",'2018-01-01' ,8),
			("Bolinha","Roedor","Hamster",'2020-02-01' ,9),
			("Banana","Gato","Persa",'2016-02-04' ,3);


select * from pet;
-- Altere o tamanho da coluna nome do cliente
alter table cliente modify column nome varchar(40);
desc cliente;
-- Alterar o telefone de um determinado cliente.
update cliente set telefoneFixo ='129310484' where idCliente =9;
-- Excluir algum petprojeto
delete from pet where idpet= 111;