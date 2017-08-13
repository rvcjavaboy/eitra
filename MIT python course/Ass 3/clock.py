'''
Author:		Ranjit Chavan
Date  :		8 Aug 2017

'''

class Clock:
    def __init__(self, time):
        self.time = time
    def print_time(self):
        print (self.time)
boston_clock = Clock('5:30')
boston_clock.time = '10:30'
boston_clock.print_time()
paris_clock = boston_clock
paris_clock.time = '10:30'
boston_clock.print_time()
