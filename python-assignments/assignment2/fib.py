import time
startNumber = int(input("Enter the start number here "))
endNumber = int(input("Enter the end number here "))
start_time = time.time()
def fib(n):
    if n < 2:
        return n
    return fib(n-2) + fib(n-1)

print(fib, range(startNumber, endNumber))
print("--- %s seconds ---" % (time.time() - start_time))
