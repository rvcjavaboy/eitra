def lenRecur(s): 
   if not s:
       return 0
   else:
       return 1 + length( s[1:] )


print (lenRecur(''))
print (lenRecur('wbsbtvhomitiqctem'))
print (lenRecur('kae'))
print (lenRecur('l'))
