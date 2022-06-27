import pytest
#Addition
def test_addition():
    num1 = 10
    num2 = 20

    sum = num1+num2

    assert sum == 30

#Subtraction
def test_subtraction():

    num1 = 20
    num2 = 10

    diff = num1 - num2 

    assert diff ==10

#Multiplication
def test_multiplication():

    num1 = 10
    num2 = 20

    prod =   num1*num2

    assert prod ==200

#Division
def test_division():

    num1 = 20
    num2 = 10

    div =  20/10

    assert div == 2
         


