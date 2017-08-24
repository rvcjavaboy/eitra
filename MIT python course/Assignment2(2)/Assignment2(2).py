

look = "Look at me!"
now =  "NOW"

print(look[:4])                         #Look
print(look[-1])                         #!
print(look*2)                           #Look at me!Look at me!
print(look[:-1] + now + look[-1])       #Look at meNOW!
print(now[1])                           #O
#print(now[4])                           #IndexError: string index out of range
print(look*2 + look[:-1] + now + look[-1])  #Look at me!Look at me!Look at meNOW!

a_list = [3, 5, 6, 12]
print(a_list[0])                    #3

print(a_list[-1])                   #12

print(a_list[1:])                   #[5, 6, 12]

for i in a_list:                    #3
    print(i)                        #5
                                    #6
                                    #12
list2=[]
for i in reversed(a_list):
    list2.append(i)
print(list2)                        #[12, 6, 5, 3]

result_list=[i*3 for i in a_list]
print(result_list)                     #[9, 15, 18, 36]

result_list=[True if i%2==0 else False for i in a_list]
print(result_list)                                          #[False, False, True, True]
