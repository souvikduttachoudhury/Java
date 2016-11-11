Create Table salesPeople_souvik(SNUM NUMBER(4) Primary Key,SNAME Varchar2(20),City Varchar2(20),Comm Number(5,2));

Create table customers_souvik(CNUM NUMBER(4) Primary Key,CNAME Varchar2(20),City Varchar2(20),Rating Number(3),SNUM Foriegn Key references salesPeople_souvik(SNUM));

CREATE TABLE ORDERS_souvik(ONUM NUMBER(4,0) NOT NULL ENABLE,AMOUNT NUMBER(10,0),ODATE DATE,SNUM NUMBER(4,0),CNUM NUMBER(4,0),CONSTRAINT ORDERS_PK PRIMARY KEY(ONUM) ENABLE,CONSTRAINT Order_Sales_FK FOREIGN KEY(SNUM) REFERENCES salesPeople_souvik(SNUM) ENABLE,CONSTRAINT Order_Cust_Fk FOREIGN KEY(CNUM) REFERENCES customers_souvik(CNUM) ENABLE);
   
INSERT into salesPeople_souvik Values (1001,'Peel','London',0.12);
INSERT into salesPeople_souvik Values (1002,'Serres','San Jose',0.13);
INSERT into salesPeople_souvik Values (1004,'Motika','London',0.11);
INSERT into salesPeople_souvik Values (1007,'Rifkin','Barcelona',0.15);
INSERT into salesPeople_souvik Values (1003,'AxelRod','New York',0.10);
INSERT into salesPeople_souvik Values (1005,'Fran','London',0.26);

Insert into customers_souvik Values(2001,'Hoffman','London',100,1001);
Insert into customers_souvik Values(2002,'Giovanni','Rome',200,1003);
Insert into customers_souvik Values(2003,'Liu','San Jose',200,1002);
Insert into customers_souvik Values(2004,'Grass','Berlin',300,1002);
Insert into customers_souvik Values(2006,'Clemens','London',100,1001);
Insert into customers_souvik Values(2008,'Cisneros','San Jose',300,1007);
Insert into customers_souvik Values(2007,'Periera','Rome',100,1004);


Insert into Orders_souvik(ONUM,Amount,Odate,cnum,snum) Values(3001,18.69,'03-Oct-96',2008,1007);
Insert into Orders_souvik(ONUM,Amount,Odate,cnum,snum) Values(3003,767.19,'03-Oct-96',2001,1001);
Insert into Orders_souvik(ONUM,Amount,Odate,cnum,snum) Values(3002,1900.10,'03-Oct-96',2007,1004);
Insert into Orders_souvik(ONUM,Amount,Odate,cnum,snum) Values(3005,5160.45,'03-Oct-96',2003,1002);
Insert into Orders_souvik(ONUM,Amount,Odate,cnum,snum) Values(3006,1098.16,'03-Oct-96',2008,1007);
Insert into Orders_souvik(ONUM,Amount,Odate,cnum,snum) Values(3009,1713.23,'04-Oct-96',2002,1003);
Insert into Orders_souvik(ONUM,Amount,Odate,cnum,snum) Values(3007,75.75,'04-Oct-96',2002,1003);
Insert into Orders_souvik(ONUM,Amount,Odate,cnum,snum) Values(3008,4723.00,'05-Oct-96',2006,1001);
Insert into Orders_souvik(ONUM,Amount,Odate,cnum,snum) Values(3010,1309.95,'06-Oct-96',2004,1002);
Insert into Orders_souvik(ONUM,Amount,Odate,cnum,snum) Values(3011,9891.88,'06-Oct-96',2006,1001);

Commit;
/



















































