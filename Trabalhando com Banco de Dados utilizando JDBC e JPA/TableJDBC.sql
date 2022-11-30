CREATE database digital_innovation_one;

show databases;

select database();

USE digital_innovation_one;

CREATE TABLE aluno (
id INTEGER PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(80) NOT NULL,
idade INTEGER NOT NULL,
estado CHARACTER(2) NOT NULL
);

SELECT * FROM aluno;

INSERT INTO aluno(nome, idade, estado) VALUES ('PEDRO', 20, 'RJ');
INSERT INTO aluno(nome, idade, estado) VALUES ('Maria', 35, 'AC');
INSERT INTO aluno(nome, idade, estado) VALUES ('Joao', 10, 'SC');
INSERT INTO aluno(nome, idade, estado) VALUES ('Ana', 51, 'GO');

SELECT * FROM aluno;