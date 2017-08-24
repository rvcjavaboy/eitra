letter = "a"

# converts a letter to ascii code
ascii_code = ord(letter)
# converts ascii code to a letter
letter_res = chr(ascii_code)


encoded_phrase = ""
phrase = input("Type the phrase you'd like to see encoded.  ")
shift = int(input("Type the shift value.    "))
                   
for c in phrase:
    if c in "ABCDEFGHIJKLMNOPQRSTUVWXYZ":
        c = ((ord(c)-65 + shift)%26)
        c = chr(c%26+65)
    elif c in "abcdefghijklmnopqrstuvwxyz":
        c = ((ord(c)-97 + shift)%26)
        c = chr(c%26+97)
    encoded_phrase = encoded_phrase + c
print (encoded_phrase)
