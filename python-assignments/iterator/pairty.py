class parity:
    def __init__(self, no):
        self.no = no
    def __iter__(self):
        self.n = 1
        return self

    def __next__(self):
        if(self.no>0):
            a=self.no%2
            self.no=int(self.no/2)
            return a;
        else:
            raise StopIteration
c=input()
ob=parity(int(c))
ls=[]
count=0
for i in ob:
    ls.append(i)
    if(i==1):
        count=count+1
for ip in reversed(ls):
    print(ip,end='')
if(count%2==0):
    if(ls[0]==0):
        ls[0]=1
    else:
        ls[0]=0
print("\nParity")
for ip in reversed(ls):
    print(ip,end='')
