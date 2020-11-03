-- Exibir os dados de todos os pets que são de um determinado tipo (por exemplo: cachorro).
SELECT * from pet where tipo like "Cach%";

SELECT * from pet where tipo = 'Cachorro';

-- Exibir apenas os nomes e as datas de nascimento dos pets.
SELECT nome,dataNascimento from pet;

-- Exibir os dados dos pets ordenados em ordem crescente pelo nome.
SELECT * from pet order by nome;

-- Exibir os dados dos clientes ordenados em ordem decrescente pelo bairro.
SELECT * from cliente order by endereco DESC;

-- Exibir os dados dos pets cujo nome comece com uma determinada letra.
SELECT * from pet where nome like "B%";

-- Exibir os dados dos clientes que têm o mesmo sobrenome.
SELECT * from cliente where nome like "%Alves";

-- Exibir os dados dos pets e dos seus respectivos donos.
SELECT * from pet, cliente where fkcliente = idcliente;
        
SELECT * from pet join cliente on fkcliente = idcliente;
        
-- Exibir os dados dos pets e dos seus respectivos donos, mas somente de um determinado cliente.
SELECT * from pet, cliente where fkcliente = idcliente and idcliente = 1
