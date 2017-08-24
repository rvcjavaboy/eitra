
list1 = ["Mahendra","Amrendra","Maulik","Parth","Saritha","Shreya"]
print("Here is list: ", list1)

def access_char():
     try:
          index_value = int(input("Enter index value of list: "))
          res = list1[index_value]
          print (res)
          char_value = int(input("Enter character index: "))
          for i in res[char_value]:
               print("\n\nCharacter accessed at index ",char_value," is: ", i)
     except BaseException as msg:
          print("\n\n", msg)

def concate():
     try:
          index_value = int(input("Enter index value of list: "))
          res = list1[index_value]
          print (res)
          your_String = input("\nEnter your string: ")
          con = res + " "+your_String
          print("\n\nConcated string is: ",con)
     except BaseException as msg:
          print("\n\n", msg)
          

def sub_string():
     try:
          sub_str = input("Enter substring to find: ")
          for s in list1:
               if sub_str in s:
                    print("\n\nFound string: ",s)
               else:
                    raise ValueError("Entered substring not found.")
     #print ("\n".join(s for s in list1 if sub_str in s))
     except BaseException as msg:
          print("\n\n", msg)

def replace_substr():
     try:
          index_value = int(input("Enter index value of list: "))
          res = list1[index_value]
          print (res)
          your_String = input("\nEnter your sub string : ")
          res2 = res.find(your_String)
          len_substr = len(your_String)

          new_substr = input("\nEnter your new sub string for replacement: ")
          new_string = res.replace(your_String,new_substr)
          print("\n\nSubstring replaced is: ",new_string)
     except BaseException as msg:
          print("\n\n", msg)
