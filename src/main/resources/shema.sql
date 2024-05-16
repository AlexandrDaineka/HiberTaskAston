create database Homework_crud;

use Homework_crud;

CREATE TABLE Workers (
                         id INT PRIMARY KEY,
                         name VARCHAR(50),
                         company_id INT,
                         project_id INT,
                         FOREIGN KEY (company_id) REFERENCES Companies(id),
                         FOREIGN KEY (project_id) REFERENCES Projects(id)
);

CREATE TABLE Companies (
                           id INT PRIMARY KEY,
                           name VARCHAR(50)
);

CREATE TABLE Projects (
                          id INT PRIMARY KEY,
                          name VARCHAR(50)
);

CREATE TABLE Salaries (
                          id INT PRIMARY KEY,
                          amount DECIMAL(10, 2),
                          worker_id INT,
                          FOREIGN KEY (worker_id) REFERENCES Workers(id)
);

CREATE TABLE Bosses (
                        id INT PRIMARY KEY,
                        name VARCHAR(50)
);

CREATE TABLE WorkerBoss (
                            worker_id INT,
                            boss_id INT,
                            PRIMARY KEY (worker_id, boss_id),
                            FOREIGN KEY (worker_id) REFERENCES Workers(id),
                            FOREIGN KEY (boss_id) REFERENCES Bosses(id)
);
drop database homework_crud;