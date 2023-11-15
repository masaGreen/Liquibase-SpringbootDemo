--liquibase formatted sql

--changeset macharia:5

CREATE TABLE IF NOT EXISTS persons (
    id INT PRIMARY KEY,
    name VARCHAR(255)
)