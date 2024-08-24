# Count the number of special character in a given string :-
s = input("Enter the string full of special character : ")
count = 0 
for i in s:
    if i.isupper() == True:
        pass
    elif i.islower() != False:        #First Way 
        pass
    elif i.isdigit():
        pass
    elif i.isspace():
        pass
    else:
        count += 1
print(f"No. of special character in the given string is {count}")

#=========================================================================================================

S = input("Enter the string full of special character : ")
Count = 0
for i in S:
    if i.isalnum() == True:
        pass                          #Second Way
    elif i.isspace() == True:
        pass
    else:
        Count += 1
print(f"No. of special character in the given string is {Count}")

