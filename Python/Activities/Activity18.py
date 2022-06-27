#Import pandas
import pandas
#Read csv file into dataframe
dataframe = pandas.read_csv("sample.csv")

#print full data 
print("Full Data:")
print(dataframe)

#print usrnames column only
print("Usrnames are:")
print(dataframe["Usernames"])

#username and password of the second row
print("User name and password of the second row are :")
print("UserName:",dataframe["Usernames"][1],"|","Password:",dataframe["Usernames"][1])

#Sort the Usernames column name in ascending order
print("Ascending Usernames: ")
print(dataframe.sort_values('Usernames'))

#Sort the passwords column name in descending order
print("Descending passwords: ")
print(dataframe.sort_values('Passwords',ascending=False))