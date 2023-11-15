--liquibase formatted sql

--changeset macharia:david

CREATE TABLE persons(
    id INT PRIMARY KEY,
    name VARCHAR(255)
);

--changeset macharia:2

INSERT INTO persons (id, name) VALUES (3,'Njeri');
INSERT INTO persons (id, name) VALUES (4, 'Plans');