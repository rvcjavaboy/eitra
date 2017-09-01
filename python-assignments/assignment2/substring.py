s = 'azcbobobegghakl'
maxLen=0
current=s[0]
longest=s[0]
#longest substring
for i in range(len(s) - 1):
    if s[i + 1] >= s[i]:
        current += s[i + 1]
        if len(current) > maxLen:
            maxLen = len(current)
            longest = current
    else:
        current=s[i + 1]
        
    i += 1

print ('sub string: ' + longest)
