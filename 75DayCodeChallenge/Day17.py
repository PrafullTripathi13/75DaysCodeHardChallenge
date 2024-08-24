
#WAP to removing duplicates character in a string where each character must occur exactly once in output :-

def remove_duplicates(str1):

  result = ""  # Create an empty string to store the result.

  for char in str1:  # Iterate over each character in the string.

    if char not in result:# Check if the character is already present in the result.
      
      result += char  # If not, add it to the result.

  return result  # Return the result.

str1 = input("Enter the String to remove duplicates :")
str2 = remove_duplicates(str1)
print(f"Original string: {str1}")
print(f"String after removing duplicates: {str2}")

#  Output of the above program :-

#  Enter the String to remove duplicates :aashu tripathi
#  Original string: aashu tripathi
#  String after removing duplicates: ashu trip
