from graphics import *
from wheel import *



#drawing a rectangle

new_win = GraphWin("A Car", 300, 300)
rect = Rectangle( Point( 10,10), Point(200, 100 ) )
rect.setFill( "blue" )
rect.setOutline("black")
rect.setWidth(5)
rect.draw( new_win )

new_win.mainloop()

