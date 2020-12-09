SELECT * FROM faculdade.aluno;

create table empresa (
	idEmpresa int primary key auto_increment,
    nomeEmpresa varchar(100),
    responsavel varchar(100));
    
alter table aluno add column fkEmpresa int;
alter table aluno add foreign key (fkEmpresa) references empresa(idEmpresa);
desc aluno ;

SELECT* from aluno;

Insert into empresa values
	(null,"C6","Bruna" ),
    (null,"Safra","Arthur"),
    (null, "Tivit",'Luis');

select * from empresa;

update aluno set fkEmpresa = 1 where ra = "01201005";
update aluno set fkEmpresa = 2 where ra ="01202055";	
update aluno set fkEmpresa = 3 where ra ="01202061";

select * from aluno;

select aluno.*, empresa.nomeEmpresa from aluno,empresa where idempresa=fkempresa
    