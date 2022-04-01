REM   Script: SQL_Activity10
REM   SQL_Activity10


select * from orders;

select * from customers;

select * from salesman;

select Order_no from orders 
where distinct salesman_id = ( select salesman_id from orders where customer_id = 3007);

select Order_no from orders 
where salesman_id = ( select distinct salesman_id from orders where customer_id = 3007);

select * from orders;

select * from salesman;

select Order_no from orders  
where salesman_id in ( select salesman_id from salesman where salesman_city = 'New York');

select * from customers;

select count(customer_id) from customers 
where grade > ( select AVG(grade) from customers where city = 'New York');

SELECT grade, COUNT(*) FROM customers 
GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York');

select * from orders;

select * from salesman;

select * from orders 
where salesman_id = (select salesman_id from salesman where commission = (select max(commission) from salesman));
