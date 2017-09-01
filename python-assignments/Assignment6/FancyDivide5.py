'''

    Title:FancyDivide5

'''
def FancyDivide5(list_of_numbers, index):
    try:
        try:
            denom = list_of_numbers[index]
            for i in range(len(list_of_numbers)):
                list_of_numbers[i] /= denom
        finally:
            raise Exception("0")
    except Exception as e:
        print(e)
        
print(FancyDivide5([0, 2, 4], 0))
