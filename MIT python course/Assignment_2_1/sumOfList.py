def sumOfList(l):
    s=sum(i for i in l)
    return s

def cumulativeSum(l):
    l1=[1]
    l1[0]=l[0]
    i=1
    for i in range(1,len(l)):
        l1.append(l[i]+l1[i-1])
    return l1
        

l=[3,4,7,8]
print("List is:",l)
print("Sum is:",sumOfList(l))
print("Cumulative sum list is:",cumulativeSum(l))
