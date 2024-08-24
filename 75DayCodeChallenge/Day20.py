#WAP to take number as input from the user and check the no. is automorphic or not :-

def is_automorphic(n):
   square = n * n
   while n > 0:
       last_digit_n = n % 10
       last_digit_square = square % 10
       if last_digit_n != last_digit_square:
           return False
       n //= 10
       square //= 10
   return True

number = int(input("Enter a number : "))

if is_automorphic(number):
   print(number, "is an automorphic number.")
else:
   print(number, "is not an automorphic number.")

# Output of the program :
   #Enter a number : 3
   #3 is not an automorphic number. 

   #Enter a number : 5
   #5 is an automorphic number.   
    