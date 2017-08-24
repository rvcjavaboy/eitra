#Group6
#MIT Assignment
#Assignment1
#Exercise 1.13 – Conditionals

location = "California"
pay = 25000

if location == "U.S.S. Enterprise":
     print ("So long, suckers! I’ll take it!")
elif location == "Massachusetts":
     if pay < 100000:
          print ("No way")
     else:
          print ("I'll take it!")
elif location == "California" and pay > 40000:
     print ("I’ll take it!")
elif pay > 60000:
     print ("I’ll take it!")
else:
     print ("No thanks, I can find something better.")

"""
location = "Massachusetts"
pay = 50000
#Output: No way
"""

"""
location = "Iowa"
pay = 50000
#Output: No thanks, I can find something better.
"""

"""
location = "California"
pay = 50000
#Output: I’ll take it!
"""

"""
location = "U.S.S. Enterprise"
pay = 1
#Output: So long, suckers! I’ll take it!
"""

"""
location = "California"
pay = 25000
#Output: No thanks, I can find something better.
"""
