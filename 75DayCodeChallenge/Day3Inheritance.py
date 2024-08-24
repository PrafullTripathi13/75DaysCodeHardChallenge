
#The Below Program is about inheritance applied in python3

class Animal:
    def __init__(self, species):
        self.species = species

class Dog(Animal):
    def __init__(self, name, age):
        super().__init__("Dog")
        self.name = name
        self.age = age
            
    def bark(self):
        print(f"(self.name) says woof!")