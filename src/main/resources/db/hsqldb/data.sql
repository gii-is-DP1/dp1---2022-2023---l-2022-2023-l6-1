-- One admin user, named admin1 with passwor 4dm1n and authority admin
INSERT INTO users(username,password,enabled) VALUES ('admin1','4dm1n',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (1,'admin1','admin');
-- One owner user, named owner1 with passwor 0wn3r
INSERT INTO users(username,password,enabled) VALUES ('owner1','0wn3r',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (2,'owner1','owner');
-- One vet user, named vet1 with passwor v3t
INSERT INTO users(username,password,enabled) VALUES ('vet1','v3t',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (3,'vet1','veterinarian');
-- One player user, named player1 with passwor pl4y3r
INSERT INTO users(username,password,enabled) VALUES ('player1','pl4y3r',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (4,'player1','player');
-- One player user, named player1 with passwor pl4y3r
INSERT INTO users(username,password,enabled) VALUES ('player2','pl4y3r',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (5,'player2','player');

INSERT INTO vets(id, first_name,last_name) VALUES (1, 'James', 'Carter');
INSERT INTO vets(id, first_name,last_name) VALUES (2, 'Helen', 'Leary');
INSERT INTO vets(id, first_name,last_name) VALUES (3, 'Linda', 'Douglas');
INSERT INTO vets(id, first_name,last_name) VALUES (4, 'Rafael', 'Ortega');
INSERT INTO vets(id, first_name,last_name) VALUES (5, 'Henry', 'Stevens');
INSERT INTO vets(id, first_name,last_name) VALUES (6, 'Sharon', 'Jenkins');

INSERT INTO specialties VALUES (1, 'radiology');
INSERT INTO specialties VALUES (2, 'surgery');
INSERT INTO specialties VALUES (3, 'dentistry');

INSERT INTO vet_specialties VALUES (2, 1);
INSERT INTO vet_specialties VALUES (3, 2);
INSERT INTO vet_specialties VALUES (3, 3);
INSERT INTO vet_specialties VALUES (4, 2);
INSERT INTO vet_specialties VALUES (5, 1);

INSERT INTO types VALUES (1, 'cat');
INSERT INTO types VALUES (2, 'dog');
INSERT INTO types VALUES (3, 'lizard');
INSERT INTO types VALUES (4, 'snake');
INSERT INTO types VALUES (5, 'bird');
INSERT INTO types VALUES (6, 'hamster');
INSERT INTO types VALUES (7, 'turtle');

INSERT INTO owners VALUES (1, 'George', 'Franklin', '110 W. Liberty St.', 'Madison', '6085551023', 'owner1');
INSERT INTO owners VALUES (2, 'Betty', 'Davis', '638 Cardinal Ave.', 'Sun Prairie', '6085551749', 'owner1');
INSERT INTO owners VALUES (3, 'Eduardo', 'Rodriquez', '2693 Commerce St.', 'McFarland', '6085558763', 'owner1');
INSERT INTO owners VALUES (4, 'Harold', 'Davis', '563 Friendly St.', 'Windsor', '6085553198', 'owner1');
INSERT INTO owners VALUES (5, 'Peter', 'McTavish', '2387 S. Fair Way', 'Madison', '6085552765', 'owner1');
INSERT INTO owners VALUES (6, 'Jean', 'Coleman', '105 N. Lake St.', 'Monona', '6085552654', 'owner1');
INSERT INTO owners VALUES (7, 'Jeff', 'Black', '1450 Oak Blvd.', 'Monona', '6085555387', 'owner1');
INSERT INTO owners VALUES (8, 'Maria', 'Escobito', '345 Maple St.', 'Madison', '6085557683', 'owner1');
INSERT INTO owners VALUES (9, 'David', 'Schroeder', '2749 Blackhawk Trail', 'Madison', '6085559435', 'owner1');
INSERT INTO owners VALUES (10, 'Carlos', 'Estaban', '2335 Independence La.', 'Waunakee', '6085555487', 'owner1');


INSERT INTO players(id,first_name,last_name,email,username) VALUES (1, 'Mario', 'Casas', 'mariocasas69@gmail.com','player1');
INSERT INTO players(id,first_name,last_name,email,username) VALUES (2, 'Pablo', 'Iglesias', 'pablito29@gmail.com','player2');

INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (1, 'Leo', '2010-09-07', 1, 1);
INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (2, 'Basil', '2012-08-06', 6, 2);
INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (3, 'Rosy', '2011-04-17', 2, 3);
INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (4, 'Jewel', '2010-03-07', 2, 3);
INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (5, 'Iggy', '2010-11-30', 3, 4);
INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (6, 'George', '2010-01-20', 4, 5);
INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (7, 'Samantha', '2012-09-04', 1, 6);
INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (8, 'Max', '2012-09-04', 1, 6);
INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (9, 'Lucky', '2011-08-06', 5, 7);
INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (10, 'Mulligan', '2007-02-24', 2, 8);
INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (11, 'Freddy', '2010-03-09', 5, 9);
INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (12, 'Lucky', '2010-06-24', 2, 10);
INSERT INTO pets(id,name,birth_date,type_id,owner_id) VALUES (13, 'Sly', '2012-06-08', 1, 10);

INSERT INTO visits(id,pet_id,visit_date,description) VALUES (1, 7, '2013-01-01', 'rabies shot');
INSERT INTO visits(id,pet_id,visit_date,description) VALUES (2, 8, '2013-01-02', 'rabies shot');
INSERT INTO visits(id,pet_id,visit_date,description) VALUES (3, 8, '2013-01-03', 'neutered');
INSERT INTO visits(id,pet_id,visit_date,description) VALUES (4, 7, '2013-01-04', 'spayed');

INSERT INTO cards(id,number,suit, color) VALUES (1, 1, 'DIAMONDS', 'RED');
INSERT INTO cards(id,number,suit, color) VALUES (2, 2, 'DIAMONDS', 'RED');
INSERT INTO cards(id,number,suit, color) VALUES (3, 3, 'DIAMONDS', 'RED');
INSERT INTO cards(id,number,suit, color) VALUES (4, 4, 'DIAMONDS', 'RED');
INSERT INTO cards(id,number,suit, color) VALUES (5, 5, 'DIAMONDS', 'RED');
INSERT INTO cards(id,number,suit, color) VALUES (6, 6, 'DIAMONDS', 'RED');
INSERT INTO cards(id,number,suit, color) VALUES (7, 7, 'DIAMONDS', 'RED');
INSERT INTO cards(id,number,suit, color) VALUES (8, 8, 'DIAMONDS', 'RED');
INSERT INTO cards(id,number,suit, color) VALUES (9, 9, 'DIAMONDS', 'RED');
INSERT INTO cards(id,number,suit, color) VALUES (10, 10, 'DIAMONDS', 'RED');
INSERT INTO cards(id,number,suit, color) VALUES (11, 11, 'DIAMONDS', 'RED');
INSERT INTO cards(id,number,suit, color) VALUES (12, 12, 'DIAMONDS', 'RED');
INSERT INTO cards(id,number,suit, color) VALUES (13, 13, 'DIAMONDS', 'RED');

INSERT INTO cards(id,number,suit, color) VALUES (14, 1, 'HEARTS', 'RED');
INSERT INTO cards(id,number,suit, color) VALUES (15, 2, 'HEARTS', 'RED');
INSERT INTO cards(id,number,suit, color) VALUES (16, 3, 'HEARTS', 'RED');
INSERT INTO cards(id,number,suit, color) VALUES (17, 4, 'HEARTS', 'RED');
INSERT INTO cards(id,number,suit, color) VALUES (18, 5, 'HEARTS', 'RED');
INSERT INTO cards(id,number,suit, color) VALUES (19, 6, 'HEARTS', 'RED');
INSERT INTO cards(id,number,suit, color) VALUES (20, 7, 'HEARTS', 'RED');
INSERT INTO cards(id,number,suit, color) VALUES (21, 8, 'HEARTS', 'RED');
INSERT INTO cards(id,number,suit, color) VALUES (22, 9, 'HEARTS', 'RED');
INSERT INTO cards(id,number,suit, color) VALUES (23, 10, 'HEARTS', 'RED');
INSERT INTO cards(id,number,suit, color) VALUES (24, 11, 'HEARTS', 'RED');
INSERT INTO cards(id,number,suit, color) VALUES (25, 12, 'HEARTS', 'RED');
INSERT INTO cards(id,number,suit, color) VALUES (26, 13, 'HEARTS', 'RED');

INSERT INTO cards(id,number,suit, color) VALUES (27, 1, 'SPADES', 'BLACK');
INSERT INTO cards(id,number,suit, color) VALUES (28, 2, 'SPADES', 'BLACK');
INSERT INTO cards(id,number,suit, color) VALUES (29, 3, 'SPADES', 'BLACK');
INSERT INTO cards(id,number,suit, color) VALUES (30, 4, 'SPADES', 'BLACK');
INSERT INTO cards(id,number,suit, color) VALUES (31, 5, 'SPADES', 'BLACK');
INSERT INTO cards(id,number,suit, color) VALUES (32, 6, 'SPADES', 'BLACK');
INSERT INTO cards(id,number,suit, color) VALUES (33, 7, 'SPADES', 'BLACK');
INSERT INTO cards(id,number,suit, color) VALUES (34, 8, 'SPADES', 'BLACK');
INSERT INTO cards(id,number,suit, color) VALUES (35, 9, 'SPADES', 'BLACK');
INSERT INTO cards(id,number,suit, color) VALUES (36, 10, 'SPADES', 'BLACK');
INSERT INTO cards(id,number,suit, color) VALUES (37, 11, 'SPADES', 'BLACK');
INSERT INTO cards(id,number,suit, color) VALUES (38, 12, 'SPADES', 'BLACK');
INSERT INTO cards(id,number,suit, color) VALUES (39, 13, 'SPADES', 'BLACK');

INSERT INTO cards(id,number,suit, color) VALUES (40, 1, 'CLUBS', 'BLACK');
INSERT INTO cards(id,number,suit, color) VALUES (41, 2, 'CLUBS', 'BLACK');
INSERT INTO cards(id,number,suit, color) VALUES (42, 3, 'CLUBS', 'BLACK');
INSERT INTO cards(id,number,suit, color) VALUES (43, 4, 'CLUBS', 'BLACK');
INSERT INTO cards(id,number,suit, color) VALUES (44, 5, 'CLUBS', 'BLACK');
INSERT INTO cards(id,number,suit, color) VALUES (45, 6, 'CLUBS', 'BLACK');
INSERT INTO cards(id,number,suit, color) VALUES (46, 7, 'CLUBS', 'BLACK');
INSERT INTO cards(id,number,suit, color) VALUES (47, 8, 'CLUBS', 'BLACK');
INSERT INTO cards(id,number,suit, color) VALUES (48, 9, 'CLUBS', 'BLACK');
INSERT INTO cards(id,number,suit, color) VALUES (49, 10, 'CLUBS', 'BLACK');
INSERT INTO cards(id,number,suit, color) VALUES (50, 11, 'CLUBS', 'BLACK');
INSERT INTO cards(id,number,suit, color) VALUES (51, 12, 'CLUBS', 'BLACK');
INSERT INTO cards(id,number,suit, color) VALUES (52, 13, 'CLUBS', 'BLACK');


INSERT INTO statistics(id,games,games_won,games_lost,total_score,player_id) VALUES (1, 120, 20, 100, 32, 1);
INSERT INTO statistics(id,games,games_won,games_lost,total_score,player_id) VALUES (2, 100, 20, 100, 32, 2);

INSERT INTO achievements(id, name, description,condition_unlocked,is_unlocked, image, statistics_id) VALUES (1, 'Friki','Has alcanzado las 100 partidas' ,'hola', true, 'imagen_logro.png', 1);

INSERT INTO friends(id, name) VALUES (1, 'Iglesias')