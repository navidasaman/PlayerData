CREATE DATABASE IF NOT EXISTS playersdb;

USE playersdb;

CREATE TABLE IF NOT EXISTS player (
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    city VARCHAR(255),
    birth_date DATE
);

INSERT INTO player (first_name, last_name, city, birth_date) VALUES ("John", "Doe", "Gothenburg", '1995-08-12');
INSERT INTO player (first_name, last_name, city, birth_date) VALUES ("Jane", "Smith", "Stockholm", '1992-11-05');
INSERT INTO player (first_name, last_name, city, birth_date) VALUES ("Alice", "Brown", "Helsingborg", '1991-07-23');
INSERT INTO player (first_name, last_name, city, birth_date) VALUES ("Mike", "Johnson", "Lund", '1992-03-22');
INSERT INTO player (first_name, last_name, city, birth_date) VALUES ("Barry", "Brown", "Kalmar", '1995-01-12');
INSERT INTO player (first_name, last_name, city, birth_date) VALUES ("Malin", "Andersson", "Visby", '2000-12-12');
INSERT INTO player (first_name, last_name, city, birth_date) VALUES ("Peter", "Parker", "Halmstad", '1994-08-04');
INSERT INTO player (first_name, last_name, city, birth_date) VALUES ("Boris", "Karlsson", "Kiruna", '1985-05-13');
INSERT INTO player (first_name, last_name, city, birth_date) VALUES ("Jennifer", "Pettersson", "Malmö", '2001-02-16');
INSERT INTO player (first_name, last_name, city, birth_date) VALUES ("Frida", "Olsson", "Västerås", '1993-03-02');