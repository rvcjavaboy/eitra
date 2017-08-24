'''
program to display different shapes containing different blocks
'''

from graphics import*
from tetrominoes import *


class Shape:
    def __init__(self,coords,clr):
        '''

        :param coords: take coordinates of shapes
        :param clr: colour of shape
        '''
        self.blocks=[]

        for pos in coords:
            self.blocks.append(Block(pos,clr))

    def draw(self,win):
        for block in self.blocks:
            block.draw(win)



class I_shape(Shape):
    def __init__(self, center):
        '''

        :param center: center of shape
        '''
        coords = [Point(center.x - 2, center.y),
                  Point(center.x - 1, center.y),
                  Point(center.x, center.y),
                  Point(center.x + 1, center.y)]
        Shape.__init__(self, coords, "blue")

class J_shape(Shape):
    def __init__(self, center):
        '''
        :param center: center of shape
        '''
        coords = [Point(center.x - 1, center.y),
                  Point(center.x, center.y),
                  Point(center.x+1, center.y),
                  Point(center.x+1, center.y+1)]
        Shape.__init__(self, coords, "orange")

class L_shape(Shape):
    def __init__(self, center):
        '''
        :param center: center of shape
        '''
        coords = [Point(center.x - 1, center.y),
                  Point(center.x, center.y),
                  Point(center.x+1, center.y),
                  Point(center.x-1, center.y+1)]
        Shape.__init__(self, coords, "Cyan")

class O_shape(Shape):
    def __init__(self, center):
        '''
        :param center: center of shape
        '''
        coords = [Point(center.x - 1, center.y),
                  Point(center.x, center.y),
                  Point(center.x, center.y+1),
                  Point(center.x-1, center.y+1)]
        Shape.__init__(self, coords, "red")

class S_shape(Shape):
    def __init__(self, center):
        '''
        :param center: center of shape
        '''
        coords = [Point(center.x +1, center.y),
                  Point(center.x, center.y),
                  Point(center.x, center.y+1),
                  Point(center.x-1, center.y+1)]
        Shape.__init__(self, coords, "green")

class T_shape(Shape):
    def __init__(self, center):
        '''
        :param center: center of shape
        '''
        coords = [Point(center.x-1, center.y),
                  Point(center.x, center.y),
                  Point(center.x+1, center.y),
                  Point(center.x, center.y+1)
                  ]
        Shape.__init__(self, coords, "yellow")

class Z_shape(Shape):
    def __init__(self, center):
        '''
        :param center: center of shape
        '''
        coords = [Point(center.x-1, center.y),
                  Point(center.x, center.y),
                  Point(center.x, center.y+1),
                  Point(center.x+1, center.y+1)
                  ]
        Shape.__init__(self, coords, "Hot Pink")

win = GraphWin("Tetrominoes", 900, 150)
# a list of shape classes
tetrominoes = [I_shape, J_shape, L_shape ,O_shape ,S_shape, T_shape, Z_shape]
x=3
for tetromino in tetrominoes:
    shape = tetromino(Point(x, 1))
    shape.draw(win)
    x += 4
win.mainloop()
