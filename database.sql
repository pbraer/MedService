CREATE DATABASE MedServ;
USE MedServ;
SET GLOBAL time_zone = '+7:00';

CREATE TABLE doctors (
    id INT PRIMARY KEY AUTO_INCREMENT,
    pass TEXT NOT NULL,
    email TEXT NOT NULL,
    firstname TEXT,
    lastname TEXT,
    middlename TEXT,
    qualif TEXT,
    image VARCHAR(1024) DEFAULT '/tmp/default.jpg',
    monday BOOLEAN,
    tuesday BOOLEAN,
    wednesday BOOLEAN,
    thursday BOOLEAN,
    friday BOOLEAN,
    saturday BOOLEAN,
    timeFrom TIME,
    timeTo TIME
);

INSERT INTO doctors (pass, email)
VALUES
('1234!M', 'mayMoris@gmail.com'),
('1234!A', 'annAger@gmail.com'),
('1234!K', 'kateKrull@gmail.com'),
('1234!B', 'bobBrayan@gmail.com'),
('1234!L', 'luceLucart@gmail.com')