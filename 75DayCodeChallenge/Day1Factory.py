class CarFactory(object):
    def make(type):
        if type == "RaceCar":
            return RaceCar()
        elif type == "Van":
            return Van()
        elif type == "Bus":
            return Bus()
    
    make = staticmethod(make)
class Bus:
    wheels = 4
    top_speed = 140

class Van:
    wheels = 4
    top_speed = 180

class RaceCar:
    wheels = 4
    top_speed = 300

obj1= CarFactory.make("Bus")
obj2= CarFactory.make("Van")
obj3= CarFactory.make("RaceCar")

print(obj1.top_speed)
print(obj2.top_speed)
print(obj3.top_speed)