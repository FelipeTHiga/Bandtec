create database pratica;

-- Criação e inserção de registros na tabela aluno
		create table aluno (
			ra int primary key auto_increment,
			nomeAluno varchar(50),
			telefone varchar(30)
		)auto_increment=1202001;

		insert into aluno (nomeAluno, telefone) values 
			("Bruno Alves",'1112930485'),
			('Artur Santos', '1131238532'),
			('Luisa Costa','1112394823'),
			('Alberto Barros', '11912658475'),
			('Ana Melo','1137543576'),
			('Carol Dias','1185746493'),
			('Júlio Fernandes',11938504070),
			('Estevan Cunha',11970169306),
			('Raissa Araujo','1192482375');
 
 
 -- Adição do campo de representantes
	    alter table aluno add column raRepresentante int;
	    alter table aluno add foreign key (raRepresentante) references aluno(ra);

-- Atribuição de representantes à alunos já existentes
	    update aluno set raRepresentante = 1202004 where ra = 1202001;    
	    update aluno set raRepresentante = 1202005 where ra = 1202002;    
	    update aluno set raRepresentante = 1202006 where ra = 1202003;    


-- Criação e inserção de registros da tabela acompanhantes
		create table acompanhantes(
					idAcomp int,
					nomeAcomp varchar(40),
					relacao varchar(30),
					fkAlunoRA int, 
                    primary key (idAcomp,fkAlunoRA),
					foreign key (fkAlunoRA) references aluno(ra)
				);

		desc acompanhantes;

		insert into acompanhantes values
		(1,'João Alves','pai',1202001),
		(2,'Maria Alves','mãe',1202001),
		(1,'Paulo Santos','pai',1202002),
		(1,'Carmen Costa','mãe',1202003),
		(1,'Roberto Barros','irmão',1202004),
		(1,'Caio Minas','namorado',1202005),
		(1,'Bruno Dias','irmão',1202006),
		(1,'Cleber Fernandes','pai',1202007),
		(2,'Maria Fernandes','pai',1202007),
		(1,'João Cunha','pai',1202008),
		(2,'Bruno Cunha','irmão',1202008),
		(1,'Kassia Araujo','irmã',1202009);

-- Criação e inserção de registros na tabela projeto
		create table projeto(
			idprojeto int primary key auto_increment,
			nomeProjeto varchar(30),
			descricao varchar(100)
		) auto_increment = 100;

		insert into projeto (nomeProjeto, descricao) values
			('GreenSensor','Monitoramento de temperatura e umidade em culturas hidropônicas'),
			('Groontech','Monitoramento de temperatura e luminosidade em estufas de fitoterápicos'),
			('Revoada','Monitoramento de temperatura em incubadoras neonatais');
    
    
-- Adição de campo fkProjeto na tabela aluno, chave estrangeira do idProjeto vindo da tabela projeto   
		alter table aluno add column fkProjeto int;
		alter table aluno add foreign key (fkProjeto) references projeto(idprojeto);
        
-- Atribuição de alunos à seus projetos
        update aluno set fkprojeto = 100 where ra in (1202001,1202002,1202003);
		update aluno set fkprojeto = 101 where ra in (1202004,1202005,1202006); 
		update aluno set fkprojeto = 102 where ra in (1202007,1202008,1202009); 


		select * from acompanhantes;
		
        desc acompanhantes;

