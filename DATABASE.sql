############### START OF SQL SCRIPT ############################################################
# SQL SCRIPT FOR THE CLAIMS MANAGEMENT SYSTEM
#                                                                                      #
# CREATION OF TABLE ROLE;   
#                                                                            #
# INSERT THE RECORDS INTO THE ROLE TABLE  ;                     
#                                                                       #
# CREATION OF TABLE USER ;
#
# CREATION OF TABLE USER DETAILS AND WE HAVE THE USER DETAILS INFORMATION
#
# CREATION OF TABLE CLAIM REQUEST AND  ;
#
#CREATION OF TABLE PAYMENT ;
##############################END OF THE SCRIPT ###############################################                                                                                               #



/*CREATION OF DATABASE "CLAIM_REGISTRATION" */

Create database CLAIM_REGISTRATION;
/* IT IS USED FOR USING THE "CLAIMS_MANAGEMNT_SYSTEM" DATABASE FOR CREATING 
TABLES IN IT */

USE CLAIM_REGISTRATION;
/* CREATION OF ROLE TABLE WITH ATTRUBUTES "ID" AND "ROLENAME"*/
CREATE TABLE ROLE(ID INT AUTO_INCREMENT PRIMARY KEY,
ROLENAME VARCHAR(14) NOT NULL);
INSERT INTO ROLE VALUES(1,"USER");
INSERT INTO ROLE VALUES(2,"ADMIN");

/* CREATION OF "USER" TABLE WITH FILEDS OF ID,FIRSTNAME,
LASTNAME,AGE,CONTACTNUMBER,PASSWORD. 
IT STORES THE MEMBER REGISTRATION INFORMATION OF CLAIMS*/

CREATE TABLE USER(ID INT AUTO_INCREMENT PRIMARY KEY, ROLEID INT NOT NULL,
FOREIGN KEY(ROLEID) REFERENCES ROLE(ID),
USERID INT UNIQUE NOT NULL,PASSWORD VARCHAR(12) NOT NULL);

/* IT IS USED TO CREATE "USERDETAILS"TABLE.IT STORES THE DETAILS 
LIKE AGE,GENDER*/

CREATE TABLE USERDETAILS(ID INT AUTO_INCREMENT PRIMARY KEY,FIRSTNAME VARCHAR(20) NOT NULL,
LASTNAME VARCHAR(20) NOT NULL,AGE INT NOT NULL,GENDER ENUM("FEMALE","MALE"),
CONTACTNUMBER VARCHAR(10),STATUS ENUM("ACCEPTED","REJECTED","PENDING") DEFAULT "PENDING",USERID INT UNIQUE NOT NULL,
FOREIGN KEY(USERID) REFERENCES USER(USERID));

/* IT IS USED TO DISPLAY THE VALUES OF THE ATTRIBUTES STORED IN THE "USER" TABLE*/

SELECT * FROM USER;

/* IT IS USED TO CREATE "CLAIMREQUEST" TABLE WITH ATTRIBUTES OF ID,CLAIMINFORMATION,REASON AND MEMBERID.
IT STORES THE CLAIMS INFORMATION OF MEMBERS .*/

CREATE TABLE CLAIMREQUEST(ID INT AUTO_INCREMENT PRIMARY KEY,
 CLAIMINFORMATION VARCHAR(100) NOT NULL,REASON VARCHAR(100) NOT NULL,
 STATUS ENUM("ACCEPTED","REJECTED","PENDING")
 DEFAULT "PENDING" NOT NULL, CLAIMID INT UNIQUE NOT NULL,
 MEMBERID INT NOT NULL,
 FOREIGN KEY(MEMBERID) REFERENCES USER(USERID));
 
 /*IT IS USED TO  CREATE "PAYMENT" TABLE WITH THE ATTRIBUTES OF ID,
 REQUESTAMOUNT AND CLAIMAMOUNT.IT STORES THE INFORMATION OF PAYMENT OF 
 CLAIM REQUEST*/
 
 CREATE TABLE PAYMENT (ID INT AUTO_INCREMENT PRIMARY KEY, 
 REQUESTAMOUNT DOUBLE NOT NULL,CLAIMAMOUNT DOUBLE DEFAULT 0, 
 CLAIMID INT ,FOREIGN KEY(CLAIMID) REFERENCES CLAIMREQUEST(CLAIMID));
 select * from PAYMENT;
 
 