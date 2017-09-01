
j=0;
i=0;
def vowelsfind(value1):
    size=0
    
    value = list(value1)
    vowel=['a','e','i','o','u']
    for i in vowel:
        for j in value:
            
            if j==i:
                size=size+1
    return size


size=vowelsfind(input())

print("Number of vowels:",size)
        
