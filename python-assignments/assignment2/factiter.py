import time;
def fact(x):
    temp=1;
    for i in range(1,x+1):
        temp=temp*i;

    return temp;


start_time = time.time()
print(fact(6));
print("--- %s seconds ---" % (time.time() - start_time))

