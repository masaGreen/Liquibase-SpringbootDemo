            
--liquibase formatted sql

--changeset macharia:da

CREATE TABLE lables(
    id INT PRIMARY KEY,
    label VARCHAR(255)
);