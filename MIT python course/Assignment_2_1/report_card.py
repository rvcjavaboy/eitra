def report_card(n):
    dic={}
    for i in range(n):
        cl=input("What was the name of this class?")
        score=input("What was your grade?")
        dic[cl]=score
    return dic

n=int(input("How many classes did you take? "))
r=report_card(n)
for i in r.items():
    print (i)
