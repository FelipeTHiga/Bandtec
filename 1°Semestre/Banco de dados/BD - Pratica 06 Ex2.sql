create table pessoa (
	idPessoa int primary key auto_increment,
    nome varchar(45),
    dataNasc date,
    profissao varchar(45)
);

insert into pessoa (nome,dataNasc,profissao) values
	('Bruno','2000-09-29','Médico'),
	('Artur','1998-01-19','Engenheiro'),
	('Luis','1978-12-09','Engenheiro'),
    ('Anna Julia','1999-03-19','Arquiteta'),
    ('Cinthia','1990-02-04','Médica'),
    ('Victor','1999-01-20','Secretário');
    
    
    select * from pessoa;
create table gasto(
	idGasto int primary key auto_increment,
    descricao varchar(45),
    valor float,
    dataGasto date,
    fkpessoa int,
    foreign key (fkpessoa) references pessoa(idpessoa)
);

insert into gasto( descricao, valor,dataGasto, fkpessoa) values
	('Livros de Anatomia Humana', '130.99','2020-10-10',1),
	('StarBucks - cookie', 30.99,'2020-10-10',1),
    ('Zara - roupas', 99.90, '2019-12-23',2),
    ('Iphone X', 9999.99,'2020-09-17',3),
    ('Livros sobre arquitetura', 200,'2020-01-07',4),
    ('Roupas', 100,'2019-01-29',5),
	('Ifood', 40,'2019-01-29',5),
    ('RP no lol',50,'2020-10-20',6),
    ('Starbucks para o Felipe', 30, '2020-12-20',6),
    ('Burguer King para o Felipe', 25,'2020-12-20',6)
    ;
    
    select * from gasto;
    
	select * from gasto where descricao like 'Livros%';
    select * from pessoa where profissao like 'médic%';
    
    select * from pessoa, gasto where idPessoa=fkpessoa;
    
	select * from pessoa, gasto where idPessoa=fkpessoa and idpessoa=6;
    
    update pessoa set profissao='Nenhuma' where idpessoa = 6;
    
    delete from gasto where idgasto=14;
	delete from pessoa where idpessoa=3;