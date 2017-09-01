def fileReader(n):
    f = open(n,'r')
    for line in f.readlines():
        counter=0;
        symbol = 'abcdefghijklmnopqrstuvwxyz'
        for key in symbol:
             counter+=line.count(key)
        yield line," count::",counter
        
    f.close()


on=fileReader('my.txt')
for line in on:
    print(line);
