'''

    Title:FancyDivide4

'''
def FancyDivide4(list_of_numbers, index):
    try:
        try:
            raise Exception("0")
        finally:
                denom = list_of_numbers[index]
                for i in range(len(list_of_numbers)):
                    list_of_numbers[i] /= denom
    except Exception as e:
        print(e)

print(FancyDivide4([0, 2, 4], 0))
