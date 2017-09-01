'''
    

'''
def binarysearch(liststr,start,end,key):
    if start<end:
        mid=int(start+(end-start)//2);
        if liststr[mid]==key:
            return True;
        elif liststr[mid]>key:
            return binarysearch(liststr,start,mid-1,key)
        elif liststr[mid]<key:
            return binarysearch(liststr,mid+1,end,key)
    else:
        return False;
        
def isIn(c,str):
    return binarysearch(list(str),0,len(str),c);
            
    


print (isIn('a', '')) # False
print (isIn('t', 'e')) # False
print (isIn('e', 'e')) # True
print (isIn('y', 'bccfhmqrvvy')) # True
print (isIn('i', 'aabdegijnpqrt')) # True
print (isIn('z','abcdefghijkm')) # False

