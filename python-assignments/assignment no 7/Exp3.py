'''
3.
Below is a transcript of a session with the Python shell. Provide
the type and value of the expressions being evaluated. If evaluating
an expression would cause an error, select NoneType and error.
If the result is a function, select function and "function" as value.
Try to do this problem by hand before turning to your interpreter
for help. Assume the following definitions have been made:
'''

class Wierd(object):
    	def __init__(self, x, y):
        	self.y = y
        	self.x = x
    	def getX(self):
        	return self.x
    	def getY(self):
        	return self.y

class Wild(object):
	    def __init__(self, x, y):
		self.y = y
		self.x = x
	    def getX(self):
		return self.x
	    def getY(self):
		return self.y

X = 7
Y = 8

w1 = Wierd(X, Y)
print w1.getX()

print w1.getY()

w2 = Wild(X, Y)
print w2.getX()

print w2.getY()

w3 = Wild(17, 18)
print w3.getX()

print w3.getY()

w4 = Wild(X, 18)
print w4.getX()

print w4.getY()

X = w4.getX() + w3.getX() + w2.getX()
print X

print w4.getX()

Y = w4.getY() + w3.getY()
Y = Y + w2.getY()
print Y

print w2.getY()
'''
output:	
	ranjit@ranjit-Vostro-1540:~$ python Test.py
	7
	8
	7
	8
	17
	18
	7
	18
	31
	7
	44
	8
	ranjit@ranjit-Vostro-154
'''

