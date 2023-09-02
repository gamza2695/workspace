
------------------ [관리자 계정] ------------------

-- 01. example 계정을 생성하고 개채생성, 변경, 제거권한과,DB연결 권한을 추가하고 
--	   example2 계정을 생성하고 DB연결 권한과 VIEW 생성 권한을 추가한다.

-- example 계정 생성
ALTER SESSION SET "_ORACLE_SCRIPT" = TRUE;
CREATE USER example_jyj IDENTIFIED BY "4453";
GRANT CONNECT, RESOURCE TO example_jyj;
ALTER USER example_jyj DEFAULT TABLESPACE "A230724"
QUOTA 20M ON "A230724";


-- example2 계정 생성
ALTER SESSION SET "_ORACLE_SCRIPT" = TRUE;
CREATE USER example2_jyj IDENTIFIED BY "4453";
GRANT CONNECT, CREATE VIEW TO example2_jyj;
ALTER USER example2_jyj DEFAULT TABLESPACE "A230724"
QUOTA 20M ON "A230724";


-- 02. example2 계정의 DB연결 권한을 회수 후 계정 삭제한다.
REVOKE CONNECT FROM example2_jyj;
DROP USER example2_jyj CASCADE;




ALTER SESSION SET "_ORACLE_SCRIPT" = TRUE;
DROP USER example_jyj CASCADE;



