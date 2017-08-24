print ("Enter a date to find what day of the week it was.\n\n")
print ("March = 1\n")
print ("April = 2\n")
print ("May = 3\n")
print ("June = 4\n")
print ("July = 5\n")
print ("August = 6\n")
print ("September = 7\n")
print ("October = 8\n")
print ("November = 9\n")
print ("December = 10\n")
print ("January = 11 (NOTE January and February months\n")
print ("February = 12 should be written as if from the previous year.)\n")
month = input("Month? ")
day = input("Day? ")
year = input("Year? ")

######## Zeller's Algorithm ########
A = int(month)
B = int(day)
C = int(year[2:4]) #C and D only work for dates 1000-9999. Should be fine.
D = int(year[0:2]) #We'll probably have abolished weekdays by then anyways.

W = (13*A - 1) / 5
X = C / 4
Y = D / 4
Z = W + X + Y + B + C - 2*D
R = Z % 7 #R = Day of the week, 0 = Sunday, 1 = Monday...

day_of_week = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday"]

final_answer = day_of_week[R]
##########################################

print ("This date occurred on a " + final_answer + ".")
