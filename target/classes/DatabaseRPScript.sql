 CREATE DATABASE futbol;

CREATE TABLE Futbol.resultados(

	idresultados int PRIMARY KEY auto_increment,
    fase varchar(255),
    ronda varchar(255),
    equipo1 varchar(255),
    equipo2 varchar(255),
    cantgoles1 varchar(255),
    cantgoles2 varchar(255)
    
);

CREATE TABLE Futbol.pronosticos(
	
    idpronosticos int PRIMARY KEY auto_increment,
    participante varchar(255),
    equipo1 varchar(255),
    equipo2 varchar(255),
    gana1 varchar(255),
    gana2 varchar(255),
    empata varchar(255)
    
);

insert into Futbol.resultados (fase, ronda, equipo1, equipo2, cantgoles1, cantgoles2) VALUES ('1','1','Argentina','Francia','1','0');
insert into Futbol.resultados (fase, ronda, equipo1, equipo2, cantgoles1, cantgoles2) VALUES ('1','1','Arabia Saudita','Chile','2','1');
insert into Futbol.resultados (fase, ronda, equipo1, equipo2, cantgoles1, cantgoles2) VALUES ('1','1','Polonia','Brazil','1','1');
insert into Futbol.resultados (fase, ronda, equipo1, equipo2, cantgoles1, cantgoles2) VALUES ('1','1','Mexico','Inglaterra','1','0');
insert into Futbol.resultados (fase, ronda, equipo1, equipo2, cantgoles1, cantgoles2) VALUES ('1','2','Argentina','Chile','2','0');
insert into Futbol.resultados (fase, ronda, equipo1, equipo2, cantgoles1, cantgoles2) VALUES ('1','2','Francia','Arabia Saudita','0','2');
insert into Futbol.resultados (fase, ronda, equipo1, equipo2, cantgoles1, cantgoles2) VALUES ('1','2','Polonia','Inglaterra','1','1');
insert into Futbol.resultados (fase, ronda, equipo1, equipo2, cantgoles1, cantgoles2) VALUES ('1','2','Brazil','Mexico','1','1');
insert into Futbol.resultados (fase, ronda, equipo1, equipo2, cantgoles1, cantgoles2) VALUES ('2','1','Argentina','Arabia Saudita','3','1');
insert into Futbol.resultados (fase, ronda, equipo1, equipo2, cantgoles1, cantgoles2) VALUES ('2','1','Polonia','Mexico','0','0');
insert into Futbol.resultados (fase, ronda, equipo1, equipo2, cantgoles1, cantgoles2) VALUES ('2','2','Argentina','Mexico','2','0');
insert into Futbol.resultados (fase, ronda, equipo1, equipo2, cantgoles1, cantgoles2) VALUES ('2','2','Arabia Saudita','Polonia','0','2');
insert into Futbol.resultados (fase, ronda, equipo1, equipo2, cantgoles1, cantgoles2) VALUES ('3','1','Argentina','Polonia','2','2');
insert into Futbol.resultados (fase, ronda, equipo1, equipo2, cantgoles1, cantgoles2) VALUES ('3','2','Polonia','Argentina','2','4');

insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Mariana','Argentina','Francia','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Mariana','Arabia Saudita','Chile','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Mariana','Polonia','Brazil','','','x');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Mariana','Mexico','Inglaterra','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Mariana','Argentina','Chile','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Mariana','Francia','Arabia Saudita','','x','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Mariana','Polonia','Inglaterra','','','x');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Mariana','Brazil','Mexico','','','x');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Mariana','Argentina','Arabia Saudita','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Mariana','Polonia','Mexico','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Mariana','Argentina','Mexico','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Mariana','Arabia Saudita','Polonia','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Mariana','Argentina','Polonia','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Mariana','Polonia','Argentina','','x','');

insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Pedro','Argentina','Francia','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Pedro','Arabia Saudita','Chile','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Pedro','Polonia','Brazil','','','x');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Pedro','Mexico','Inglaterra','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Pedro','Argentina','Chile','','','x');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Pedro','Francia','Arabia Saudita','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Pedro','Polonia','Inglaterra','','','x');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Pedro','Brazil','Mexico','','','x');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Pedro','Argentina','Arabia Saudita','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Pedro','Polonia','Mexico','','x','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Pedro','Argentina','Mexico','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Pedro','Arabia Saudita','Polonia','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Pedro','Argentina','Polonia','','','x');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Pedro','Polonia','Argentina','','x','');

insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Juan','Argentina','Francia','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Juan','Arabia Saudita','Chile','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Juan','Polonia','Brazil','','','x');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Juan','Mexico','Inglaterra','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Juan','Argentina','Chile','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Juan','Francia','Arabia Saudita','','x','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Juan','Polonia','Inglaterra','','','x');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Juan','Brazil','Mexico','','','x');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Juan','Argentina','Arabia Saudita','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Juan','Polonia','Mexico','','','x');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Juan','Argentina','Mexico','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Juan','Arabia Saudita','Polonia','','x','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Juan','Argentina','Polonia','','','x');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Juan','Polonia','Argentina','','x','');

insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Marcos','Argentina','Francia','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Marcos','Arabia Saudita','Chile','','x','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Marcos','Polonia','Brazil','','x','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Marcos','Mexico','Inglaterra','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Marcos','Argentina','Chile','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Marcos','Francia','Arabia Saudita','','x','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Marcos','Polonia','Inglaterra','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Marcos','Brazil','Mexico','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Marcos','Argentina','Arabia Saudita','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Marcos','Polonia','Mexico','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Marcos','Argentina','Mexico','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Marcos','Arabia Saudita','Polonia','','x','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Marcos','Argentina','Polonia','x','','');
insert into Futbol.pronosticos (participante, equipo1, equipo2, gana1, gana2, empata) VALUES ('Marcos','Polonia','Argentina','','x','');
