'''

    Title:FancyDivide2

'''

def FancyDivide2(numbers, index):
    try:
        denom = numbers[index]
        for i in range(len(numbers)):
            numbers[i] /= denom
    except IndexError:
        FancyDivide2(numbers, len(numbers)-1)
    except ZeroDivisionError as e:
        print("−2")
    else:
        print("1")
    finally:
        print("0")

print(FancyDivide2([0, 2, 4], 1))
print(FancyDivide2([0, 2, 4], 4))
print(FancyDivide2([0, 2, 4], 0))
