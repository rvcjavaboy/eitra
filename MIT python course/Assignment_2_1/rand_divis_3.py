import math
import random

def rand_divis_3():
    a=random.randint(0,100)
    print("Random number generated is:",a)
    if a%3==0:
        print("It is divisible by 3")
    else:
        print("It is not divisible by 3")

rand_divis_3()
