--
insert into users values (1, 'robeilaregawi@miu.edu', 'Robeil', 'Aregawi', '$2a$12$');

insert into users values (2, 'keleab@miu.edu', 'Keleab', 'Brhanemeskel', '$2a$12$');

insert into users values (3, 'soliana@miu.edu', 'Soliana', 'Robeil', '$2a$12$');

insert into users values (4, 'meron@miu.edu', 'Meron', 'Tekle', '$2a$12$');

--products

insert into product values (1, 'iPhone', 1200,4,2,1);
--
insert into product values (2, 'iPad', 900, 2,5,3);

insert into product values (3, 'Pen', 5, 3,6,3);

-- reviews

insert into review values (1,'awesome phone',5,1,2);

insert into review  values (2,'amazing phone',5,2,3);

insert into review  values (3,'awesome tablet',3,3,4);

insert into review  values (4,'awesome tablet',3,4,1);

-- Address
insert into address values (1,'176th','Seattle',98188,1);

insert into address values (2,'south', 'Seattle',98234,2);

insert into address values (3, '176th', 'Seattle',932823,3);

insert into address values (4,'north','Seattle',897723,4);

insert into category values (11,'Eletronics');

insert into category values (22,'Grocery');

insert into category values (33, 'Goods');
--

--
--INSERT INTO user (id, email, firstname, lastname, password) VALUES (1, 'uinan@miu.edu', 'umur', 'inan', '5631'); --123
--
--INSERT INTO user (id, email, firstname, lastname, password) VALUES (2, 'john@miu.edu', 'john', 'doe', '5823'); --123
--
--INSERT INTO user (id, email, firstname, lastname, password) VALUES (3, 'muhyidean@miu.edu', 'muhyidean', 'al-tarawneh', '1234'); --123
--
--INSERT INTO user (id, email, firstname, lastname, password) VALUES (4, 'levi@miu.edu', 'keith', 'levi', '103'); --123
--
--INSERT INTO user (id, email, firstname, lastname, password) VALUES (5, 'okalu@miu.edu', 'obinna', 'kalu', '896'); --123
--
--INSERT INTO user (id, email, firstname, lastname, password) VALUES (6, 'tina@miu.edu', 'tina', 'xing', '8569'); --123
---- REVIEWS
--
--INSERT INTO reviews (id,comment,usersi_id) VALUES (1,'awesome phone',1);
--
--INSERT INTO reviews (id,comment,usersi_id) VALUES (2,'amazing phone',1);
--
--INSERT INTO reviews (id,comment,usersi_id) VALUES (3,'awesome tablet',2);
--
--
----Address
--INSERT INTO address  (id,street,zip,city,user_id) VALUES (1,'2803 winfield',52553,'charlotte',2);
--
--INSERT INTO address  (id,street,zip,city,user_id) VALUES (2,'1000 4th street',62553,'Fairfield',3);
--
--INSERT INTO address  (id,street,zip,city,user_id) VALUES (3,'1578 drive ave',36553,'Otumam',1);

--INSERT INTO product (id, name, rating,price,category_id,userp_id) VALUES (3, 'cat', 5, 100,1,1);





-- USERS
--CREATE TABLE users (
--  id INT NOT NULL AUTO_INCREMENT,
--  email VARCHAR(45) NULL,
--  firstName VARCHAR(45) NULL,
--  lastName VARCHAR(45) NULL,
--  password VARCHAR(45) NULL,
--  PRIMARY KEY (id)
--);

--truncate table users restart identity cascade;

--CREATE TABLE users (
--  id INT NOT NULL,
--  email VARCHAR(45) NULL,
--  firstName VARCHAR(45) NULL,
--  lastName VARCHAR(45) NULL,
--  password VARCHAR(45) NULL,
--  PRIMARY KEY (id)
--);
--
--INSERT INTO users (id, email, first_name, last_name, password)
--VALUES (nextval('users_id_seq'), 'uinan@miu.edu', 'umur', 'inan', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123
--
--INSERT INTO users (id, email, first_name, last_name, password)
--VALUES (nextval('users_id_seq'), 'john@miu.edu', 'john', 'doe', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123
--
--INSERT INTO users (id, email, first_name, last_name, password)
--VALUES (nextval('users_id_seq'), 'muhyidean@miu.edu', 'muhyidean', 'al-tarawneh', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123
--
--INSERT INTO users (id, email, first_name, last_name, password)
--VALUES (nextval('users_id_seq'), 'levi@miu.edu', 'keith', 'levi', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123
--
--INSERT INTO users (id, email, first_name, last_name, password)
--VALUES (nextval('users_id_seq'), 'okalu@miu.edu', 'obinna', 'kalu', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123
--
--INSERT INTO users (id, email, first_name, last_name, password)
--VALUES (nextval('users_id_seq'), 'tina@miu.edu', 'tina', 'xing', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

-- ADDRESSES

--INSERT INTO address(id, city,street, zip, user_id) VALUES(nextval('address_id_seq'),'FairField','1000 N 4th Street','52557',1);
--INSERT INTO address(id, city,street, zip, user_id) VALUES(nextval('address_id_seq'),'FairField','1000 N 5th Street','52556',2);
--
---- PRODUCTS
--
--truncate table product restart identity cascade;
--
--INSERT INTO product (id, name, price)
--VALUES ( nextval('product_id_seq'),'iPhone', 1200);
--
--INSERT INTO product (id, name, price)
--VALUES (nextval('product_id_seq'), 'iPad', 900);
--
--INSERT INTO product (id, name, price)
--VALUES (nextval('product_id_seq'), 'Pen', 5);
--
---- REVIEWS
--
--INSERT INTO REVIEW (id,comment,user_id)
--VALUES (nextval('review_id_seq'),'awesome phone',1);
--
--INSERT INTO REVIEW (id,comment,user_id)
--VALUES (nextval('review_id_seq'),'amazing phone',1);
--
--INSERT INTO REVIEW (id,comment,user_id)
--VALUES (nextval('review_id_seq'),'awesome tablet',2);