'''
 Example of Inheritance
'''

#Super Class
class Vehicle():
    def __init__(self,menufacturer,vehicle_type):
        self.manufacturer=menufacturer
        self.vehicle_type=vehicle_type
        print " "
        print "Vehicle Type:"+self.vehicle_type
        print "Manufacturer:"+self.manufacturer


#SubClass of Vehicle
class Truct(Vehicle):
    def __init__(self, local_capacity,noOfContainers,menufacturer,vehicle_type):

        #call __init__() method of super class
        Vehicle.__init__(self, menufacturer, vehicle_type)
        self.local_capacity=local_capacity
        self.noOfContainers=noOfContainers
        print "Local Capacity:"+self.local_capacity
        print "No of Containers:" + self.noOfContainers



#SubClass of Vehicle
class Car(Vehicle):
    def __init__(self,noOfPassangers,noOfDoors,menufacturer,vehicle_type):

        # call __init__() method of super class
        Vehicle.__init__(self, menufacturer, vehicle_type)
        self.noOfPassangers=noOfPassangers
        self.noOfDoors=noOfDoors
        print "No of Passangers:" + self.noOfPassangers
        print "No of Doors:" + self.noOfDoors

#SubClass of Vehicle
class Bike(Vehicle):
    def __init__(self, noOfPassangers,saddleHight,menufacturer,vehicle_type):

        # call __init__() method of super class
        Vehicle.__init__(self, menufacturer, vehicle_type)
        self.noOfPassangers=noOfPassangers
        self.saddleHight=saddleHight
        print "No of Passangers:" + self.noOfPassangers
        print "Saddle Height:" + self.saddleHight


t=Truct('5','1','bmn','tacf')
c=Car('10','4','hh','gdvh')
b=Bike('10','4','hh','gdvh')