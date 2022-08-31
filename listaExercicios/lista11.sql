CREATE DATABASE dev_ti_2022;

use dev_ti_2022;

show tables;

create table if not exists pessoa (
id_pessoa int auto_increment primary key,
nome varchar(50) not null,
endereco varchar(70) not null,
estado char(2) not null default 'SC',
data_nascimento date not null default (date_format(now(), '%Y-%m-%d')),
sexo enum('m','f','n') not null default 'n',
salario decimal(10,2) not null check (salario >= 0 ) default 1000.00	
) engine = InnoDB;

DESCRIBE pessoa;

INSERT INTO pessoa VALUES(null, 'André', 'Av.X, 10', 'RJ', '1980-01-01', 'm', 1000.00);
INSERT INTO pessoa VALUES(null, 'Maria', 'Av.X, 50', 'RJ', '1970-10-31', 'f', 3000.00);
INSERT INTO pessoa VALUES(null, 'Luis', 'Rua Y, 25', 'PR', '1990-05-15', 'm', 1000.00);
INSERT INTO pessoa VALUES(null, 'Ana', 'Rua Y, 50', 'PR', '2000-02-28', 'f', 4300.00);
INSERT INTO pessoa VALUES(null, 'Augusto', 'Av.Z, 80', 'SC', '1995-08-17', 'm', 8600.00);
INSERT INTO pessoa VALUES(null, 'Ricardo', 'Av.X, 50', 'PR', '2005-07-16', 'm', 1500.00);
INSERT INTO pessoa VALUES(null, 'Thais', 'Rua Z, 20', 'SP', '1960-06-06', 'f', 10000.00);
INSERT INTO pessoa VALUES(null, 'Pedro', 'Rua Z, 100', 'SP', '1980-09-05', 'm', 8900.00);
INSERT INTO pessoa VALUES(null, 'Flavia', 'Av.Z, 40', 'SC', '1980-01-01', 'f', 2300.00);
INSERT INTO pessoa VALUES(null, 'Patrícia', 'Alameda W, 42', 'SP', '1985-11-23', 'f', 15000.00);

select * from pessoa;

update pessoa set data_nascimento = '1998-09-07' where id_pessoa = 4;

update pessoa set salario = 9000.00 where id_pessoa = 8;

update pessoa set salario = 8500.00 where id_pessoa = 5;

INSERT INTO pessoa VALUES(null, 'Fulano', 'Rua F', '2000-01-01', 'p', 1000.00);

INSERT INTO pessoa VALUES(null, 'Fulano', 'Rua F', '2000-01-01', 'm', -1000.00);

select * from pessoa;

select nome, salario from pessoa;

select nome from pessoa order by nome asc;

select nome, data_nascimento, salario from pessoa order by data_nascimento desc, salario asc;

select nome from pessoa where sexo = 'f';

select sexo, avg(salario) as 'média salarial' from pessoa group by sexo; 

select sexo, concat('R$ ',lpad(format(avg(salario), 2,'de_DE'),20,' ')) as 'média salarial' from pessoa group by sexo;

select lpad(rpad(sexo,4,'*'),7,'*') as 'sexo', concat('R$ ',lpad(format(avg(salario), 2,'de_DE'),20,' ')) as 'média salarial' from pessoa group by sexo;

select sexo, avg(salario) as 'média salarial' from pessoa group by sexo having avg(salario) > 5000.00;

select max(salario) as 'maior salário', min(salario) as 'menor salário' from pessoa;

select lpad(rpad(estado,4,'*'),7,'*') as 'estado', concat('R$ ',lpad(format(avg(salario), 2,'de_DE'),20,' ')) as 'média salarial' from pessoa group by estado order by avg(salario) desc;

select lpad(rpad(estado,4,'*'),7,'*') as 'estado', concat('R$ ',lpad(format(avg(salario), 2,'de_DE'),20,' ')) as 'média salarial' from pessoa group by estado  having avg(salario) >= 5000.00 order by avg(salario) desc;

select nome,estado from pessoa where estado like("%SC") or estado like("%PR");

select nome,estado,data_nascimento from pessoa where year('1980-01-01') >= year(data_nascimento);

select nome,estado,data_nascimento from pessoa where year('1980-01-01') >= year(data_nascimento) and estado = 'SP';

INSERT INTO pessoa (nome, endereco)
VALUES('Fulano', 'Rua dos Fulanos');

select * from pessoa where nome like('Fulano');

delete from pessoa where id_pessoa = 11;

select * from pessoa where endereco like('%Rua%');

select * from pessoa where endereco not like('%Alameda%');

select nome,date_format(data_nascimento,'%d de %M de %Y') as 'Data Nascimento' from pessoa where data_nascimento between '1985-09-01' and '2000-04-15';

set lc_time_names = 'pt_BR';

select nome,date_format(data_nascimento,'%d de %M de %Y') as 'Data Nascimento' from pessoa where data_nascimento between '1985-09-01' and '2000-04-15';

select count(*) as 'Quantidade de pessoas nascidas entre 1985-09-01 e 2000-04-15 ' from pessoa where data_nascimento between '1985-09-01' and '2000-04-15';

select * from pessoa where nome not like('%André%') and salario not like('%1000.00%');

select * from pessoa where nome not like('%André%') or salario not like('%1000.00%');

truncate pessoa;

drop table pessoa;

drop database dev_ti_2022;
