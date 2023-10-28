create database Jm_entregafinal_db;
use Jm_entregafinal_db;
create table estudiantes(
id int auto_increment primary key,
nombre varchar(15) not null,
apellido varchar(15) not null,
fecha_de_nacimiento date not null
);
describe estudiantes;
drop table estudiantes;

create table contactos(
id int auto_increment primary key,
email varchar(255),
telefono varchar(255),
direccion varchar(255) not null,
ciudad varchar(255) not null,
provincia varchar(255) not null,
codigo_postal varchar(255) not null,
id_estudiante int(3) not null,
foreign key (id_estudiante) references estudiantes(id)
);
describe contactos;
drop  table contactos;

create table instructor(
id int auto_increment not null primary key,
nombre varchar(255) not null,
apellido varchar(255) not null
);

create table cursos(
id int auto_increment not null primary key,
nombre varchar(255)not null,
id_instructor int not null,
foreign key(id_instructor) references instructor(id)
);

create table estudiante_curso(
id_curso int not null,
id_estudiante int not null,
foreign key (id_estudiante) references estudiantes(id),
foreign key (id_curso) references cursos(id)
);

insert into estudiantes
     (nombre,apellido,fecha_de_nacimiento)
     values
     ("Matias"," Romero","2005-09-02"),
     ("Jonas","Heredia","1999-07-03"),
     ("Hallie","Chavez","2001-06-21"),
     ("Benjamin","Bucca","2000-05-16"),
     ("Victoria","Fuentes","2009-11-09");
	select *from estudiantes;
    update estudiantes set fecha_de_nacimiento = "2000-08-19" where id = "3";
    update estudiantes set fecha_de_nacimiento = "1999-05-02" where id = "1";   
    update estudiantes set fecha_de_nacimiento = "1995-02-24" where id = "2";
    update estudiantes set fecha_de_nacimiento = "1997-05-17" where id = "4";
    update estudiantes set fecha_de_nacimiento = "2005-02-28" where id = "5";
    select *from contactos;
    
    insert into contactos
    (direccion,ciudad,provincia,codigo_postal,id_estudiante)
    values
    ("Paraguay 15","Cordoba","Capital","5000","1"),
	("Miralta 200","Cordoba","Capital","5000","2"),
    ("Ituzango 70","Cordoba","Capital","5000","3"),
    ("Mariano moreno","Cordoba","Capital","5000","4"),
	("Santa rosa 86","Cordoba","Capital","5000","5");
	select *from contactos;
    
    insert into instructor
    (nombre,apellido)
    values
    ("Mariana","Campos"),
    ("Sergio","Juarez"),
    ("Miriam","Cleri"),
    ("Benicio","Suarez"),
    ("Francisco","Caceres");
    select *from instructor;
    
    insert into cursos
    (nombre,id_instructor)
    values
    ("Matematica","3"),
    ("Quimica","5"),
    ("Lengua","1"),
    ("Computacion","2"),
    ("Programacion","4");
	select *from cursos;
    
    insert into estudiante_curso
    (id_curso,id_estudiante)
    values
    ("1","4"),
    ("5","3"),
    ("4","1"),
    ("3","2"),
    ("2","5");
    select *from estudiante_curso;
    
    
    

     





