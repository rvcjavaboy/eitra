def binary(decimal) :
    while decimal != 0 :
        yield str(decimal % 2)
        decimal    //=  2
    
o=binary(10)
for  i in o:
    print(i)
