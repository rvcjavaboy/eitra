'''
    Title:ApplytoEach

'''    

testList = [1, -4, 8, -9]
def applyToEach(testList, f):
    for i in range(len(testList)):
        testList[i] = f(testList[i])

'''def timesFive(a):
    return abs(a)'''

'''def timesFive(a):
    return (a+1)'''

def timesFive(a):
    return a*a

applyToEach(testList,timesFive)
print(testList)
