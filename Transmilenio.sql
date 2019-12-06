CREATE TABLE Troncal (
  idTroncal int(11) NOT NULL AUTO_INCREMENT,
  codTroncal varchar(3) NOT NULL,
  UNIQUE KEY unique_idTroncal (idTroncal),
  PRIMARY KEY (codTroncal)
);

 

CREATE TABLE Estacion (
  idEstacion int(11) NOT NULL AUTO_INCREMENT,
  codEstacion varchar(3) NOT NULL,
  nombre varchar(45) NOT NULL,
  estado varchar(45) NOT NULL,
  horaApertura time,
  horaCierre time,
  codTroncal varchar(3) NOT NULL,
  UNIQUE KEY unique_codEstacion (idEstacion),
  PRIMARY KEY (codEstacion),
  CONSTRAINT fk_Estacion_Troncal FOREIGN KEY (codTroncal) REFERENCES Troncal (codTroncal)
);



CREATE TABLE Ruta (
  idRuta int(11) NOT NULL AUTO_INCREMENT,
  codRuta varchar(3) NOT NULL,
  nombre varchar(45) NOT NULL,
  inicioOperacion time,
  finOperacion time,
  UNIQUE KEY unique_idRuta (idRuta),
  PRIMARY KEY (codRuta)
) ;

CREATE TABLE EstacionRuta (
  idEstacionRuta int(11) NOT NULL AUTO_INCREMENT,
  codEstacion varchar(3) NOT NULL,
  codRuta varchar(3) NOT NULL,
  PRIMARY KEY (idEstacionRuta),
  CONSTRAINT fk_Estacion_ER FOREIGN KEY (codEstacion) REFERENCES Estacion (codEstacion),
  CONSTRAINT fk_Ruta_ER FOREIGN KEY (codRuta) REFERENCES Ruta (codRuta)
);