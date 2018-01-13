/**
 *初始化职位信息表
 */
INSERT INTO POSITION (POSITION_ID, POSITION_NAME, CREATE_TIME, CREATE_USER) VALUES
("1","管理员", now(), "admin"),
("2","组长", now(), "admin"),
("3","放行", now(), "admin"),
("4","技术组", now(), "admin"),
("5","维修", now(), "admin"),
("6","工卡", now(), "admin"),
("7","勤务", now(), "admin");

/**
 *c初始化管理员信息
 */
INSERT INTO USER (USER_ID, USER_NAME, PASSWORD, POSITION_ID, EMAIL, DESCRIPTION, CREATE_TIME, CREATE_USER, UPDATE_TIME, UPDATE_USER) VALUES
  ("1","admin","admin","1","admin@yourcompany.com","系统管理员账户",now(),"admin", NULL , NULL );