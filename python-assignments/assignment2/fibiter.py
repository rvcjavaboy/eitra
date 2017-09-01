import time
startNumber = int(input("Enter the start number here "))
endNumber = int(input("Enter the end number here "))
start_time = time.time()
def fibiter(n,end):
    f1=1
    f2=1
    tmp=int()
    for i in range(end,int(n)-1):
        tmp = f1+f2
        f1=f2
        f2=tmp
    return f2
print(fibiter(startNumber,endNumber))
print("--- %s seconds ---" % (time.time() - start_time))
