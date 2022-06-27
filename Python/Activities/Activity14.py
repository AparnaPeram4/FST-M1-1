def fibonaccifun(number):
    if number <=1:
        return number
    else:
        return(fibonaccifun(number-1)+fibonaccifun(number-2))   

num_ent = int(input("Enter a number:  "))   

if num_ent < 0:
    print("Please neter a postivve Number ")
else:
    print("Fibonacci Series for the entered number is :")
    for i in range(num_ent):
        print(fibonaccifun(i))