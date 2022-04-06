USE adlister_db;

DROP TABLE IF EXISTS ads;

CREATE TABLE ads(
    id INT UNSIGNED AUTO_INCREMENT,
    user_id INT UNSIGNED,
    title VARCHAR(150),
    description VARCHAR(500),
    PRIMARY KEY(id),
    FOREIGN KEY (user_id) REFERENCES users (id)
);