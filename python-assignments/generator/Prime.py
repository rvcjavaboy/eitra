
def isPrime(n):
    for i in range(2,int(n**0.5)+1):
        if n%i==0:
            return False

    return True

def primeRange(r):
    size=0;
    number=0;
    while 1:
        status=isPrime(number);
        if status==True:
            size+=1;
            if size>r:
                break;
            else:
                yield number;
        number+=1;
        

ob=primeRange(100)
for i in ob:
    print(i)


