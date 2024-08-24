# Reverse of String :-

def reverseString(s):

    n = len(s)
    l = list(s)
    start = 0
    end = n-1

    while (start < end):
        l[start],l[end] = l[end],l[start]
        start += 1
        end -= 1

    s = "".join(l)
    return(s)

s = input("Enter a String to reverse :")
x = reverseString(s)

print(x)


#   Output of the above program :-

#   Enter a String to reverse :Prafull Tripathi
#   ihtapirT llufarP