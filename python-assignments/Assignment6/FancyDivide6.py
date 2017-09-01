'''

    Title:FancyDivide6

'''
def FancyDivide6(list_of_numbers, index):
    denom = list_of_numbers[index]
    return [SimpleDivide(item, denom)
            for item in list_of_numbers]


def SimpleDivide(item, denom):
    try:
        return item / denom
    except:
        return 0
    
print(FancyDivide6([0, 2, 4], 0))
