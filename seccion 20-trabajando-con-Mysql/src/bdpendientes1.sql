-- esto es un comentario
# esto es otro comentario

create schema if not exists BdPendientes1;

#USANDO LA BASE DE DATOS bdPendientes1

use bdPendientes1;

#creando la tabla Personas

create table if not exists Personas(
   id INT NOT NULL auto_increment,
   nombre  VARCHAR(60) NOT NULL,
   correo  VARCHAR(30) NULL,
   telefono VARCHAR (30),
   PRIMARY KEY(id)

)ENGINE = Innodb;


#creando la tabla EstatusPendiente

create table if not exists EstatusPendiente(
   id INT NOT NULL auto_increment,
   estatus  VARCHAR(20) NOT NULL,
   correo  VARCHAR(30) NULL,
   PRIMARY KEY(id) 
)ENGINE = Innodb;


#creando la tabla Usuarios

create table if not exists Usuarios(
   id INT NOT NULL auto_increment,
   nombre  VARCHAR(30) NOT NULL,
   password  VARCHAR(45) NOT NULL,
   idPersona INT NOT NULL,
   PRIMARY KEY(id), 
   
   CONSTRAINT fkUsuarioPersona
   FOREIGN KEY (idPersona)
   REFERENCES Personas(id)
)ENGINE = Innodb;

#creando la tabla Usuarios

create table if not exists Pendientes(
   id INT NOT NULL auto_increment,
   fechaCreacion  DATETIME NOT NULL,
   fechaEntrega  DATETIME NOT NULL,
   descripcion  VARCHAR(250) NOT NULL,
   idEstatusPendiente INT NOT NULL,
   observaciones VARCHAR(250) NOT NULL,
   idPersonaQueAsigno INT NOT NULL,
   idPersonaAsignado INT NOT NULL,
   solucionPendiente VARCHAR(250),
   PRIMARY KEY(id), 
   
   CONSTRAINT fkPendEstatus
   FOREIGN KEY (idEstatusPendiente)
   REFERENCES EstatusPendiente(id),
   
   CONSTRAINT fkidPersonaAsignadoPersona
   FOREIGN KEY (idPersonaQueAsigno)
   REFERENCES Personas(id),
   
   CONSTRAINT fkidPersonaAsignadoPerson
   FOREIGN KEY (idPersonaAsignado)
   REFERENCES Personas(id)
)ENGINE = Innodb;


