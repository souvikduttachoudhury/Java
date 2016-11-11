create or replace procedure POPULATE_VENDOR_LIST_MEMBERS(FLAG VARCHAR2) is
TYPE c IS REF CURSOR;
C1 C;
type c2 is table of NUMBER;
C3 C2;
type CTR is table of NUMBER;
J NUMBER;
I NUMBER;
STR VARCHAR2(4000);
GSTR VARCHAR2(4000);
TOT NUMBER:=10000;
begin

SELECT MAX(ROWNUM) INTO J FROM ALL_OBJECTS;
I:=CEIL(TOT/ J);

STR:='';
FOR CTR IN 1..I
LOOP
STR:=' SELECT ROWNUM  + ' || (CTR-1)*J || ' FROM ALL_OBJECTS UNION ALL ';
GSTR:=GSTR || STR;
END LOOP;

GSTR:=SUBSTR(GSTR,1,LENGTH(GSTR)-10);
DBMS_OUTPUT.PUT_LINE(GSTR);
OPEN C1 FOR GSTR;
FETCH C1 BULK COLLECT INTO C3;

FORALL J IN 1..TOT
INSERT INTO Vendor_Members(Vendor_Id,Member_Id,Email,Low_Email,First_Name,Last_Name,Created_On,Birthday,
Birthmonth,Birthyear,Gender,Registration_Date,Deregistered_On,Password,Invalid_Code)
SELECT A.Vendor_Id, C3(J), c3(j) || '@gmail.com',c3(j) || '@gmail.com','John' || c3(j), 'Smith ' || c3(j),(sysdate - mod(c3(j),800)-1000), to_date('01' || '\' || to_char(mod(c3(J),12)+1) || '\' || to_char(1940 + mod(c3(J),50)),'dd/mm/yyyy'),
mod(c3(j),12)+1,1940 + mod(c3(j),50),DECODE(MOD(C3(J),2),0,'F',1,'M'),ADD_MONTHS((SYSDATE -10 + mod(c3(j),10)),4),NEXT_DAY((SYSDATE -4) + mod(c3(j),10),'WEDNESDAY'), 'Pass ' || c3(j),'Invalid ' || c3(j)
FROM VENDORs A;

FORALL J IN 1..TOT
INSERT INTO Vendor_List_Members(Member_Id,Vendor_List_Id,Subscribed_On,Subscription_Source,List_Status,List_Status_Source)
SELECT C3(J),A.VENDOR_LIST_ID,ADD_MONTHS((SYSDATE -10 + mod(c3(j),10)),4)-5000,'ANAND',MOD(C3(J),2),'ANAND'
FROM VENDOR_LISTS A;
  CLOSE C1;
  commit;

INSERT INTO MT_MEMBERS(MEMBER_ID,ATTRIBUTE_ID,VALUE,ASSIGNED_ON)
SELECT A.MEMBER_ID,B.ATTRIBUTE_ID,A.MEMBER_ID || B.ATTRIBUTE_ID,ADD_MONTHS((SYSDATE -10 - mod(A.MEMBER_ID,50)),3)
FROM Vendor_List_Members A, MT_MEMBER_ATTRIBUTES B
WHERE A.VENDOR_LIST_ID=1;
COMMIT;
end POPULATE_VENDOR_LIST_MEMBERS;
/
