from graphics import *


def main():
    win = GraphWin("My Circle", 200, 200)
    #win.setBackground('red')
    c = Circle(Point(50,50), 10)
    c.draw(win)
   # c.setFill('grey')
    win.getMouse() # pause for click in window win.close()
    #win.plot(10,10)
    #win.plotPixel(20,20,"black")


    l=Line(20,30)
    l.draw(win)
    l.setArrow('first')


main()