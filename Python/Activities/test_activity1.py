import pytest
import math

def testsqrt():
   num = 25
   assert math.sqrt(num) == 5

def testsquare():
   num = 7
   assert num*num == 49

def testequality():
   assert 10 == 10