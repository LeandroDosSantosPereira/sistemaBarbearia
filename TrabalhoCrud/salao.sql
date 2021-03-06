CREATE DATABASE SALAO;
USE SALAO;

CREATE TABLE USUARIOS
(
  ID_USUARIO INT PRIMARY KEY AUTO_INCREMENT,
  NOME_USUARIO VARCHAR(80),
  TELEFONE_USUARIO VARCHAR(15),
  LOGIN_USUARIO VARCHAR(20) NOT NULL UNIQUE,
  SENHA_USUARIO VARCHAR(15)
);

CREATE TABLE CLIENTES
(
   ID_CLIENTE INT PRIMARY KEY AUTO_INCREMENT,
   NOME_CLIENTE VARCHAR(80) NOT NULL,
   FONE_CLIENTE VARCHAR(15),
   ENDERECO_CLIENTE VARCHAR(80)  NOT NULL,
   CIDADE_CLIENTE VARCHAR(30) NOT NULL
);

CREATE TABLE FUNCIONARIOS
(
  ID_FUNCIONARIO INT PRIMARY KEY AUTO_INCREMENT,
  NOME_FUNCIONARIO VARCHAR(80) NOT NULL  
);

CREATE TABLE SERVICO
(
 ID_SERVICO INT PRIMARY KEY AUTO_INCREMENT,
 NOME_SERVICO VARCHAR(20),
 VALOR_SERVICO DECIMAL(10,2)
);

CREATE TABLE ORDEM_SERVICO
(
 ORDEM_ID INT PRIMARY KEY AUTO_INCREMENT,
 ORDEM_DATA TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
 ID_CLIENTE INT NOT NULL,
 FOREIGN KEY (ID_CLIENTE) REFERENCES CLIENTES(ID_CLIENTE),
 ID_FUNCIONARIO INT NOT NULL,
 FOREIGN KEY (ID_FUNCIONARIO) REFERENCES FUNCIONARIOS(ID_FUNCIONARIO),
 ID_SERVICO INT NOT NULL,
 FOREIGN KEY (ID_SERVICO) REFERENCES SERVICO(ID_SERVICO)
);


