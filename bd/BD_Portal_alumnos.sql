Drop Database if exists Portal_alumnos;
create database Portal_Alumnos;

use Portal_alumnos;
 
create table alumnos(
idalumno int primary key,
nomalu varchar(50),
apealu varchar(50),
telalu char(9),
idseccion int,
idgrado int,
foreign key (idseccion) References seccion(idseccion),
foreign key (idgrado) References grado(idgrado)
);

select * from alumnos;

create table profesor(
idprofesor int primary key,
nompro varchar(50),
apepro varchar(50),
telpro char(9),
idasi int,
Foreign Key (idasi) References asignatura(idasi)
);

select * from profesor;

create table carrera(
idcarr int primary key,
descripcion varchar(60)
);

select * from carrera;

create table asignatura(
idasi int primary key,
descripcion varchar(60),
idcarr int,
Foreign key (idcarr) References carrera(idcarr)
);

select * from asignatura;

create table seccion(
idseccion int primary key,
descripcionseccion Varchar(50)
);

select * from seccion;

create table grado(
idgrado int primary key,
descripciongrado Varchar(50)
);

select * from grado;

insert into grado values(1, "Nivel academico 1");
insert into grado values(2, "Nivel academico 2");
insert into grado values(3, "Nivel academico 3");
insert into grado values(4, "Nivel academico 4");
insert into grado values(5, "Nivel academico 5");
insert into grado values(6, "Nivel academico 6");


insert into seccion values(1, "A");
insert into seccion values(2, "B");
insert into seccion values(3, "C");
insert into seccion values(4, "D");

insert into alumnos values(1, "Pepe", "Zorio", 948157485, 2, 1);
insert into alumnos values(2, "Carla", "Casa", 948751594, 3, 5);
insert into alumnos values(3, "Samantha", "Ruiz", 953265841, 1, 1);
insert into alumnos values(4, "Alejandro", "Sas", 948521478, 2, 4);
insert into alumnos values(5, "Erick", "Tower", 958415486, 2, 5);
insert into alumnos values(6, "Mario", "Salas", 948751584, 1, 6);
insert into alumnos values(7, "Casimiro", "Seb", 965284951, 4, 6);
insert into alumnos values(8, "Robert", "Steele", 948756318, 3, 1);
insert into alumnos values(9, "Carci", "Grace", 984865148, 2, 2);
insert into alumnos values(10, "Sebasti", "Ent", 964875136, 3, 5);
insert into alumnos values(11, "Mark", "Ziro", 948753167, 2, 5);
insert into alumnos values(12, "Issac", "Over", 948568114, 1, 1);
insert into alumnos values(13, "Stevan", "Owler", 994654184, 1, 6);
insert into alumnos values(14, "Sara", "Carca", 948652355, 4, 2);
insert into alumnos values(15, "Dio", "Rios", 915486662, 3, 2);
insert into alumnos values(16, "Sofia", "Alas", 953268489, 2, 1);
insert into alumnos values(17, "Rock", "Stone", 956244715, 1, 1);
insert into alumnos values(18, "Heber", "Carl", 956322618, 2, 3);
insert into alumnos values(19, "Marcelo", "Shua", 948512489, 4, 2);
insert into alumnos values(20, "Ortelio", "Kiza", 915642358, 4, 5);
