#The format() method takes unlimited number of arguments, and are placed into the respective placeholders
quantity = 3
itemno = 567
price = 49.95
myorder = "I want {} pieces of item {} for {} dollars."
print(myorder.format(quantity, itemno, price))

quantity = 3
itemno = 567
price = 49.95
#we can use index numbers {0} to be sure the arguments are placed in the correct placeholders
myorder = "I want to pay {1} dollars for {2} pieces of item {0}." 
print(myorder.format(quantity, itemno, price)) 
# Output: I want to pay 49.95 dollars for 3 pieces of item 567.