from graphics import *




class Block(Rectangle):
    def __init__(self,p,clr):
        self.p1=Point(p.x*30,p.y*30)
        self.p2=Point(self.p1.x+30,self.p1.y+30)
        self.p=Rectangle(self.p1,self.p2)
        self.p.setFill(clr)
        self.p.setOutline("black")
        self.p.setWidth(2)
    def draw(self,win):
        self.p.draw(win)


'''
win = GraphWin("Tetrominoes", 150, 150)
# the block is drawn at position (1, 1) on the board
block = Block(Point(1, 1),"red")

# the __init__ method for your block should deal with converting the Point into pixels block.
block.draw(win)
win.mainloop()'''



