'''
4.
	Your task is to define the following two methods for the Coordinate
	class:
	(a) Add an __eq__ method that returns True if coordinates refer
	to same point in the plane (i.e., have the same x and y
	coordinate).
	(b) Define __repr__, a special method that returns a string that
	looks like a valid Python expression that could be used to
	recreate an object with the same value. In other words,
	eval(repr(c)) == c given the definition of __eq__ from part (a).
'''
class Coordinate(object):
	    def __init__(self, x, y):
		self.x = x
		self.y = y

	    def getX(self):
		return self.x

	    def getY(self):
		return self.y

	    def __str__(self):
		return '<' + str(self.getX()) + ', ' + str(self.getY()) + '>'

	    def __eq__(self, other):
		
		if self.getX() == other.getX():
		    if self.getY() == other.getY():
		        return True
		return False

	    def __repr__(self):
		return 'Coordinate(' + str(self.getX()) + ', ' + str(self.getY()) + ')'


test_coord = Coordinate(10, 20)
test_coord2 = Coordinate(10, 20)
test_coord3 = Coordinate(10, 201)
print(test_coord.__eq__(test_coord2))
print(test_coord.__eq__(test_coord3))

print(test_coord.__repr__())
'''
output:	
	ranjit@ranjit-Vostro-1540:~$ python Test.py
	True
	False
	Coordinate(10, 20)
	
'''
'''
4.
	Your task is to define the following two methods for the Coordinate
	class:
	(a) Add an __eq__ method that returns True if coordinates refer
	to same point in the plane (i.e., have the same x and y
	coordinate).
	(b) Define __repr__, a special method that returns a string that
	looks like a valid Python expression that could be used to
	recreate an object with the same value. In other words,
	eval(repr(c)) == c given the definition of __eq__ from part (a).
'''
class Coordinate(object):
	    def __init__(self, x, y):
		self.x = x
		self.y = y

	    def getX(self):
		return self.x

	    def getY(self):
		return self.y

	    def __str__(self):
		return '<' + str(self.getX()) + ', ' + str(self.getY()) + '>'

	    def __eq__(self, other):
		
		if self.getX() == other.getX():
		    if self.getY() == other.getY():
		        return True
		return False

	    def __repr__(self):
		return 'Coordinate(' + str(self.getX()) + ', ' + str(self.getY()) + ')'


test_coord = Coordinate(10, 20)
test_coord2 = Coordinate(10, 20)
test_coord3 = Coordinate(10, 201)
print(test_coord.__eq__(test_coord2))
print(test_coord.__eq__(test_coord3))

print(test_coord.__repr__())
'''
output:	
	ranjit@ranjit-Vostro-1540:~$ python Test.py
	True
	False
	Coordinate(10, 20)
	
'''

