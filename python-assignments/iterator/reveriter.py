class Reverse_iter:
    def __init__(self,l):
        self.lis=l;
        self.size=len(self.lis);
    def __next__(self):
        if self.size==0:
            raise StopIteration()
        else:
            self.size-=1;
            return self.lis[self.size];
        
    def __iter__(self):
        return self;


l=[1,2,3,4,5,6,77,8,9];
ob=Reverse_iter(l);
for i in ob:
    print(i);
        
