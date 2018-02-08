/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/11/19 13:37:59                          */
/*==============================================================*/

drop table if exists SALARY;

drop table if exists USER;

drop table if exists POSITION;


/*==============================================================*/
/* Table: POSITION                                              */
/*==============================================================*/
create table POSITION
(
   POSITION_ID          varchar(64) not null,
   POSITION_NAME        varchar(64) COMMENT '职位名称',
   DESCRIPTION          text COMMENT '职位描述',
   CREATE_TIME          date COMMENT '创建时间',
   CREATE_USER          varchar(64) COMMENT '创建人',
   UPDATE_TIME          date COMMENT '更新时间',
   UPDATE_USER          varchar(64) COMMENT '更新人',
   primary key (POSITION_ID)
);

/*==============================================================*/
/* Table: SALARY                                                */
/*==============================================================*/
create table SALARY
(
   SALARY_ID            varbinary(64) not null,
   USER_ID              varchar(64) COMMENT '用户ID',
   COEFFICIENT          float COMMENT '系数',
   KPI                  float COMMENT '基本绩效',
   LABOR                float COMMENT '工时（80%）',
   LABOR_BONUS          float COMMENT '工时奖',
   PASS_SMALL           int COMMENT '放行（大）',
   PASS_BIG             int COMMENT '放行（小）',
   ADJUST               int COMMENT '加减项',
   PASS_BONUS           int COMMENT '放行费',
   COMPACT_SALARY       int COMMENT '合计',
   TEST_RESULT          int COMMENT '测评成绩',
   EXAMINE_BONUS        int COMMENT '考核奖',
   TOTAL_SALARY         int COMMENT '最终',
   YEAR                 int COMMENT '年份',
   MONTH                int COMMENT '月份',
   CREATE_TIME          date COMMENT '创建日期',
   CREATE_USER          varchar(64) COMMENT '创建人',
   UPDATE_TIME          date COMMENT '更新日期',
   UPDATE_USER          varchar(64) COMMENT '更新人',
   primary key (SALARY_ID)
);

/*==============================================================*/
/* Table: USER                                                  */
/*==============================================================*/
create table USER
(
   USER_ID              varchar(64) not null,
   USER_NAME            varchar(64) COMMENT '登陆用户名',
   PASSWORD             varchar(256) COMMENT '用户密码',
   DISPLAY_NAME         varchar(128) COMMENT '用户姓名',
   POSITION_ID          varchar(64) COMMENT '职位ID',
   EMAIL                varchar(255) COMMENT '用户邮箱',
   DESCRIPTION          text COMMENT '描述',
   CREATE_TIME          date COMMENT '创建日期',
   CREATE_USER          varchar(64) COMMENT '创建人',
   UPDATE_TIME          date COMMENT '更新日期',
   UPDATE_USER          varchar(64) COMMENT '更新人',
   primary key (USER_ID)
);


