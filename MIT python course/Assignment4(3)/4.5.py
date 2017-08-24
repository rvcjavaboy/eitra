class Spell(object):
    def __init__(self, incantation, name):
        self.name = name
        self.incantation = incantation

    def __str__(self):
        return self.name + ' ' + self.incantation + '\n' + \
               self.getDescription()

    def getDescription(self):
        return ('No description')

    def execute(self):
        print (self.incantation)


class Accio(Spell):
    def __init__(self):
        Spell.__init__(self, 'Accio', 'Summoning Charm')

    def __str__(self):
        return ('This charm summons an object to the caster, potentially over a significant distance.')


class Confundo(Spell):
    def __init__(self):
        Spell.__init__(self, 'Confundo', 'Confundus Charm')

    def getDescription(self):
        return ('Causes the victim to become confused and befuddled.')


def studySpell(spell):
    print (spell)


spell = Accio()
spell.execute()
studySpell(spell)
studySpell(Confundo())
print(" ")
studySpell(Accio())

'''
(1) What are the parent and child classes here?
    Parent Class: Spell
    Child Class : Accio,Confundo

(2) What does the code print out?

            Accio
            Summoning Charm Accio
            No description
            Confundus Charm Confundo
            Causes the victim to become confused and befuddled.

(3) Which getDescription method is called when studySpell(Confundo()) is
    executed?Why?

    The getDescription method defined within the Confundo class
    
     As We are making object of Confudo by Confudo()it will first call __init__ method of Confudo class 
     in whih it calls __init__ method of Spell class.When studySpell(Confudo()) method is called print(Confudo()) is called.
     when print apply to object it will call __str__ method of that class.Here object of Confudo() is passes in print ,but
     here Confud has no __str__ method so it calls it's super class Spell's __str__ method. In which it calles 
     self.getdescription() of Confudo class because we have object of Confudo class.
     

(4) What do we need to do so that 'print Accio()' will print the appropriate description
    ('This charm summons an object to the caster, potentially over a significant distance')? 
    Write down the code that we need to add and/or change.
    
        def __str__(self):
            return ('This charm summons an object to the caster, potentially over a significant distance.')
 
 
 



'''