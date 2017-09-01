def demo():
    i=0;
    while(i<10):
        yield i;
        i+=1;
    
f=demo();
print(f.__next__());
for i in f:
    print(i);
