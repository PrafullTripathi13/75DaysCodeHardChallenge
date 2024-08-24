# Que. Here is a weird problem in Susan’s terminal. He can not write more than two words each line,
# if she writes more than two, it takes only 2 words and the rest are not taken. 
# So she needs to use enter and put the rest in a new line. 
# For a given paragraph, how many lines are needed to be written in Susan’s terminal?

s=input("Enter a input : ")
n=len(s)
s1=''
for i in range(n):
    if s[i]=='-':
        s1+=''
        continue
    if s[i]=='.' or s[i]=='!' or s[i]==',' or s[i]=='?':
        s1+=' '
        continue
    else:
        s1+=s[i]
    
a=list(s1.split())
count = 0

for i in a:
    i1=0
    for j in i:
        if not ((ord(j)>=65 and ord(j)<=90) or (ord(j)>=97 and ord(j)<=122)):
            i1=1
            break
    if i1==0:
        count +=1
        
print((count - 1)//2 +1)
