/*==============================================================*/
/* Database name:  CONNECTED_GARDEN                             */
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     18/09/2015 16:44:36                          */
/*==============================================================*/
 
 
drop database if exists CONNECTED_GARDEN;
 
/*==============================================================*/
/* Database: CONNECTED_GARDEN                                   */
/*==============================================================*/
create database CONNECTED_GARDEN;
 
use CONNECTED_GARDEN;
 
/*==============================================================*/
/* Table: ALERT                                                 */
/*==============================================================*/
create table ALERT
(
   ID_ALERT             int not null auto_increment comment 'Column that stores the alert id.',
   ID_POT               int default 0 comment 'Column that stores the information in the pot id.',
   ID_ALERT_TYPE        int comment 'Column that stores the alert type id.',
   DESCRIPTION          varchar(255) not null default ' ' comment 'Column that stores one alert description.',
   ACTIVATION_DATE      timestamp not null default CURRENT_TIMESTAMP comment 'Column that stores alert activation date information.',
   ACTIVE               bit not null default 1 comment 'Column that stores information of alert status.',
   primary key (ID_ALERT)
);
 
alter table ALERT comment 'Table that stores information of one alert.';
 
/*==============================================================*/
/* Table: ALERT_TYPE                                            */
/*==============================================================*/
create table ALERT_TYPE
(
   ID_ALERT_TYPE        int not null auto_increment comment 'Column that stores the alert type id.',
   DESCRIPTION          varchar(255) not null default ' ' comment 'Column that stores the description of the alerts type.',
   primary key (ID_ALERT_TYPE)
);
 
alter table ALERT_TYPE comment 'Table that stores the alerts types.';
 
/*==============================================================*/
/* Table: GARDEN                                                */
/*==============================================================*/
create table GARDEN
(
   ID_GARDEN            int not null auto_increment comment 'Column that stores the garden id.',
   ID_USER              int comment 'Column that stores the user id.',
   DESCRIPTION          varchar(50) not null default ' ' comment 'Column that stores the description of garden.',
   LAST_UPDATE          timestamp not null default CURRENT_TIMESTAMP comment 'Column that stores the last update of the garden.',
   ACTIVE               bit not null default 1 comment 'Column that stores the information if the garden is active.',
   OBS                  varchar(255) default ' ' comment 'Column that stores observation about the garden.',
   IP_SERVER            varchar(255) default ' ' comment 'Column that stores the ip of the server.',
   IP_CONCENTRATOR      varchar(255) default ' ' comment 'Column that stores the ip of concentrator.',
   primary key (ID_GARDEN)
);
 
alter table GARDEN comment 'Table that stores information of one garden.';
 
/*==============================================================*/
/* Table: POT                                                   */
/*==============================================================*/
create table POT
(
   ID_POT               int not null auto_increment comment 'Column that stores the information in the pot id.',
   ID_GARDEN            int not null default 0 comment 'Column that stores the garden id.',
   DESCRIPTION          varchar(50) not null default ' ' comment 'Column that stores the information referents the description of pot.',
   TEMP                 int not null default 0 comment 'Column that stores the information of temperature.',
   HUM_AIR              int not null default 0 comment 'Column that stores the information of airl humidity of pot.',
   HUM_SOIL             int not null default 0 comment 'Column that stores the information of soil humidity of pot.',
   LIGHT                int not null default 0 comment 'Column that stores information of light incidence.',
   ACTIVE               bit not null default 1 comment 'Column that stores information of pot status.',
   primary key (ID_POT)
);
 
alter table POT comment 'Table that stores information of one pot.';
 
/*==============================================================*/
/* Table: POT_CONFIG                                            */
/*==============================================================*/
create table POT_CONFIG
(
   ID_POTCONFIG         int not null auto_increment comment 'Column that stores the information in the potConfig id.',
   DESCRIPTION          varchar(50) not null default ' ' comment 'Column that stores the information referents the description of pot.',
   TEMP                 int not null default 0 comment 'Column that stores the information of temperature.',
   HUM_AIR              int not null default 0 comment 'Column that stores the information of airl humidity of pot.',
   HUM_SOIL             int not null default 0 comment 'Column that stores the information of soil humidity of pot.',
   LIGHT                int not null default 0 comment 'Column that stores information of light incidence.',
   primary key (ID_POTCONFIG)
);
 
alter table POT_CONFIG comment 'Table that stores information of default configuration of on';
 
/*==============================================================*/
/* Table: STATE_POT                                             */
/*==============================================================*/
create table STATE_POT
(
   ID_STATE_POT         int not null auto_increment comment 'Column that stores the of state pot id.',
   ID_POT               int default 0 comment 'Column that stores the information in the pot id.',
   DESCRIPTION          varchar(50) not null default ' ' comment 'Column that stores the information referents the description of pot state.',
   TEMP                 int not null default 0 comment 'Column that stores the information of temperature current of pot.',
   HUM_AIR              int not null default 0 comment 'Column that stores the information of airl current humidity of pot.',
   HUM_SOIL             int not null default 0 comment 'Column that stores the current moisture information from the pot soil.',
   LIGHT                int not null default 0 comment 'Column that stores the current light information from the pot soil.',
   ACTIVE               bit not null default 1 comment 'Column that stores information of pot status.',
   IRRIGATION_AUTO      bit comment 'Column that stores information if the user is using the automatic irrigation.',
   IRRIGATION_ACTIVE    bit comment 'Column that stores information if the bomb is active.',
   primary key (ID_STATE_POT)
);
 
alter table STATE_POT comment 'Table that stores information referentes the value of pot se';
 
/*==============================================================*/
/* Table: USER_CONFIG                                           */
/*==============================================================*/
create table USER_CONFIG
(
   ID_USER_CONFIG       int not null auto_increment comment 'Column that stores user configuration id.',
   DESCRIPTION          varchar(255) not null default ' ' comment 'Column that stores the information referents the description of user configuration.',
   VALUE                varchar(255) not null default ' ' comment 'Column that stores information of the configuration value.',
   CONFIG               varchar(30) not null default ' ' comment 'Column that stores information of the configuration.',
   primary key (ID_USER_CONFIG)
);
 
alter table USER_CONFIG comment 'Table that stores information of user configuration.';
 
/*==============================================================*/
/* Table: USER_GARDEN                                           */
/*==============================================================*/
create table USER_GARDEN
(
   ID_USER              int not null auto_increment comment 'Column that stores the user id.',
   ID_USER_CONFIG       int comment 'Column that stores user configuration id.',
   NAME                 varchar(50) not null default ' ' comment 'Column that stores the name of user.',
   EMAIL                varchar(255) not null default ' ' comment 'Column that stores the email of user and will be used to send information.',
   NICKNAME             varchar(30) not null default ' ' comment 'Column that stores nickname of user.',
   PASSWORD             varchar(15) not null default '12345' comment 'Column that stores the password of user.',
   ACTIVE               bit not null default 1 comment 'Column that stores information of user status.',
   primary key (ID_USER)
);
 
alter table USER_GARDEN comment 'Table that stores informations of one user.';
 
alter table ALERT add constraint FK_REFERENCE_1 foreign key (ID_POT)
      references POT (ID_POT) on delete restrict on update restrict;
 
alter table ALERT add constraint FK_REFERENCE_5 foreign key (ID_ALERT_TYPE)
      references ALERT_TYPE (ID_ALERT_TYPE) on delete restrict on update restrict;
 
alter table GARDEN add constraint FK_REFERENCE_4 foreign key (ID_USER)
      references USER_GARDEN (ID_USER) on delete restrict on update restrict;
 
alter table POT add constraint FK_REFERENCE_6 foreign key (ID_GARDEN)
      references GARDEN (ID_GARDEN) on delete restrict on update restrict;
 
alter table STATE_POT add constraint FK_REFERENCE_3 foreign key (ID_POT)
      references POT (ID_POT) on delete restrict on update restrict;
 
alter table USER_GARDEN add constraint FK_REFERENCE_2 foreign key (ID_USER_CONFIG)
      references USER_CONFIG (ID_USER_CONFIG) on delete restrict on update restrict;