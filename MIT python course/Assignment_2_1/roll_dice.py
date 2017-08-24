import random

def roll_dice(sides,rolls):
    for i in range(rolls):
        a=random.randint(1,sides)
        print(a)
    print("That's all!!")

roll_dice(6,5)
