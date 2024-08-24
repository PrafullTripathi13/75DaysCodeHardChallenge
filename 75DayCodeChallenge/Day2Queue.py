
import queue #This only available in Python3 than make sure you are using Python3.

class car :
    def __init__(self,name): #Constructor
        self.name = name
    
    def showName(self): #Fuction
        print(self.name)

#Collection of Objects 
obj1 = car("Volvo Pro")
obj2 = car("BMW Advance")
obj3 = car("Fortuner Classic")
obj4 = car("Scorpio Premium")
obj5 = car("Nexon Electric")

q = queue.LifoQueue() #Created a queue

#Pushing the above collection of objects into the created queue 
q.put(obj1)
q.put(obj2)
q.put(obj3)
q.put(obj4)
q.put(obj5)

while not q.empty(): #Looping over the queue
    obj = q.get()
    obj.showName() #Calls the Function Showname()
