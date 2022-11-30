show databases;

create database digital_innovation_one;

show databases;

select database()

USE digital_innovation_one;

DROP TABLE aluno;

CREATE TABLE aluno (
id INTEGER PRIMARY KEY AUTO_INCREMENT,
idade INTEGER NOT NULL,
nome VARCHAR(80) NOT NULL,
estado_id INTEGER NOT NULL
);

SELECT * FROM aluno;

INSERT INTO aluno(idade, nome, estado_id) VALUES (29, "Daniel", 1);
INSERT INTO aluno(idade, nome, estado_id) VALUES (20, "Joao", 1);
INSERT INTO aluno(idade, nome, estado_id) VALUES (30, "Pedro", 1);


CREATE TABLE estado (
id INTEGER PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(80) NOT NULL,
sigla CHARACTER(2) NOT NULL
);

SELECT * FROM estado;

INSERT INTO estado(nome, sigla) VALUES ("Rio de Janeiro", "RJ");
INSERT INTO estado(nome, sigla) VALUES ("São Paulo", "SP");

SELECT * FROM aluno WHERE id = 3

