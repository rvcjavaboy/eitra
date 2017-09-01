import math   
class NpowIter:
    def __init__(self,n):
        self.n=n;
        self.size=0;
    def __next__(self):
        self.size+=1;
        if (self.size)==self.n+1:
            raise StopIteration()
        else:
            return math.pow(self.size,self.size)
    def __iter__(self):
        return self;

now=NpowIter(5)
for i in now:
    print(i)
            

        
