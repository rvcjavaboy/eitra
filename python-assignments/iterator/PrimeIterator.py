class PrimeIterator:
    def __init__(self,size):
        self.size=size;
        self.x=0;
        self.count=0;
    def __next__(self):
        self.x+=1
        self.count+=1;
        if self.count==self.size:
            raise StopIteration()
        if isPrime(self.x)==True:
            return self.x
        
        
    def __iter__(self):
        return self;

def isPrime(n):
    for i in range(2,int(n**0.5)+1):
        if n%i==0:
            return False

    return True

ob=PrimeIterator(50)


for i in ob:
    if not i==None:
        print(i);


