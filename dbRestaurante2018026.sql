-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema dbRestaurante2018026
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema dbRestaurante2018026
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `dbRestaurante2018026` DEFAULT CHARACTER SET utf8 ;
USE `dbRestaurante2018026` ;

-- -----------------------------------------------------
-- Table `dbRestaurante2018026`.`areas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbRestaurante2018026`.`areas` (
  `idareas` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idareas`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbRestaurante2018026`.`mesas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbRestaurante2018026`.`mesas` (
  `idmesas` INT NOT NULL AUTO_INCREMENT,
  `categorias` VARCHAR(45) NOT NULL,
  `areas_idareas` INT NOT NULL,
  PRIMARY KEY (`idmesas`),
  INDEX `fk_mesas_areas1_idx` (`areas_idareas` ASC) VISIBLE,
  CONSTRAINT `fk_mesas_areas1`
    FOREIGN KEY (`areas_idareas`)
    REFERENCES `dbRestaurante2018026`.`areas` (`idareas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbRestaurante2018026`.`clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbRestaurante2018026`.`clientes` (
  `idclientes` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `categoria` VARCHAR(45) NOT NULL,
  `nit` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idclientes`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbRestaurante2018026`.`meseros`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbRestaurante2018026`.`meseros` (
  `idmeseros` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `sueldo` DOUBLE NOT NULL,
  PRIMARY KEY (`idmeseros`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbRestaurante2018026`.`facturas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbRestaurante2018026`.`facturas` (
  `idfacturas` INT NOT NULL AUTO_INCREMENT,
  `mesas_idmesas` INT NOT NULL,
  `clientes_idclientes` INT NOT NULL,
  `meseros_idmeseros` INT NOT NULL,
  `fecha` DATETIME NOT NULL,
  PRIMARY KEY (`idfacturas`),
  INDEX `fk_facturas_mesas1_idx` (`mesas_idmesas` ASC) VISIBLE,
  INDEX `fk_facturas_clientes1_idx` (`clientes_idclientes` ASC) VISIBLE,
  INDEX `fk_facturas_meseros1_idx` (`meseros_idmeseros` ASC) VISIBLE,
  CONSTRAINT `fk_facturas_mesas1`
    FOREIGN KEY (`mesas_idmesas`)
    REFERENCES `dbRestaurante2018026`.`mesas` (`idmesas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_facturas_clientes1`
    FOREIGN KEY (`clientes_idclientes`)
    REFERENCES `dbRestaurante2018026`.`clientes` (`idclientes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_facturas_meseros1`
    FOREIGN KEY (`meseros_idmeseros`)
    REFERENCES `dbRestaurante2018026`.`meseros` (`idmeseros`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbRestaurante2018026`.`cocineros`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbRestaurante2018026`.`cocineros` (
  `idcocineros` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `sueldo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idcocineros`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbRestaurante2018026`.`detallefactura`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbRestaurante2018026`.`detallefactura` (
  `iddetallefactura` INT NOT NULL AUTO_INCREMENT,
  `cocineros_idcocineros` INT NOT NULL,
  `facturas_idfacturas` INT NOT NULL,
  `cantidad` INT NOT NULL,
  `precioventa` INT NOT NULL,
  `preciototal` DOUBLE as ('cantidad' * 'precioventa'),
  PRIMARY KEY (`iddetallefactura`),
  INDEX `fk_detallefactura_cocineros1_idx` (`cocineros_idcocineros` ASC) VISIBLE,
  INDEX `fk_detallefactura_facturas1_idx` (`facturas_idfacturas` ASC) VISIBLE,
  CONSTRAINT `fk_detallefactura_cocineros1`
    FOREIGN KEY (`cocineros_idcocineros`)
    REFERENCES `dbRestaurante2018026`.`cocineros` (`idcocineros`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_detallefactura_facturas1`
    FOREIGN KEY (`facturas_idfacturas`)
    REFERENCES `dbRestaurante2018026`.`facturas` (`idfacturas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbRestaurante2018026`.`platos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbRestaurante2018026`.`platos` (
  `idplatos` INT NOT NULL AUTO_INCREMENT,
  `platos` VARCHAR(45) NOT NULL,
  `precio` DOUBLE NOT NULL,
  `detallefactura_iddetallefactura` INT NOT NULL,
  PRIMARY KEY (`idplatos`),
  INDEX `fk_platos_detallefactura1_idx` (`detallefactura_iddetallefactura` ASC) VISIBLE,
  CONSTRAINT `fk_platos_detallefactura1`
    FOREIGN KEY (`detallefactura_iddetallefactura`)
    REFERENCES `dbRestaurante2018026`.`detallefactura` (`iddetallefactura`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
