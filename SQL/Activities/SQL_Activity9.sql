REM   Script: SQL_Activity9
REM   SQL_Activity9



select * from orders;

select * from customers;

select * from salesman;

select * from customers;

select * from salesman;

select cusomers.customer_name, customers.city,salesman.salesman_name from customers 
inner join salesman on customers.salesman_id = salesman.salesman_id;

select customers.customer_name, customers.city,salesman.salesman_name from customers 
inner join salesman on customers.salesman_id = salesman.salesman_id;

select * from customers;

select * from salesman;

select cm.customer_name,cm.grade,sm.salesman_name from salesman as sm 
left outer join customers as cm 
on sm.salesman_id=cm.salesman_id 
where cm.grade < 300  
order by cm.customer_name;

select cm.customer_name, cm.grade ,sm.salesman_name from salesman as sm 
left outer join customers as cm 
on sm.salesman_id = cm.salesman_id 
where cm.grade < 300  
order by cm.customer_name;

select cm.customer_name, cm.grade , sm.salesman_name from customers as cm 
left outer join salesman as sm 
on cm.salesman_id = sm.salesman_id 
where cm.grade < 300  
order by cm.customer_name;

select * from salesman;

select * from customers;

select * from salesman;

select cm.customer_name, cm.grade , sm.salesman_name from customers as cm 
left outer join salesman as sm 
on cm.salesman_id = sm.salesman_id 
where cm.grade < 300  
order by cm.customer_id;

select cm.customer_name, cm.grade , sm.salesman_name from customers cm 
left outer join salesman sm 
on cm.salesman_id = sm.salesman_id 
where cm.grade < 300  
order by cm.customer_id;

select cm.customer_name, cm.grade , sm.salesman_name from customers cm 
left outer join salesman sm 
on cm.salesman_id = sm.salesman_id 
where cm.grade < 300  
order by cm.customer_name;

select * from customers;

select * from salesman;

select cm.customer_name, cm.grade , sm.salesman_name from customers cm 
inner join salesman sm 
on cm.salesman_id = sm.salesman_id 
where sm.commission >12  
order by cm.customer_name;

select cm.customer_name, cm.grade , sm.salesman_name,sm.commission from customers cm 
inner join salesman sm 
on cm.salesman_id = sm.salesman_id 
where sm.commission >12  
order by cm.customer_name;

select * from orders;

select * from salesman;

select * from customers;

select os.order_no,os.order_date,os.purchase_amount, cm.customer_name ,sm.salesman_name,sm.commission from customer cm 
inner join salesman sm 
on cm.salesman_id = sm.salesman_id 
inner join orders os 
on sm.salesman_id = os.salesman_id 
order by os.order_no ;

select os.order_no, os.order_date, os.purchase_amount, cm.customer_name , sm.salesman_name, sm.commission from customers cm 
inner join salesman sm 
on cm.salesman_id = sm.salesman_id 
inner join orders os 
on sm.salesman_id = os.salesman_id 
order by os.order_no ;
