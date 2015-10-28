--user_garden`
INSERT INTO `connected_garden`.`user_garden` (`NAME`, `EMAIL`, `NICKNAME`, `PASSWORD`, `ACTIVE`) VALUES ('Alysson', 'alysson@yahoo.com.br', 'Alysson', '12345', 1);
INSERT INTO `connected_garden`.`user_garden` (`NAME`, `EMAIL`, `NICKNAME`, `PASSWORD`, `ACTIVE`) VALUES ('Monica', 'monica@yahoo.com.br', 'Monica', '12345', 1);
INSERT INTO `connected_garden`.`user_garden` (`NAME`, `EMAIL`, `NICKNAME`, `PASSWORD`, `ACTIVE`) VALUES ('Raul', 'raul@yahoo.com.br', 'Raul', '12345', 1);
INSERT INTO `connected_garden`.`user_garden` (`NAME`, `EMAIL`, `NICKNAME`, `PASSWORD`, `ACTIVE`) VALUES ('Wanderson', 'wanderson@yahoo.com.br', 'Wanderson', '12345', 1);

--user_config`
INSERT INTO `connected_garden`.`user_config` (`ID_USER`, `DESCRIPTION`, `VALUE`, `CONFIG`) VALUES ('2', 'Teste Configuração', '3', '2');
INSERT INTO `connected_garden`.`user_config` (`ID_USER`, `DESCRIPTION`, `VALUE`, `CONFIG`) VALUES ('1', 'Teste 2', '2', '3');



-- alert_type`
INSERT INTO `connected_garden`.`alert_type` (`DESCRIPTION`) VALUES ('HOUR');
INSERT INTO `connected_garden`.`alert_type` (`DESCRIPTION`) VALUES ('DAY');
INSERT INTO `connected_garden`.`alert_type` (`DESCRIPTION`) VALUES ('WEEK');
INSERT INTO `connected_garden`.`alert_type` (`DESCRIPTION`) VALUES ('MONTH');
INSERT INTO `connected_garden`.`alert_type` (`DESCRIPTION`) VALUES ('YEAR');

--garden`
INSERT INTO `connected_garden`.`garden` (`ID_USER`, `DESCRIPTION`, `ACTIVE`, `OBS`, `IP_SERVER`, `IP_CONCENTRATOR`) VALUES ('1', 'Jardin da frente', 1, 'teste', '00:00:00', '00:00:00');
INSERT INTO `connected_garden`.`garden` (`ID_USER`, `DESCRIPTION`, `ACTIVE`, `OBS`, `IP_SERVER`, `IP_CONCENTRATOR`) VALUES ('2', 'Jardin', 1, 'teste2', '00:00:00', '00:00:00');
INSERT INTO `connected_garden`.`garden` (`ID_USER`, `DESCRIPTION`, `ACTIVE`, `OBS`, `IP_SERVER`, `IP_CONCENTRATOR`) VALUES ('3', 'jardin Lateral', 1, 'teste3', '00:00:00', '00:00:00');
INSERT INTO `connected_garden`.`garden` (`ID_USER`, `DESCRIPTION`, `ACTIVE`, `OBS`, `IP_SERVER`, `IP_CONCENTRATOR`) VALUES ('3', 'jardin da sala', 1, 'teste4', '00:00:00', '00:00:00');

--pot`
INSERT INTO `connected_garden`.`pot` (`ID_GARDEN`, `DESCRIPTION`, `TEMP`, `HUM_AIR`, `HUM_SOIL`, `LIGHT`, `ACTIVE`, `MAC1`, `MAC2`) VALUES ('3', 'Pot Margarida', '2', '1', '2', '1', 1, '00:00:00', '00:00:00');
INSERT INTO `connected_garden`.`pot` (`ID_GARDEN`, `DESCRIPTION`, `TEMP`, `HUM_AIR`, `HUM_SOIL`, `LIGHT`, `ACTIVE`, `MAC1`, `MAC2`) VALUES ('3', 'Pot para da camomila', '1', '4', '1', '1', 1, '00:00:00', '00:00:00');
INSERT INTO `connected_garden`.`pot` (`ID_GARDEN`, `DESCRIPTION`, `TEMP`, `HUM_AIR`, `HUM_SOIL`, `LIGHT`, `ACTIVE`, `MAC1`, `MAC2`) VALUES ('2', 'Teste', '1', '3', '5', '4', 1, '00:00:00', '00:00:00');
INSERT INTO `connected_garden`.`pot` (`ID_GARDEN`, `DESCRIPTION`, `TEMP`, `HUM_AIR`, `HUM_SOIL`, `LIGHT`, `ACTIVE`, `MAC1`, `MAC2`) VALUES ('3', 'teste2', '1', '1', '1', '1', 1, '00:00:00', '00:00:00');
INSERT INTO `connected_garden`.`pot` (`ID_GARDEN`, `DESCRIPTION`, `TEMP`, `HUM_AIR`, `HUM_SOIL`, `LIGHT`, `ACTIVE`, `MAC1`, `MAC2`) VALUES ('3', 'teste3', '2', '1', '2', '1', 1, '00:00:00', '00:00:00');

--pot_config`
INSERT INTO `connected_garden`.`pot_config` (`DESCRIPTION`, `TEMP`, `HUM_AIR`, `HUM_SOIL`, `LIGHT`) VALUES ('teste', '1', '1', '1', '1');
INSERT INTO `connected_garden`.`pot_config` (`DESCRIPTION`, `TEMP`, `HUM_AIR`, `HUM_SOIL`, `LIGHT`) VALUES ('teste2', '2', '2', '2', '1');
INSERT INTO `connected_garden`.`pot_config` (`DESCRIPTION`, `TEMP`, `HUM_AIR`, `HUM_SOIL`, `LIGHT`) VALUES ('teste3', '3', '2', '1', '3');

--state_pot
INSERT INTO `connected_garden`.`state_pot` (`ID_POT`, `DESCRIPTION`, `TEMP`, `HUM_AIR`, `HUM_SOIL`, `LIGHT`, `ACTIVE`, `IRRIGATION_AUTO`, `IRRIGATION_ACTIVE`) VALUES ('2', 'estado1', '1', '2', '1', '2', 1, 1, 1);
INSERT INTO `connected_garden`.`state_pot` (`ID_POT`, `DESCRIPTION`, `TEMP`, `HUM_AIR`, `HUM_SOIL`, `LIGHT`, `ACTIVE`, `IRRIGATION_AUTO`, `IRRIGATION_ACTIVE`) VALUES ('2', 'teste State', '2', '5', '3', '4', 1, 0, 0);
INSERT INTO `connected_garden`.`state_pot` (`ID_POT`, `DESCRIPTION`, `TEMP`, `HUM_AIR`, `HUM_SOIL`, `LIGHT`, `ACTIVE`, `IRRIGATION_AUTO`, `IRRIGATION_ACTIVE`) VALUES ('2', 'teste 3', '4', '2', '1', '4', 1, 0, 1);
INSERT INTO `connected_garden`.`state_pot` (`ID_POT`, `DESCRIPTION`, `TEMP`, `HUM_AIR`, `HUM_SOIL`, `LIGHT`, `ACTIVE`, `IRRIGATION_AUTO`, `IRRIGATION_ACTIVE`) VALUES ('3', 'teste', '4', '1', '2', '5', 1, 1, 1);
INSERT INTO `connected_garden`.`state_pot` (`ID_POT`, `DESCRIPTION`, `TEMP`, `HUM_AIR`, `HUM_SOIL`, `LIGHT`, `ACTIVE`, `IRRIGATION_AUTO`, `IRRIGATION_ACTIVE`) VALUES ('3', 'teste4', '5', '4', '1', '2', 1, 1, 0);

--alert`
INSERT INTO `connected_garden`.`alert` (`ID_POT`, `ID_ALERT_TYPE`, `DESCRIPTION`, `ACTIVE`) VALUES ('2', '4', 'Adubar', 1);
INSERT INTO `connected_garden`.`alert` (`ID_POT`, `ID_ALERT_TYPE`, `DESCRIPTION`, `ACTIVE`) VALUES ('2', '2', 'teste', 1);
INSERT INTO `connected_garden`.`alert` (`ID_POT`, `ID_ALERT_TYPE`, `DESCRIPTION`, `ACTIVE`) VALUES ('2', '1', 'por ao sol', 1);
INSERT INTO `connected_garden`.`alert` (`ID_POT`, `ID_ALERT_TYPE`, `DESCRIPTION`, `ACTIVE`) VALUES ('3', '4', 'teste2', 1);
INSERT INTO `connected_garden`.`alert` (`ID_POT`, `ID_ALERT_TYPE`, `DESCRIPTION`, `ACTIVE`) VALUES ('3', '4', 'teste3', 1);
