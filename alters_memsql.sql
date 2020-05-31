CREATE DATABASE IF NOT EXISTS factory;
USE factory;

SET @@GLOBAL.redundancy_level = 2;

DROP TABLE IF EXISTS departaments;
CREATE TABLE departaments(
    id BIGINT NOT NULL,
    name CHAR(20) NOT NULL,
    PRIMARY KEY(id)
);


DROP TABLE IF EXISTS employee;
CREATE TABLE employee(
    id BIGINT NOT NULL,
    name CHAR(20) NOT NULL,
    surname CHAR(20) NOT NULL,
    birthday DATE NOT NULL,
    gender      ENUM ('M','F')  NOT NULL,
    departament_id BIGINT NOT NULL,
    PRIMARY KEY(id)
);

DROP TABLE IF EXISTS salaries;
CREATE TABLE salaries(
    id BIGINT NOT NULL,
    employee_id BIGINT NOT NULL,
    salary BIGINT NOT NULL,
    fromDate DATE NOT NULL,
    toDate DATE,
    primary key (id)
)

