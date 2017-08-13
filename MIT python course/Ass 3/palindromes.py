'''
	Author: Ranjit Chavan
	Date:	08 Aug 2017
'''

def is_palindrome(word):
    word = word.lower()
    for i in range((len(word)+1)/2):
        if word[i] != word[len(word) - 1 - i]:
            return False
    return True

print (is_palindrome("yummy"))
print (is_palindrome("able was i ere i saw elba"))
