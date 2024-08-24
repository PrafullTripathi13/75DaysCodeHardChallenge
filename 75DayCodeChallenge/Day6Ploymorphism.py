#The Below Program is about Encapsulation applied in python3

class Animal:
    def make_sound(self):
        #Raising Custom Error:-
        raise NotImplementedError("Subclass must implement this method")

class Dog(Animal):
    def make_sound(self):
        print("Woof!")

class Cat(Animal):
    def make_sound(self):
        print("Meow!")

def make_animal_sound(animal):
    animal.make_sound()

animals = [Dog(), Cat()]
for animal in animals:
    make_animal_sound(animal)

# Output of the program :-
#  Woof!
#  Meow!