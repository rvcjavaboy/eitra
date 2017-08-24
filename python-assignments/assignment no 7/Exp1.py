'''
	Statement:	What method is called when an object is created?
	Author:		Ranjit
	Date:		5/8/2017 
'''

class Test:
	def __init__(self):
		print "Constructor"
	


t=Test();

'''
Answer :__init__ (self, ...)
Output:
	ranjit@ranjit-Vostro-1540:~$ python exp1.py 
	Constructor
	
'''


'''
	Statement:	If you have an object instance, obj, and you want to call
		  	its doSomething() method (assuming it has one), how would you
		  	do this? (write the line of code you would use)
	Author:		Ranjit
	Date:		5/8/2017 
'''

class Test:
	def doSomething(self):
		print "do something "
	


t=Test()
t.doSomething();

'''
Answer:obj.do_something()

Output:	ranjit@ranjit-Vostro-1540:~$ python exp1.py 
	do something 

'''



'''
	Statement:	True or False? An object’s attributes must be defined in the
			object’s __init__ method.
	Author:		Ranjit
	Date:		5/8/2017
	
	
'''
class Test:
	b=False;
	def __init__(self):
		self.a=True;
	def testattr(self):
		self.b=True;
		print	"A",self.a,"	 B",self.b

t=Test();
t.testattr();

'''	
Output:
	ranjit@ranjit-Vostro-1540:~$ python Test.py
	A True 	 B True
'''

'''
	The following code starts the definition of a class called
	Address. The class needs to have two attributes: number and
	streetName. Please add in the two lines of code that will
	create these attributes from the appropriate passed in parameters.
'''
class Address:
	def __init__(self, street, num):
		self.name = street
		self.num = num


'''
Answer:	self.name = street
	self.num = num

Output:
	ranjit@ranjit-Vostro-1540:~$ python Test.py
	A True 	 B True
	
'''

