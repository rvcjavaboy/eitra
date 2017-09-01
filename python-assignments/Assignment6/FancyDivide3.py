'''
       Title:FancyDivide3

'''
def FancyDivide3(numbers, index):
    try:
        try:
            denom = numbers[index]
            for i in range(len(numbers)-1):
                numbers[i] /= denom
        except IndexError:
            FancyDivide3(numbers, len(numbers))
        else:
            print("1")
        finally:
            print("0")
    except ZeroDivisionError:
        print("−2")

print(FancyDivide3([0, 2, 4], 1))
print(FancyDivide3([0, 2, 4], 4))
print(FancyDivide3([0, 2, 4], 0))
