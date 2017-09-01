'''
Write a generator that creates an endless stream of numbers
starting from a value given as
argument with a step size of 5.
Write one version without and one with itertools.

'''

def Num(n):
    while 1:
        yield n
        n+=5;
    

n=Num(int(input("Enter Number")))
for i in n:
    print(i)
