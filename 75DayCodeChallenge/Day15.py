
# Program to count and print the sum of numbers between two given inputed numbers :-

def _count_and_sum(num1, num2):
    count = 0
    sum_ = 0

    if num1 < num2: #Determine the smaller and larger numbers to establish the range 
        smaller = num1
        larger = num2
    else:
        smaller = num2
        larger = num1
    
    counter = smaller + 1 #Iterate through the numbers between smaller and larger 
    while counter < larger:
        count += 1
        sum_ += counter
        counter += 1 #Manually increment the counter

    print(f"Count of numbers between {num1} and {num2} is : {count}")
    print(f"Sum of numbers between {num1} and {num2} is : {sum_} ")
_count_and_sum(1, 10)

# Output of the above program :-

# Count of numbers between 1 and 10 is : 8
# Sum of numbers between 1 and 10 is : 44 