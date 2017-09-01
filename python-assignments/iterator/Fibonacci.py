class Fibonacci:
    def __init__(self,maxnum):
        self.maxnum=maxnum;
        self.x=0;
    def __next__(self):
        self.x+=1
        num=F(self.x)
        if self.maxnum<num:
            raise StopIteration()
        else:
            return num;

    def __iter__(self):
        return self;
def F(n):
        if n == 0:
            return 0
        elif n == 1:
            return 1
        else:
            return F(n-1)+F(n-2)
    
fib=Fibonacci(50);
for i in fib:
    print(i)
