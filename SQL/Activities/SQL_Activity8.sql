REM   Script: SQL_Activity8
REM   SQL_Activity8


select * from orders;

select * from customer_id , max(purchase_amount) "highest_purchase_amount" 
group by customer_id 
order by highest_purchase_amount desc;

select customer_id , max(purchase_amount) "highest_purchase_amount" 
group by customer_id 
order by highest_purchase_amount desc;

select customer_id , max(purchase_amount) "highest_purchase_amount" from orders 
group by customer_id 
order by highest_purchase_amount desc;

select customer_id , max(purchase_amount) as "highest_purchase_amount" from orders 
group by customer_id 
order by highest_purchase_amount desc;

select customer_id , max(purchase_amount) "MAximum_P_am" from orders 
group by customer_id 
order by MAximum_P_am desc;

select customer_id , max(purchase_amount) as "Maximum_P_am" from orders 
group by customer_id 
order by Maximum_P_am desc;

select customer_id , max(purchase_amount) as "Maximum_P_am" from orders 
group by customer_id 
order by Maximum_P_am desc;

select * from orders;

select customer_id , max(purchase_amount) as "Maximum_P_am" from orders 
group by customer_id;

select customer_id , max(purchase_amount)  "Maximum_P_am" from orders 
group by customer_id;

select * from orders;

select salesman_id ,order_date ,max(purchase_amount) Maximum_P_am from orders 
where order_date = to_date('2012-08-17','YYYY-MM-DD') group by salesman_id ,order_date;

select * from orders;

select salesman_id , order_date ,max(purchase_amount) mpa from orders  
group by salesman_id , order_date 
having mpa in (2030, 3450, 5760, 6000);

select salesman_id , order_date ,max(purchase_amount) mpa from orders  
group by salesman_id , order_date 
having max(purchase_amount) in (2030, 3450, 5760, 6000);

select * from orders;
