            
--liquibase formatted sql

--changeset macharia:david

CREATE TABLE books(
    id INT PRIMARY KEY,
    book VARCHAR(255)
);