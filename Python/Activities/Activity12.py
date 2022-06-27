# Function Defination
def calculateSum(no):
    if no:
        return no+calculateSum(no-1)
    else:
        return 0

res =  calculateSum(10) 
#Output
print(res)  