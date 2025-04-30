-- Criação do banco de dados
CREATE DATABASE IF NOT EXISTS banco_java;
USE banco_java;

-- Tabela de clientes
CREATE TABLE IF NOT EXISTS clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL
);

-- Tabela de contas
CREATE TABLE IF NOT EXISTS contas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cliente_id INT NOT NULL,
    saldo DOUBLE DEFAULT 0,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id)
);
