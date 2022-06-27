# function to calculate sum
def calculate_sum(numbers):
    sum = 0
    for number in numbers:
        sum+= number
    return sum

# Define list of Numbers
listofNum = [10,40,60,70]   

#Call the function 
result = calculate_sum(listofNum)

#Result
print("The Sum of all the element in a list is :"+ str(result))