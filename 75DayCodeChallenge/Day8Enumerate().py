#This program is all about Enumerate function and 

tup = ["Priority", "Respect", "Care", "Love"]

#printing the tuples in the object directly
for items in enumerate(tup):
    print(items)

#Changing index and printing seperate
for count, items in enumerate(tup, 100):
    print(count, items)

#getting desired output from tuple
for count, items in enumerate(tup):
    print(count)
    print(items)