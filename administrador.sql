create database administracion;
use administracion;
create table usuario(
   id long not null auto_increment comment'Identificador de usuario',
   nombre varchar(12) NOT NULL comment 'Nombre del usuario',
   password varchar(12) NOT NULL comment 'Contraseña del usuario',
   email varchar(30) NOT NULL comment 'Correo del usuario',
   fechaRegistro varchar(30) NOT NULL  comment 'Fecha de registro del usuario',
   ultimoLogin   varchar(30) NOT NULL comment 'Fecha de ultimo login del usuario',
   PRIMARY KEY usuario_pk(id)
);
drop table tareas;
create table tareas(
id int NOT NULL auto_increment comment 'Identificador de la tarea',
id_usuario long NOT NULL comment 'Nombre del usuario',
estado INT(1) NOT NULL comment '1 Tarea Completada, 0 Tarea pendiente',
descripcion varchar(40) NOT NULL comment 'Descripción de la tarea',
PRIMARY KEY id_tarea_pk(id_tarea),
CONSTRAINT FOREIGN KEY tar_id_usu_fk(id_usuario) REFERENCES usuarios(id)
);
