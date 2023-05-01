CREATE SCHEMA IF NOT EXISTS `lojainformatica`;

USE `lojainformatica`;

CREATE TABLE IF NOT EXISTS `lojainformatica`.`computador` (
  `idComputador` INT NOT NULL AUTO_INCREMENT,
  `marca` VARCHAR(20) NOT NULL,
  `HD` VARCHAR(30) NOT NULL,
  `processador` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`idComputador`)
);

select * from computador;
