'''
2. Consider the following code:
'''
class Clock:
	def __init__(self, time):
		self.time = time
	def print_time(self):
		time = '6:30'
		print self.time

clock = Clock('5:30')
clock.print_time()
'''
 What does the code print out? If you aren't sure, create a Python file and run it.
output:
	ranjit@ranjit-Vostro-1540:~$ python Test.py
	5:30

 Is that what you expected? Why?

Yes, because we printed out the attribute self.time, not the local variable time.
'''

'''
3. Consider the following code:

'''
class Clock:
	def __init__(self, time):
		self.time = time
	def print_time(self, time):
		print time

clock = Clock('5:30')
clock.print_time('10:30')
'''
What does the code print out? If you aren't sure, create a Python file and run it.
output:
	ranjit@ranjit-Vostro-1540:~$ python Test.py
	10:30



'''

