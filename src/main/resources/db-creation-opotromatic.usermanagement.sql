-- schema creation
DROP SCHEMA IF EXISTS `opotromatic_usermanagement`;
CREATE SCHEMA `opotromatic_usermanagement` DEFAULT CHARACTER SET utf8;

CREATE TABLE `opotromatic_usermanagement`.`u_user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(200) NOT NULL,
  `password` VARCHAR(200) NOT NULL,
  UNIQUE KEY (`name`),
  PRIMARY KEY (`id`)
);

CREATE TABLE `opotromatic_usermanagement`.`u_role` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(200) NOT NULL,
  UNIQUE KEY (`name`),
  PRIMARY KEY (`id`)
);

CREATE TABLE `opotromatic_usermanagement`.`u_user_role_mapping` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user` VARCHAR(200) NOT NULL,
  `role` VARCHAR(200) NOT NULL,
  UNIQUE KEY (`user`, `role`),
  PRIMARY  KEY (`id`),
  FOREIGN KEY (`user`) REFERENCES `u_user`(`name`) ON UPDATE CASCADE ON DELETE CASCADE,
  FOREIGN KEY (`role`) REFERENCES `u_role`(`name`) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT IGNORE INTO `opotromatic_usermanagement`.`u_role` (`name`) VALUES
("ADMIN"),
("EDIT"),
("ADD"),
("DELETE"),
("READONLY"),
("NOUSER");