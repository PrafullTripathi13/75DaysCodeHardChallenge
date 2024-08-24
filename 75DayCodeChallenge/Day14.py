# Program to Sum of Prime no. between two inputed no. :-

a = int(input("Enter the First no. : "))
b = int(input("Enter the Second no. : "))
sum = 0

for n in range (a, b+1):
    if (n <= 1):
        pass
    else:
        flag = 0
    for i in range (2, n // 2+1):
        if (n % i == 0):
            flag = 1
            break
        if(flag == 0):
            sum = sum + n
print(sum)