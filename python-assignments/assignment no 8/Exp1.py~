'''
	Author:		Ranjit
	Date :		5/8/2017
'''
class Spell(object):
	def __init__(self, incantation, name):
		self.name = name
		self.incantation = incantation
	def __str__(self):
		return self.name + ' ' + self.incantation + '\n' + \
		self.getDescription()
	def getDescription(self):
		return 'No description'
	def execute(self):
		print self.incantation

class Accio(Spell):
	def __init__(self):
		Spell.__init__(self, 'Accio', 'Summoning Charm')

class Confundo(Spell):
	def __init__(self):
		Spell.__init__(self, 'Confundo', 'Confundus Charm')
	def getDescription(self):
		return 'Causes the victim to become confused and befuddled.'
def studySpell(spell):
	print spell

spell = Accio()
spell.execute()
studySpell(spell)
studySpell(Confundo())


'''
Output
	ranjit@ranjit-Vostro-1540:~/assignment no 8$ python Exp1.py
		Accio
		Summoning Charm Accio
		No description
		Confundus Charm Confundo
		Causes the victim to become confused and befuddled.



'''
'''
What are the parent class(es)? Note that the term "parent class" is
interchangable with the term "superclass".
->    Spell

Whare are the child class(es)? Note that the term "child class" is
interchangeable with the term "subclass".
->>
    Accio 
    Confundo 
What does the code print out? Try figuring it out in your head before you
try running it in Python?
->> Accio
    Sumoning Charm Accio
    No description
    Confundus Charm Confundo
    Causes the victim to become confused and befuddled.
Which getDescription method is called when studySpell(Confundo())
is executed?
->>
    The getDescription method defined within the Confundo class

How do we need to modify Accio so that print Accio() will print the
following description?

class Accio(Spell):
    def __init__(self):
        Spell.__init__(self, 'Accio', 'Summoning Charm')
    def getDescription(self):
        return 'This charm summons an object to the caster, potentially over a significant distance.'
'''
