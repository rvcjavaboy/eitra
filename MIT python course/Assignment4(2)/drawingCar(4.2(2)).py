'''Program to draw a moving Car'''

from graphics import*
from wheel import *


new_win = GraphWin('A Car', 700, 300)
class Car():
    def __init__(self,p1,r1,p2,r2,h):
        '''

        :param p1: Point for a wheel of circle
        :param r1: radius of that circle
        :param p2: Point for a wheel of circle
        :param r2: radius of that circle
        :param h: parameter for adjust appearance of rectangle
        '''
        self.wheel1=Wheel(p1,0.6*r1,r2)
        self.wheel2 = Wheel(p2,0.6*r2,r1)

        p1.x=p1.x-8
        p1.y=p1.y-h
        p2.x=p2.x+8

        self.rect = Rectangle(p1, p2)


    def draw(self,new_win):
        '''
        function to draw wheel and rectangle
        on window
        '''
        self.wheel1.draw(new_win)
        self.wheel2.draw(new_win)
        self.rect.draw(new_win)

    def set_color(self,c1,c2,c3):
        '''
        To set color property of car
        :param c1: color for one circle of wheel
        :param c2: color for another circle of wheel
        :param c3: color for rectangle

        '''
        self.wheel1.set_color(c1,c2)
        self.wheel2.set_color(c1,c2)
        self.rect.setFill(c3)

    def move(self, dx, dy):
        '''
        To move object
        :param dx: move dx points in x direction
        :param dy: move dy points in y direction

        '''
        self.wheel1.move(dx, dy)
        self.wheel2.move(dx, dy)
        self.rect.move(dx,dy)

    def animate(self,win, dx, dy, n):
        '''
        To make moving continue of an object
        win.after call self.animate after every 100 second
        '''
        if n > 0:
            self.move(dx, dy)
            win.after(100, self.animate, win, dx, dy, n - 1)




# create a car object
# 1st wheel centered at 50,50 with radius 15
# 2nd wheel centered at 100,50 with radius 15
# rectangle with a height of 40



car1 = Car(Point(50, 50), 15, Point(100,50), 15, 40)
car1.draw( new_win )
# color the wheels grey with black tires, and the body pink
car1.set_color('black','grey','pink')
# make the car move on the screen
car1.animate(new_win, 1, 0, 400)
new_win.mainloop()