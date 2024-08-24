# 1. Star Pattern Program to Print Right Pascal Triangle :-
def patern(a):
    for i in range(a):
        print('* '* (i+1))
    for i in range(a):
        print('* '* (a-i-1))
a = int(input("Enter a number of rows :"))#taking input
patern(a)#calling function
#________________________________________________________________________________________________________________________

# 2. Star Pattern Program to Print Pyramid or Triangle :-
def pattern(m):
    for i in range(m):
        print(" "*(m-i-1)+ "*" * (2*i+1))
m = int(input("Enter number of rows :"))#taking input
pattern(m)#calling function

#__________________________________________________________________________________________________________________________

# 3. Star Pattern Program To Print Diamond :-
def Pattern(n):
    for i in range(n):
        for j in range(n-i-1):#print upper pyramid
            print(" ", end="")
        for j in range(2*i+1):
            print("*", end="")#printing stars
        print()
    for i in range(n-1):#print lower pyramid
        for j in range(i+1):
            print(" ", end="")
        for j in range(2*(n-i-1)-1):
            print("*", end="")#printing stars
        print()
n = int(input("Enter number of rows :"))#taking input
Pattern(n)#calling function