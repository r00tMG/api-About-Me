DROP TABLE IF EXISTS employees;

CREATE TABLE employees (
     id INT AUTO_INCREMENT  PRIMARY KEY NOT NULL,
     first_name VARCHAR(250) NOT NULL,
     last_name VARCHAR(250) NOT NULL

);
INSERT INTO employees (first_name, last_name) VALUES
                      ('CISSE', 'PENDA'),
                      ('NDIAYE', 'MAGUETTE');

