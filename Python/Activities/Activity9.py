firstList = [12,23,24,14,15,17]
secondList = [23,10,4,0,2,1]
print ("First List:",firstList)
print ("Second List",secondList)

#Declare a thirdlist to store result
thirdList = []

#Get odd numbers from first list
for num in firstList:
    if (num%2 !=0):
        thirdList.append(num)

#Get even numbers from second list
for num in secondList:
    if(num%2==0):
        thirdList.append(num)

#Output
print("Result is :" +str(thirdList))      