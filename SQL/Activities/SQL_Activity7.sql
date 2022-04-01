REM   Script: SQL_Activity7
REM   SQL_Activity7



select * from orders;

select sum(purchase_amount) from orders;

select avg(purchase_amount) from orders;

select avg(purchase_amount) Average from orders;

select max(purchase_amount) Maximum from orders;

select * from min(purchase_amount) Minimum from orders;

select min(purchase_amount) Minimum from orders;

select * from orders;

select count(distinct salesman_id) from orders ;

select * from orders;

select count(distinct salesman_id) "Total_Salesman" from orders ;

select sum(purchase_amount) "Sum" from orders;
