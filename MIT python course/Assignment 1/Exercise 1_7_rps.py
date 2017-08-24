player1 = input("Enter player1?: ")
player2 = input("Enter player2?: ")

if(player1=='rock' and player2=='scissors'):
     print("Player1 won")
elif(player1=='rock' and player2=='paper'):
     print("Player2 won")
elif(player1=='rock' and player2=='rock'):
     print("Tie")
elif(player1=='paper' and player2=='rock'):
     print("Player1 won")
elif(player1=='paper' and player2=='scissors'):
     print("Player2 won")
elif(player1=='paper' and player2=='paper'):
     print("Tie")
elif(player1=='scissors' and player2=='paper'):
     print("Player1 won")
elif(player1=='scissors' and player2=='rock'):
     print("Player2 won")
elif(player1=='scissors' and player2=='scissors'):
     print("scissors")
else:
     print("Invalid input")



