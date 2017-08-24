#1
for i in range(1, 11):
    print ("1/" + str(i) + " is " + str(1.0/i))

#2
n = int(input("Enter no. for countdown: "))
if n>0:
     while n!=0:
          n-=1
          print(n)
else:
     print("You've entered wrong or negative number")

#3
base = int(input("Enter base: "))
exp = int(input("Enter exponential: "))
res = base**exp
print(res)

#4
while True:
     n = int(input("Enter number: "))
     if n%2!=0:
          print("Please enter number which is divisible by 2 only")
          continue
     else:
          print("Number is divisible by 2")
          break
