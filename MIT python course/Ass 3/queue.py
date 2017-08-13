'''
     Author: Ranjit Chavan
     Date:   08 Aug 2017
'''
class Queue(object):
    def __init__(self):
        self.list_of_objects = []
        self.length = 0
    def insert(self,element):
        self.list_of_objects.append(element)
        self.length += 1
    def remove(self):
        if self.length == 0:
            return "Queue is empty"
        else:
            element = self.list_of_objects[0]
            self.list_of_objects = self.list_of_objects[1:]
            self.length -= 1
            return element
    
queue = Queue()
queue.insert(5)
queue.insert(6) 
print (queue.remove() )
queue.insert(7) 
print (queue.remove()) 
print (queue.remove())
print (queue.remove())
