USE adlister_db;

DROP TABLE IF EXISTS users;

CREATE TABLE users(
    id INT UNSIGNED AUTO_INCREMENT,
    username VARCHAR(100),
    email VARCHAR(150),
    password VARCHAR(50),
    PRIMARY KEY(id)
);