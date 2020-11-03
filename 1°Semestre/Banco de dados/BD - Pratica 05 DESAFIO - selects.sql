
-- Exibir todos os dados de cada tabela criada, separadamente.
		select * from projeto;
        select * from aluno;
        select * from acompanhantes;
    
 -- Exibir os dados dos alunos e dos projetos correspondentes.
		select * 
        from aluno, 
			 projeto 
		where 
			 idprojeto=fkprojeto;

-- Exibir os dados dos alunos e dos seus acompanhantes.
		select * from acompanhantes,aluno where ra=fkAlunoRa;
		
        select 
			ac.nomeAcomp as 'Nome do acompanhante',
			ac.relacao as 'Relação',
            ac.idAcomp as 'Identificação do acompanhante',
            al.nomeAluno as 'Nome do aluno',
            al.ra,
            al.telefone
        from 
			acompanhantes as ac, 
            aluno as al 
		where 
			ra=fkAlunoRa;
   
 -- Exibir os dados dos alunos e dos seus representantes.
	   select 
		   aluno.nomeAluno as 'Nome do aluno',
		   aluno.telefone as 'Telefone do aluno',
		   aluno.ra as 'Ra do aluno', 
		   aluno.fkprojeto as 'Id Projeto',
           rep.ra as 'Ra do Representante',
		   rep.nomeAluno as 'Nome do representate', 
		   rep.telefone as 'Telefone do representante' 
	   from 
			aluno, 
			aluno as rep 
	   where 
			aluno.raRepresentante=rep.ra;
	   

 -- Exibir os dados dos alunos e dos projetos correspondentes, mas somente do projeto GreenSensor
		select * 
        from 
			aluno,
            projeto 
		where 
			idprojeto=fkprojeto 
		and 
            nomeProjeto = 'GreenSensor';
 		
        
        select 
			al.ra,
            al.nomeAluno as 'Nome do aluno',
            al.telefone,
            al.raRepresentante as 'RA do representante',
            pr.idprojeto,
            pr.nomeProjeto as 'Nome do projeto',
            pr.descricao as 'Descrição'
        from 
			aluno as al,
            projeto as pr
		where 
			idprojeto=fkprojeto 
		and 
            nomeProjeto = 'GreenSensor';
            
-- Exibir os dados dos alunos, dos projetos correspondentes e dos seus acompanhantes.
		select * 
        from 
			acompanhantes,
            aluno, 
            projeto 
            
		where 
			ra=fkAlunoRA
		and
			idprojeto=fkprojeto;
			


-- Desafio
		select 
			acompanhantes.nomeAcomp as 'Nome do acompanhante 1',
			acompanhantes.idAcomp as 'Id do acompanhante 1',
            acompanhantes.relacao as 'Relação 1',
            acomp2.nomeAcomp as 'Nome do acompanhante 2',
            acomp2.idAcomp as 'Id do acompanhante 2',
            acomp2.relacao as 'Relação 2',
            acompanhantes.fkAlunoRA as "RA do Aluno que irá acompanhar"
        from 
			acompanhantes, 
			acompanhantes as acomp2	
		where 
			acomp2.fkAlunoRA = acompanhantes.fkAlunoRA
		group by "RA do Aluno que irá acompanhar";
			
		
		select
			acompanhantes.fkAlunoRA as "RA do Aluno que irá acompanhar",
			acompanhantes.nomeAcomp as 'Nome do acompanhante 1',
			acompanhantes.idAcomp as 'Id do acompanhante 1',
            acompanhantes.relacao as 'Relação 1',
            acomp2.nomeAcomp as 'Nome do acompanhante 2',
            acomp2.idAcomp as 'Id do acompanhante 2'
		from 
			acompanhantes
		join
			acompanhantes as acomp2
			on acomp2.idAcomp = acompanhantes.idAcomp
			
		group by 
			fkAlunoRA;
        
        
        
        
        
        select 
			* 
		from acompanhantes, acompanhantes as ac2
        left join acompanhantes 
		on ac2.fkAlunoRA = acompanhantes.fkAlunoRA;
        
