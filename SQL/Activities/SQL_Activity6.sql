REM   Script: SQL_Activity5
REM   Activity5

select * from salesman;

update salesman 
set grade = 200 where salesman_city = 'Rome';

select * from salesman;

Update salesman 
set grade = 300 where salesman_name = 'James Hoog';

select * from salesman;

Update salesman 
set salesman_name = 'Pierre' where salesman_name = 'McLyon';

select * from salesman;
