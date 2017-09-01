def semordnilap(str1,str2):
    start=list(str1)
    end=list(str2)
    size=len(end)-1
    temp=True;
    for  c in start:
        print('C||',c,'end[size]',end[size])
        if not c==end[size]:
            
            temp=False;
        size=size-1;
    return temp;
            
def semordnilapWrapper(str1, str2):
# A single−length string cannot be semordnilap
    if len(str1) == 1 or len(str2) == 1:
        return False
# Equal strings cannot be semordnilap
    if str1 == str2:
        return False
    return semordnilap(str1, str2)

print(semordnilapWrapper('live', 'evil')) # True
print(semordnilapWrapper('tact', 'Cat')) # False
print(semordnilapWrapper('desserts', 'stressed')) # True
print(semordnilapWrapper('level', 'level')) # False
print(semordnilapWrapper('rats live on', 'no evil star')) # True
print(semordnilapWrapper('s', 'c')) # False
print(semordnilapWrapper('l', 'l')) # False
