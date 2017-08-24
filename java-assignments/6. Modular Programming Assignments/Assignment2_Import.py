import Assignment2

password = input("Enter your password: ")
password = (s for s in password.split(','))
Assignment2.checkPassword(password)
