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
-- One player user, named player1 with passwor pl4y3r
INSERT INTO users(username,password,enabled) VALUES ('player3','pl4y3r',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (6,'player3','player');
-- One player user, named player1 with passwor pl4y3r
INSERT INTO users(username,password,enabled) VALUES ('player4','pl4y3r',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (7,'player4','player');
-- One player user, named player1 with passwor pl4y3r
INSERT INTO users(username,password,enabled) VALUES ('player5','pl4y3r',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (8,'player5','player');
-- One player user, named player1 with passwor pl4y3r
INSERT INTO users(username,password,enabled) VALUES ('player6','pl4y3r',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (9,'player6','player');
-- One player user, named player1 with passwor pl4y3r
INSERT INTO users(username,password,enabled) VALUES ('player7','pl4y3r',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (10,'player7','player');
-- One player user, named player1 with passwor pl4y3r
INSERT INTO users(username,password,enabled) VALUES ('player8','pl4y3r',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (11,'player8','player');
-- One player user, named player1 with passwor pl4y3r
INSERT INTO users(username,password,enabled) VALUES ('player9','pl4y3r',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (12,'player9','player');
-- One player user, named player1 with passwor pl4y3r
INSERT INTO users(username,password,enabled) VALUES ('player10','pl4y3r',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (13,'player10','player');








INSERT INTO players(id,first_name,last_name,email,username) VALUES (1, 'Mario', 'Casas', 'mariocasas69@gmail.com','player1');
INSERT INTO players(id,first_name,last_name,email,username) VALUES (2, 'Pablo', 'Iglesias', 'pablito29@gmail.com','player2');
INSERT INTO players(id,first_name,last_name,email,username) VALUES (3, 'Pedro', 'Picapiedra', 'pedropicapiedra@gmail.com','player3');
INSERT INTO players(id,first_name,last_name,email,username) VALUES (4, 'Manuel', 'Ortiz', 'manu@gmail.com','player4');
INSERT INTO players(id,first_name,last_name,email,username) VALUES (5, 'Isco', 'Alarcon', 'perdedor1@gmail.com','player5');
INSERT INTO players(id,first_name,last_name,email,username) VALUES (6, 'Federico', 'Lorca', 'tuLorquita@gmail.com','player6');
INSERT INTO players(id,first_name,last_name,email,username) VALUES (7, 'Maria', 'Pavon', 'pavona@gmail.com','player7');
INSERT INTO players(id,first_name,last_name,email,username) VALUES (8, 'Marta', 'zz', 'zz@gmail.com','player8');
INSERT INTO players(id,first_name,last_name,email,username) VALUES (9, 'Juan', 'Magan', 'nosiguemodas@gmail.com','player9');
INSERT INTO players(id,first_name,last_name,email,username) VALUES (10, 'Roger', 'Federer', 'rogerF@gmail.com','player10');


INSERT INTO board(id,background,height,width) VALUES (1,'resources/images/background.jpg',2500,960);

INSERT INTO cards(id,number,suit, color, x_position, y_position, is_showed, board_id) VALUES (1, 1, 'DIAMONDS', 'RED', 0,0 , FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, is_showed, board_id) VALUES (2, 2, 'DIAMONDS', 'RED', 0 ,0 , FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position, is_showed, board_id) VALUES (3, 3, 'DIAMONDS', 'RED', 0,0 , FALSE , 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (4, 4, 'DIAMONDS', 'RED', 0,0 , FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (5, 5, 'DIAMONDS', 'RED', 0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (6, 6, 'DIAMONDS', 'RED', 0 ,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (7, 7, 'DIAMONDS', 'RED', 0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (8, 8, 'DIAMONDS', 'RED', 0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (9, 9, 'DIAMONDS', 'RED', 0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (10, 10, 'DIAMONDS', 'RED', 0,0 , FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (11, 11, 'DIAMONDS', 'RED', 0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (12, 12, 'DIAMONDS', 'RED', 0 ,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (13, 13, 'DIAMONDS', 'RED', 0,0,  FALSE, 1);

INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (14, 1, 'HEARTS', 'RED', 0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (15, 2, 'HEARTS', 'RED', 0 ,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (16, 3, 'HEARTS', 'RED', 0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (17, 4, 'HEARTS', 'RED', 0 ,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (18, 5, 'HEARTS', 'RED', 0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (19, 6, 'HEARTS', 'RED', 0 ,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (20, 7, 'HEARTS', 'RED', 0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (21, 8, 'HEARTS', 'RED', 0 ,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (22, 9, 'HEARTS', 'RED', 0,0 , FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (23, 10, 'HEARTS', 'RED', 0 ,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (24, 11, 'HEARTS', 'RED', 0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (25, 12, 'HEARTS', 'RED', 0 ,0 , FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (26, 13, 'HEARTS', 'RED', 0,0 ,  FALSE, 1);

INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (27, 1, 'SPADES', 'BLACK',0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (28, 2, 'SPADES', 'BLACK',0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (29, 3, 'SPADES', 'BLACK',0,0,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (30, 4, 'SPADES', 'BLACK',0,0,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (31, 5, 'SPADES', 'BLACK',0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (32, 6, 'SPADES', 'BLACK',0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (33, 7, 'SPADES', 'BLACK',0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (34, 8, 'SPADES', 'BLACK',0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (35, 9, 'SPADES', 'BLACK',0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (36, 10, 'SPADES', 'BLACK',0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (37, 11, 'SPADES', 'BLACK',0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (38, 12, 'SPADES', 'BLACK',0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (39, 13, 'SPADES', 'BLACK',0,0 ,  FALSE, 1);

INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (40, 1, 'CLUBS', 'BLACK',0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (41, 2, 'CLUBS', 'BLACK',0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (42, 3, 'CLUBS', 'BLACK',0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (43, 4, 'CLUBS', 'BLACK',0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (44, 5, 'CLUBS', 'BLACK',0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (45, 6, 'CLUBS', 'BLACK',0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (46, 7, 'CLUBS', 'BLACK',0,0,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (47, 8, 'CLUBS', 'BLACK', 0,0,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (48, 9, 'CLUBS', 'BLACK', 0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (49, 10, 'CLUBS', 'BLACK', 0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (50, 11, 'CLUBS', 'BLACK', 0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (51, 12, 'CLUBS', 'BLACK', 0,0 ,  FALSE, 1);
INSERT INTO cards(id,number,suit, color, x_position, y_position,   is_showed, board_id) VALUES (52, 13, 'CLUBS', 'BLACK',0,0 ,  FALSE, 1);

INSERT INTO statistics(id,games,games_won,games_lost,total_score,player_id) VALUES (1, 300, 150, 150, 32, 1);
INSERT INTO statistics(id,games,games_won,games_lost,total_score,player_id) VALUES (2, 100, 20, 80, 32, 2);
INSERT INTO statistics(id,games,games_won,games_lost,total_score,player_id) VALUES (3, 100, 50, 50, 32, 3);
INSERT INTO statistics(id,games,games_won,games_lost,total_score,player_id) VALUES (4, 100, 20, 80, 32, 4);
INSERT INTO statistics(id,games,games_won,games_lost,total_score,player_id) VALUES (5, 100, 20, 80, 32, 5);
INSERT INTO statistics(id,games,games_won,games_lost,total_score,player_id) VALUES (6, 100, 20, 80, 32, 6);
INSERT INTO statistics(id,games,games_won,games_lost,total_score,player_id) VALUES (7, 100, 20, 80, 32, 7);
INSERT INTO statistics(id,games,games_won,games_lost,total_score,player_id) VALUES (8, 100, 20, 80, 32, 8);
INSERT INTO statistics(id,games,games_won,games_lost,total_score,player_id) VALUES (9, 100, 20, 80, 32, 9);
INSERT INTO statistics(id,games,games_won,games_lost,total_score,player_id) VALUES (10, 100, 20, 80, 32, 10);

INSERT INTO achievements(id, name, description,condition_unlocked, image) VALUES (1, 'Principiante','Juega 1 partida' ,'games>=1', 'logro1.png');
INSERT INTO achievements(id, name, description,condition_unlocked, image) VALUES (2, 'Amateur','Juega 25 partidas' ,'games>=25', 'logro25.png');
INSERT INTO achievements(id, name, description,condition_unlocked, image) VALUES (3, 'Experto','Juega 50 partidas' ,'games>=50', 'logro50.png');
INSERT INTO achievements(id, name, description,condition_unlocked, image) VALUES (4, 'Elite','Juega 100 partidas' ,'games>=100', 'logro100.png');
INSERT INTO achievements(id, name, description,condition_unlocked, image) VALUES (5, 'Primera Sangre','Gana 1 partida' ,'gamesWon>=1', 'gana1.png');
INSERT INTO achievements(id, name, description,condition_unlocked, image) VALUES (6, 'Pentakillx2','Gana 10 partidas' ,'gamesWon>=10', 'gana10.png');
INSERT INTO achievements(id, name, description,condition_unlocked, image) VALUES (7, 'Muchas victorias','Gana  50 partidas' ,'gamesWon>=50', 'gana50.png');
INSERT INTO achievements(id, name, description,condition_unlocked, image) VALUES (8, 'PEROQUEMUCHASVICTORIAS','Gana 150 partidas' ,'gamesWon>=150', 'gana150.jpg');
INSERT INTO achievements(id, name, description,condition_unlocked, image) VALUES (9, 'Perdedor primerizo','Pierde 10 partidas' ,'gamesLost>=10', 'pierde10.png');
INSERT INTO achievements(id, name, description,condition_unlocked, image) VALUES (10, 'MUY PERDEDOR','Pierde 50 partidas' ,'gamesLost>=50', 'pierde50.png');
INSERT INTO achievements(id, name, description,condition_unlocked, image) VALUES (11, 'Perdedor Nato','Pierde 100 partidas' ,'gamesLost>=100', 'pierde100.webp');

INSERT INTO achievements_statistics(id,achievement_id,statistics_id) VALUES (1,1,1);
INSERT INTO achievements_statistics(id,achievement_id,statistics_id) VALUES (2,2,2);

INSERT INTO friend_requests(id,player_sender,player_receiver,state) VALUES (1,1,2,FALSE);

INSERT INTO friends(id, friend1,friend2) VALUES (2,1,3);
INSERT INTO friends(id, friend1,friend2) VALUES (3,1,4);
INSERT INTO friends(id, friend1,friend2) VALUES (4,1,5);
INSERT INTO friends(id, friend1,friend2) VALUES (5,1,6);
INSERT INTO friends(id, friend1,friend2) VALUES (6,1,7);
INSERT INTO friends(id, friend1,friend2) VALUES (7,1,8);
INSERT INTO friends(id, friend1,friend2) VALUES (8,1,9);
INSERT INTO friends(id, friend1,friend2) VALUES (9,1,10);
