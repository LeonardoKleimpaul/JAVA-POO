CREATE DATABASE unoesc_trabalho_CRUD;

USE unoesc_trabalho_CRUD;

CREATE TABLE IF NOT EXISTS pessoa (
id_pessoa INT AUTO_INCREMENT PRIMARY KEY,
nome_pessoa VARCHAR(50) NOT NULL,
data_nascimento DATE NOT NULL,
salario DECIMAL(12, 2) NOT NULL CHECK(salario >= 0)
) ENGINE=InnoDB;

INSERT INTO pessoa VALUES(null,'Carlos','2000-05-30',1200.00);
INSERT INTO pessoa VALUES(null,'Maria','2005-01-05',1800.00);
INSERT INTO pessoa VALUES(null,'Jorge','2001-01-01',12000.00);

INSERT INTO pessoa (nome_pessoa, data_nascimento, salario) VALUES ('Claudio','1990-11-10',1790.50);

SELECT * FROM pessoa;

SELECT * FROM pessoa ORDER BY nome_pessoa asc;

SELECT * FROM pessoa ORDER BY data_nascimento asc;

SELECT * FROM pessoa ORDER BY salario asc;

UPDATE pessoa SET salario=11111.11 WHERE id_pessoa=3;

DELETE FROM pessoa WHERE id_pessoa=4;

SET lc_time_names = 'pt_BR';

SELECT nome_pessoa, date_format(data_nascimento, '%d de %M de %Y') AS 'Data Nascimento' FROM pessoa;

SELECT count(*) FROM pessoa;

SELECT max(salario) AS 'maior salário', min(salario) AS 'menor salário' FROM pessoa;

SELECT avg(salario) AS 'Média dos salários', sum(salario) AS 'Soma dos salários' FROM pessoa;