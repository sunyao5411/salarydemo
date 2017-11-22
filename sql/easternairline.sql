/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/11/19 13:37:59                          */
/*==============================================================*/


drop table if exists POSITION;

drop table if exists SALARIES;

drop table if exists USER;

/*==============================================================*/
/* Table: POSITION                                              */
/*==============================================================*/
create table POSITION
(
   POSITION_ID          varchar(64) not null,
   POSITION_NAME        varchar(64),
   DESCRIPTION          text,
   primary key (POSITION_ID)
);

/*==============================================================*/
/* Table: SALARIES                                              */
/*==============================================================*/
create table SALARIES
(
   SALARY_ID            varbinary(64) not null,
   USER_ID              varchar(64),
   CREATOR_ID           varchar(64),
   UPDATOR_ID           varchar(64),
   COEFFICIENT          float,
   KPI                  float,
   LABOR                float,
   LABOR_BONUS          float,
   PASS_SMALL           int,
   PASS_BIG             int,
   ADJUST               int,
   PASS_BONUS           int,
   COMPACT_SALARY       int,
   TEST_RESULT          int,
   EXAMINE_BONUS        int,
   TOTAL_SALARY         int,
   MONTH                date,
   CREATE_TIME          date,
   UPDATE_TIME          date,
   primary key (SALARY_ID)
);

/*==============================================================*/
/* Table: USER                                                  */
/*==============================================================*/
create table USER
(
   USER_ID              varchar(64) not null,
   USER_NAME            varchar(64),
   POSITION_ID          varchar(64),
   DESCRIPTION          text,
   CREATE_TIME          date,
   CREATOR              varchar(64),
   UPDATE_TIME          date,
   UPDATOR              varchar(64),
   primary key (USER_ID)
);

alter table SALARIES add constraint FK_Reference_2 foreign key (USER_ID)
      references USER (USER_ID) on delete restrict on update restrict;

alter table SALARIES add constraint FK_Reference_3 foreign key (CREATOR_ID)
      references USER (USER_ID) on delete restrict on update restrict;

alter table SALARIES add constraint FK_Reference_4 foreign key (UPDATOR_ID)
      references USER (USER_ID) on delete restrict on update restrict;

alter table USER add constraint FK_Reference_1 foreign key (POSITION_ID)
      references POSITION (POSITION_ID) on delete restrict on update restrict;


