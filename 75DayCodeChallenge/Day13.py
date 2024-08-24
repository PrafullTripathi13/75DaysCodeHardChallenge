# Write a program to find the missing number in an array :-

def find_number(arr, target):

    for i in range(len(arr)): #Loop through each element of the array
        if arr[i] == target: #Compare the current element with the target number

            return i #Return the index of the first occurence
        
    return -1 #Target Number Not Found


arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] #List of integers
target = int(input("Enter the targeted Number to serch in an array : ")) #Target Number to Search for 

index = find_number(arr, target)

if index == -1:
    print(f"Target number {target} not found in the array.")
else:
    print(f"Target number {target} found at index {index}")
    

# Output of the above program :-
#   Enter the targeted Number to serch in an array : 8
#   Target number 8 found at index 7
    
#   Enter the targeted Number to serch in an array : 11
#   Target number 11 not found in the array.