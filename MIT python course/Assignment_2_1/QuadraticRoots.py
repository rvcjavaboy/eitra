import math

def QuadraticRoots(a,b,c):
    d=(b*b)-(4*a*c)
    if d>0:
        root1=((-b + math.sqrt(d))//(2*a))
        root2=((-b - math.sqrt(d))//(2*a))
        print("Roots are:",root1,"and",root2)

    elif d==0:
        root=(-b//(2*a))
        print("One root possible, that is,",root)

    else:
        print("The roots are complex")

QuadraticRoots(1,1,1)
QuadraticRoots(1,2,-6)
QuadraticRoots(2,4,2)
        
