create database usuarios;

use usuarios;

create table registros(idusu int not null auto_increment primary key,
nombre_usuario varchar(55),
nombre varchar(55),
apellido varchar(55),
numerotel varchar(12),
correo varchar(55),
contraseña varchar(55),
confirmar_contraseña varchar(55)
);

select * from registros;
