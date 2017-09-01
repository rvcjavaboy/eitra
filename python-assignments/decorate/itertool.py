import itertools as it
from itertools import *

cycler = it.cycle([1,2,3])
print("cycler:",next(cycler))
print(next(cycler))
print(next(cycler))

counter = it.count(5)
print("Counter:",next(counter))

list(it.repeat(4, 2))
list(it.repeat(2, 4))
endless = it.repeat(3)
print("Repeat:",next(endless))
print(next(endless))

for i in zip([1,2,3],['a','b','c']):
    print("iZip:",i)

print("Chain:",list(it.chain([1,2,3], [4,5,6])))

