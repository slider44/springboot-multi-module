-- -----------------------------------------------------
-- Schema hotelooka
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `hotelooka` ;

-- -----------------------------------------------------
-- Schema hotelooka
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `hotelooka` ;
USE `hotelooka` ;


-- -----------------------------------------------------
-- Table `hotelooka`.`hotel`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `hotelooka`.`hotel` ;

CREATE TABLE IF NOT EXISTS `hotelooka`.`hotel` (
  `hotel_id` SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `hotel_name` VARCHAR(25) NOT NULL,
  `classification` INTEGER NOT NULL,
  isOpen TINYINT(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`hotel_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hotelooka`.`hotel_booking`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `hotelooka`.`hotel_booking` ;

CREATE TABLE IF NOT EXISTS `hotelooka`.`hotel_booking` (
  `booking_id` SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `hotel_id` SMALLINT UNSIGNED NOT NULL,
  `nb_Of_Nights` SMALLINT UNSIGNED NOT NULL,
  `price_per_night` DECIMAL(6,2) NOT NULL DEFAULT 5000.00,
   PRIMARY KEY (`booking_id`),
   CONSTRAINT `fk_hotel` FOREIGN KEY (hotel_id) REFERENCES hotel(hotel_id)
 )ENGINE = InnoDB DEFAULT CHARACTER SET = utf8;

