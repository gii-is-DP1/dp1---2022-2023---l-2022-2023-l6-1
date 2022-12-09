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

INSERT INTO board(id,background,height,width) VALUES (1,'resources/images/background.jpg',1080,1920);

INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (1, 1, 'DIAMONDS', 'RED', 0 ,0 , 0, TRUE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (2, 2, 'DIAMONDS', 'RED', 0 ,0 , 1, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (3, 3, 'DIAMONDS', 'RED', 0 ,0 , 2, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (4, 4, 'DIAMONDS', 'RED', 0 ,0 , 3, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (5, 5, 'DIAMONDS', 'RED', 0 ,0 , 4, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (6, 6, 'DIAMONDS', 'RED', 0 ,0 , 5, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (7, 7, 'DIAMONDS', 'RED', 0 ,0 , 6, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (8, 8, 'DIAMONDS', 'RED', 0 ,0 , 7, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (9, 9, 'DIAMONDS', 'RED', 0 ,0 , 8, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (10, 10, 'DIAMONDS', 'RED', 0 ,0 , 9, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (11, 11, 'DIAMONDS', 'RED', 0 ,0 , 10, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (12, 12, 'DIAMONDS', 'RED', 0 ,0 , 11, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (13, 13, 'DIAMONDS', 'RED', 0 ,0 , 12, FALSE, 1);

INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (14, 1, 'HEARTS', 'RED', 0 ,0 , 13, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (15, 2, 'HEARTS', 'RED', 0 ,0 , 14, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (16, 3, 'HEARTS', 'RED', 0 ,0 , 15, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (17, 4, 'HEARTS', 'RED', 0 ,0 , 16, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (18, 5, 'HEARTS', 'RED', 0 ,0 , 17, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (19, 6, 'HEARTS', 'RED', 0 ,0 , 18, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (20, 7, 'HEARTS', 'RED', 0 ,0 , 19, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (21, 8, 'HEARTS', 'RED', 0 ,0 , 20, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (22, 9, 'HEARTS', 'RED', 0 ,0 , 21, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (23, 10, 'HEARTS', 'RED', 0 ,0 , 22, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (24, 11, 'HEARTS', 'RED', 0 ,0 , 23, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (25, 12, 'HEARTS', 'RED', 0 ,1 , 0, TRUE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (26, 13, 'HEARTS', 'RED', 1 ,1 , 0, TRUE, 1);

INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (27, 1, 'SPADES', 'BLACK', 1 ,1 , 1, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (28, 2, 'SPADES', 'BLACK', 2 ,1 , 0, TRUE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (29, 3, 'SPADES', 'BLACK', 2 ,1 , 1, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (30, 4, 'SPADES', 'BLACK', 2 ,1 , 2, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (31, 5, 'SPADES', 'BLACK', 3 ,1 , 0, TRUE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (32, 6, 'SPADES', 'BLACK', 3 ,1 , 1, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (33, 7, 'SPADES', 'BLACK', 3 ,1 , 2, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (34, 8, 'SPADES', 'BLACK', 3 ,1 , 3, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (35, 9, 'SPADES', 'BLACK', 4 ,1 , 0, TRUE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (36, 10, 'SPADES', 'BLACK', 4 ,1 , 1, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (37, 11, 'SPADES', 'BLACK', 4 ,1 , 2, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (38, 12, 'SPADES', 'BLACK', 4 ,1 , 3, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (39, 13, 'SPADES', 'BLACK', 4 ,1 , 4, FALSE, 1);
-- 
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (40, 1, 'CLUBS', 'BLACK', 5 ,1 , 0, TRUE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (41, 2, 'CLUBS', 'BLACK', 5 ,1 , 1, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (42, 3, 'CLUBS', 'BLACK', 5 ,1 , 2, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (43, 4, 'CLUBS', 'BLACK', 5 ,1 , 3, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (44, 5, 'CLUBS', 'BLACK', 5 ,1 , 4, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (45, 6, 'CLUBS', 'BLACK', 5 ,1 , 5, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (46, 7, 'CLUBS', 'BLACK', 6 ,1 , 0, TRUE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (47, 8, 'CLUBS', 'BLACK', 6 ,1 , 1, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (48, 9, 'CLUBS', 'BLACK', 6 ,1 , 2, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (49, 10, 'CLUBS', 'BLACK', 6 ,1 , 3, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (50, 11, 'CLUBS', 'BLACK', 6 ,1 , 4, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (51, 12, 'CLUBS', 'BLACK', 6 ,1 , 5, FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, z_position, is_showed, board_id) VALUES (52, 13, 'CLUBS', 'BLACK', 6 ,1 , 6, FALSE, 1);

INSERT INTO statistics(id,games,games_won,games_lost,total_score,player_id) VALUES (1, 120, 20, 100, 32, 1);
INSERT INTO statistics(id,games,games_won,games_lost,total_score,player_id) VALUES (2, 100, 20, 80, 32, 2);

INSERT INTO achievements(id, name, description,condition_unlocked, image) VALUES (1, 'Principiante','Juega 1 partida' ,'games>=1', 'imagen_logro.png');
INSERT INTO achievements(id, name, description,condition_unlocked, image) VALUES (2, 'Amateur','Juega 25 partidas' ,'games>=25', 'logro30.png');
INSERT INTO achievements(id, name, description,condition_unlocked, image) VALUES (3, 'Experto','Juega 50 partidas' ,'games>=50', 'logro30.png');
INSERT INTO achievements(id, name, description,condition_unlocked, image) VALUES (4, 'Elite','Juega 100 partidas' ,'games>=100', 'logro30.png');
INSERT INTO achievements(id, name, description,condition_unlocked, image) VALUES (5, 'Primera Sangre','Gana 1 partida' ,'gamesWon>=1', 'logro30.png');
INSERT INTO achievements(id, name, description,condition_unlocked, image) VALUES (6, 'Pentakillx2','Gana 10 partidas' ,'gamesWon>=10', 'logro30.png');
INSERT INTO achievements(id, name, description,condition_unlocked, image) VALUES (7, 'Muchas victorias','Gana  50 partidas' ,'gamesWon>=50', 'logro30.png');
INSERT INTO achievements(id, name, description,condition_unlocked, image) VALUES (8, 'PEROQUEMUCHASVICTORIAS','Gana 150 partidas' ,'gamesWon>=150', 'logro30.png');
INSERT INTO achievements(id, name, description,condition_unlocked, image) VALUES (9, 'Perdedor primerizo','Pierde 10 partidas' ,'gamesLost>=10', 'logro30.png');
INSERT INTO achievements(id, name, description,condition_unlocked, image) VALUES (10, 'MUY PERDEDOR','Pierde 50 partidas' ,'gamesLost>=50', 'logro30.png');
INSERT INTO achievements(id, name, description,condition_unlocked, image) VALUES (11, 'Perdedor Nato','Pierde 100 partidas' ,'gamesLost>=100', 'logro30.png');

INSERT INTO achievements_statistics(id,achievement_id,statistics_id) VALUES (1,1,1);
INSERT INTO achievements_statistics(id,achievement_id,statistics_id) VALUES (2,2,2);

INSERT INTO friend_requests(id, player_sender,player_receiver,state) VALUES (1,1,2,false)
