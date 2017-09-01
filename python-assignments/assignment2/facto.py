
import time
def fact(value,temp):
    if value==1:
        print(temp);
        return temp;
    else:
       temp=value*temp;
       fact(value-1,temp);



start_time = time.time()
print (fact(6,1));
print("--- %s seconds ---" % (time.time() - start_time))
