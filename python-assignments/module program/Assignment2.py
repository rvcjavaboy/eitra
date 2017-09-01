import re

def checkPassword(pwd_ist):
    for p in pwd_ist:

        if (len(p) < 6 or len(p) > 12):
            break
        elif not re.search("[a-z]", p):
            break
        elif not re.search("[0-9]", p):
            break
        elif not re.search("[A-Z]", p):
            break
        elif not re.search("[$#@]", p):
            break
        else:
            print (p)
