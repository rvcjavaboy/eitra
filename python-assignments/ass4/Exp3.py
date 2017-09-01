'''
   
    Title:Animals

'''    

animals = { 'a': ['aardvark'], 'b': ['baboon'], 'c': ['coati']}
animals['d'] = ['donkey']
animals['d'].append('dog')
animals['d'].append('dingo')

def howMany(aDict):
    return sum(len(i) for i in aDict.values())
print(howMany(animals))


def biggest(aDict):
    big=0
    c=[]
    if len(aDict)==0:
        return None
    for i in aDict:
        if  big<=len(aDict[i]):
            big=len(aDict[i])
            c=i
    return str(c)

print(biggest(animals))#d
print(biggest({})) # None
print(biggest({'R': []}))# ’R’ 
print(biggest({'a': [14]}))#’a’
print(biggest({'a': [10, 20, 7, 4, 0, 12, 3], 'b': [18, 17, 13, 4, 4, 14]})) #’a’   
