#Group6
#MIT Assignment
#Assignment1
#Exercise 1.14 – Understanding loops

#--------------1.-----------
num = 10
while num > 3:
     print(num)
     num = num -1
"""
Ouput:
10
9
8
7
6
5
4
"""

#---------------2.-----------
divisor = 2
for i in range(0, 10, 2):
     print (i/divisor)

"""
Output
0.0
1.0
2.0
3.0
4.0
"""

#--------------3.------------
num = 10
while True:
     if num < 7:
          break
     print (num)
     num -= 1

"""
Output
10
9
8
7
"""

count = 0
for letter in 'Snow!':
     print ('Letter #', count, 'is', letter)
     count += 1

"""
Output
Letter # 0 is S
Letter # 1 is n
Letter # 2 is o
Letter # 3 is w
Letter # 4 is !
"""
