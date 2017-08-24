# Harshita Lachhwani
# 11th August 2017


stones=20

def play_nims(stones_left):
    count=1
    while stones_left>0:
        #if stones_left<10:
            #print("Stones left in the pile:",stones_left)
        if count%2!=0:
            ch=input("Player 1:")
        else:
            ch=input("Player 2:")
        if ch in range(1,6):
            if ch<=stones_left:
                stones_left-=ch
                count+=1
            else:
                print("Oops! There are only",stones_left,"stones left in the pile")
                print("Please enter again.")
                
        if stones_left==0:
            print("\n\nGame Over!!")
            if count%2==0:
                print("Player 2 wins!")
            else:
                print("Player 1 wins!")


print("Welcome to the Game of Nims",end='\n\n')
print("It's a two player game")
print("The players have to take out stones ranging from 1 to 5")
print("The player who takes out the last stone(s), wins!",end='\n\n')
print("Ready? Go!\n")
play_nims(20)











'''
    while [pile is not empty]:
while [player 1’s answer is not valid]:
[ask player 1]
[execute player 1’s move]

[same as above for player 2]
'''
