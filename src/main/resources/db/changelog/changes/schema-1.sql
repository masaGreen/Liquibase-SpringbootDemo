--liquibase formatted sql

--changeset author:id

CREATE TABLE IF NOT EXISTS persons (
    id INT PRIMARY KEY,
    name VARCHAR(255)
)