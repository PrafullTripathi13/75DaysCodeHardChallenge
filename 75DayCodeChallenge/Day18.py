#  Write a program to take 2 numbers as input.
#  Find the sum of all numbers between them who belongs to Fibonaci Series.
#  If the resultant sum is even than find the product of its digits,
#  and if odd than find it is prime or not.
#  If it is prime print its reverse else print sum of its digits
def even(n):
    if n % 2 == 0:
        return True
    return False

def prime(n):
    if n <= 1:
        return False
    for i in range (2, n // 2+1):
        if n % i == 0:
            return False
    return True

def product(n):
    prod = 1
    while (n != 0):
        b = n % 10
        prod = prod*b
        n = n // 10
    return prod

def reverse(n):
    sum = 0
    while (n != 0):
        b = n % 10
        sum = sum * 10 + b
        n = n // 10
    return sum

def add(n):
    sum = 0 
    while (n != 0):
        b = n % 10
        sum = sum + b
        n = n // 10
    return sum

def checkFib(n):
    if n == 0 or n == 1:
        return True
    a = 0
    b = 1
    while(1):
        c = a + b
        if c == n:
            return True
        if c > n:
            return False
        a  = b
        b = c

def fibonaccisum(a,b):
    sum = 0
    for i in range(a, b+1):
        x = checkFib(i)
        if x == True:
            sum = sum + i
    return sum

a = int(input("Enter first integer :"))
b = int(input("Enter second integer :"))
x = fibonaccisum(a,b)
y = even(x)

if y == True:
    ans = product(x)
    print(ans)
else:
    y = prime(x)
    if y == True:
        ans = reverse(x)
        print(ans)
    else:
        ans = add(x)
        print(ans)

