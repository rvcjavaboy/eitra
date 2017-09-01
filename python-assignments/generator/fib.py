def Fib():
    a, b = 0, 1
    while 1:
        yield a
        a, b = b, a + b

a = Fib()


for i in range(10):
    print(a.__next__());
    
