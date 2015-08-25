





CREATE TABLE `connected_garden`.`vaso` (
  `idvaso` INT NOT NULL,
  `descricao` VARCHAR(255) NULL,
  `mac` VARCHAR(45) NULL,
  `temp` INT NULL,
  `umidsolo` INT NULL,
  `umidar` INT NULL,
  `luz` INT NULL,
  `ativo` INT NULL,
  PRIMARY KEY (`idvaso`))
COMMENT = 'tabela que representa um vaso.';


