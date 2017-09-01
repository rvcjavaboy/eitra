import Assignment1

while True:
     print("\n\n\n1.Access Character \n2.Concate String \n3.Find Substring \n4.Replace Substring \n0. Exit")
     n = int(input("Enter your choice: "))
     if n==1:
          Assignment1.access_char()
     elif n==2:
          Assignment1.concate()
     elif n==3:
          Assignment1.sub_string()
     elif n==4:
          Assignment1.replace_substr()
     elif n==0:
          break
     else:
          print("You've entered wrong choice!")
