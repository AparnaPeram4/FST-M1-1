#Import Pandas
import pandas
#Read data from Excel and print it
dataframe = pandas.read_excel('sample.xlsx')
print(dataframe)

#Print number of rows and columns
print("Number of rows and columns:",dataframe.shape)

#Print Emails
print("Emails:")
print(dataframe['Email'])

#Sort data based on First name in ascending order
print("Sorted Data:")
print(dataframe.sort_values('FirstName'))