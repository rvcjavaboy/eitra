'''
Author:		Ranjit Chavan
Date  :		8 Aug 2017

'''


#---------------------------------------------Exercise 3.7 – Mutability------------------------------------------------------------
'''
A mutable object can be changed after it's created, and an immutable object can't.
	Mutable:
				list
				dict
				set
				user-defined classes (unless specifically made immutable)

	Immutable:
				int
				float
				decimal
				complex
				tuple
				range
				frozenset
				bytes
'''				
#--------------------------------------------Exercise 3.8 – Finding Bugs---------------------------------------------------------
	def negate(num):
		return -num
	def large_num(num):
		res = (num > 10000)
	negate(b)
	neg_b = num
	print('b:', b, 'neg_b:', neg_b)
	big = large_num(b)
	print ('b is big:', big)
'''
Bugs
		1:	NameError: name 'b' is not defined
		
		2:	NameError: name 'num' is not defined
		
		3:	large_num() does not return anything
'''		
#new code:
				def negate(num):
					return -num
				def large_num(num):
					res = (num > 10000)
					return res;
				b=20;
				num=negate(b)
				neg_b = num
				print('b:', b, 'neg_b:', neg_b)
				big = large_num(b)
				print ('b is big:', big)
'''
Output:
			================== RESTART: C:/Users/Ranjit/Desktop/ass3.py ==================
			b: 20 neg_b: -20
			b is big: False
			
'''
			
			
#--------------------------------------------Exercise 3.9 – Mystery Program-----------------------------------------------------
#Program:
		print ("Think of a number between 1 and 100, but don’t tell me what you choose.")
		min_n = 1
		max_n = 100
		right_answer = False

		while not right_answer:
			 mid_n = (max_n + min_n + 1)/2
			 answer = input('Is it ' + str(mid_n) + '? ')
			 if answer[0] == 'y':
				 right_answer = True
			 elif answer.startswith('higher'):
				 min_n = mid_n + 1
			 elif answer.startswith('lower'):
				 max_n = mid_n -1
			 else:
				 print ("Sorry, I don’t understand your answer.")

		print ('Woohoo! I got it!')

		
'''		
Answer:
	1.The while loop exits when the variable right answer is True. What will cause right answer to be true?
	->>if right_answer variable is true then element can be find to the user
		Woohoo! I got it!
		
	2.How many times will the program print out ’Woohoo! I got it!’?
	->> 1 time only
	
	3.What are we using the variable answer for?
	->>answer variable
	
	4.The program makes a guess in line 8. What user responses will be understood by the program after it makes its guess?
	->>program will guess number and user will response depending upon that is the guess number is small than actual number 
	   then enter higher or,else lower until correct number
	
	5.If the program gets the response ’higher’, what does that tell it about its guess?
	->>the number is in user mind is actually greater than guess number of program
	
	6.What are the variables min n, max n and mid n used for?
	->> min:means lower bound of the guess number
		max:means upper bound of the guess number
		mid:means the guess number of user (max+min)/2
'''	
#----------------------------------Exercise 3.10 – Intro to Object Oriented Programming------------------------------------
'''
	1.What is the difference between a local variable and an object’s attribute?
	->>
		Local Variable											Object Attribute
		1.Locally scoped variables are fast			1.object level scope variable not faster as compare to
													  local variable
		2.access directly by variable name			2.access throw (self) keyword
		
		3.local temporary memory					3.object level memory
		
		
	2.What method is called when the object is created?
	->>__init__() method call for instantiation of object variable
	
	3.If you have an object instance, obj, and you want to call its do something() 
	  method (assuming it has one), how would you do this? 
	  (write the line of code you would use)
	->> obj.do_something()
	
'''
	
#-----------------------------------------3.11 – Understanding Objects------------------------------------------------------
'''
	1. Write a class called Address that has two attributes: number and street name. 
	Make sure you have an init method that initializes the object appropriately.?
	->>
	'''
		#Program:
				class Address:
					def __init__(self,name,street_name):
						self.name=name;
						self.street_name=street_name;
					def display(self):
						print("Name: ",self.name);
						print("Street Name: ",self.street_name);


				a=Address('Ranjit','Sangli')
				a.display();
	'''
		Output:
			============== RESTART: C:/Users/Ranjit/Desktop/ass3/address.py ==============
			Name:  Ranjit
			Street Name:  Sangli
	
	'''
	#2. Consider the following code:
	#	Program
			class Clock:
				def __init__(self, time):
					self.time = time
				def print_time(self):
					time = '6:30'
					print (self.time)
			clock = Clock('5:30')
			clock.print_time()
	'''
		(a)What does the code print out? If you aren’t sure, create a Python file and run it.
		 ->>  5:30
		 
		 (b)Is that what you expected? Why?
		 ->>5:30 
			because in print we pass self.time is object level variable
	
	'''
	#3. Consider the following code:	
		class Clock:
			def __init__(self, time):
				self.time = time
			def print_time(self, time):
				print (time)
		clock = Clock('5:30')
		clock.print_time('10:30')
	'''	
		(a)What does the code print out? If you aren’t sure, create a Python file and run it.
		 ->>  10:30

		(b)What does this tell you about giving parameters the same name as object attributes?
		 ->>The program tell us local variable and object attribute are different.
			The name is same but the having memory
			we call local variable directly by name but object variable using self keyword
	'''
	#4
		class Clock:
			def __init__(self, time):
				self.time = time
			def print_time(self):
				print (self.time)
		boston_clock = Clock('5:30')
		paris_clock = boston_clock
		paris_clock.time = '10:30'
		boston_clock.print_time()	
	'''	
		(a)What does the code print out? If you aren’t sure, create a Python file and run it.
		->>10:30
		
		(b)Why does it print what it does? (Are boston clock and paris clock different objects? Why or why not?)
		->> 
			1.boston_clock = Clock('5:30')
			  boston_clock is pointing class Clock object memory
			
			2.paris_clock = boston_clock
			  paris_clock is pointing to the same memory of boston_clock there is no any new object creation
			
			3.paris_clock.time = '10:30'
			  paris_clock reinitialize  the object attribute  time
			
			4.boston_clock.print_time()
			  boston_clock object print reinitialized value by paris_clock	
'''