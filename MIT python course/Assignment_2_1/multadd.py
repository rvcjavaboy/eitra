import math

def multadd(a,b,c):
    angle_test = (math.sin((math.pi)/4.0))+((math.cos((math.pi)/4.0))/2)
    ceiling_test = (math.ceil(a/b))+(2*math.log(c,7))
    print("sin(pi/4) + cos(pi/4)/2 is:")
    print(angle_test)
    print("ceiling(276/19) + 2 log_7(12) is:")
    print(ceiling_test)

multadd(276,19,12)
