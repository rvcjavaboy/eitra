from itertools import *

i = 0
for item in cycle(['R','A','N','J','I','T']):
    i += 1
    if i == 12:
        break
    print (i, item)
