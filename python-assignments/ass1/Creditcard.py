
#1.Paying the Minimum:
balance=float(input("enter balance"))
annual_Interest_Rate=float(input("Enter annual_Interest_Rate"))
monthly_Payment_Rate=float(input("enter monthly payment rate"))

month=0
totalPay=0
monthly_Interest_Rate=annual_Interest_Rate / 12.0
while month <12:
    minPay = monthly_Payment_Rate * balance
    unpayBal = balance - minPay
    totalPay += minPay
    balance = unpayBal + (monthly_Interest_Rate * unpayBal)
    month += 1
    print('Month: ' + str(month))
    print('Minimum monthly payment: ' + str(round(minPay,2)))
    print('Remaining balance: ' + str(round(balance,2)))
print('Total paid: ' + str(round(totalPay,2)))
print(' Remaining balance: ' + str(round(balance,2)))


#2.Paying Debt Off In a Year:
balance=float(input("enter balance"))
annual_Interest_Rate=float(input("Enter annual_Interest_Rate"))
init_Balance = balance
monthly_Interest_Rate = annual_Interest_Rate / 12.0
month = 0
minPay = 10
def calculate(month, balance, minPay, monthly_Interest_Rate):
    while month <12:
        unpaidBalance = balance - minPay
        balance = unpaidBalance + (monthly_Interest_Rate * unpaidBalance)
        month += 1
    return balance
while calculate(month, balance, minPay, monthly_Interest_Rate) > 0:
    balance = init_Balance
    minPay +=10
    month = 0
    calculate(month, balance, minPay, monthly_Interest_Rate)
print('Lowest Payment: ' + str(minPay))


#3.Using Bisection Search to Make the Program Faster:
balance=float(input("enter balance"))
annual_Interest_Rate=float(input("Enter annual_Interest_Rate"))
init_Balance = balance
monthly_Interest_Rate = annual_Interest_Rate/12.0
low = balance/12.0
upper = (balance * ((1.0 + monthly_Interest_Rate)**12))/12.0
e = 0.01
minPay = (upper+ low)/2.0
month = 0
def calculate(month, balance, minPay, monthly_Interest_Rate):
    while month <12:
        unpaidBalance = balance - minPay
        balance = unpaidBalance + (monthly_Interest_Rate * unpaidBalance)
        month += 1
    return balance   
while abs(balance) >= e:
    balance = init_Balance
    month = 0
    balance = calculate(month, balance, minPay, monthly_Interest_Rate)
    if balance > 0:
        low = minPay
    else:
        upper = minPay
    minPay = (upper + low)/2.0
minPay = round(minPay,2)
print('Lowest Payment: ' + str(minPay))
