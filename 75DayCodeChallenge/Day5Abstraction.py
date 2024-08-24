#The Below Program is about Encapsulation applied in python3
from abc import ABC, abstractmethod

class Shape(ABC):
    @abstractmethod
    def area(self):
        pass

class Rectangle(Shape):
    def __init__(self, length, width):
        self.length = length
        self.width = width

    def area(self):
        return self.length * self.width

class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius

    def area(self):
        return 3.14159 * self.radius * self.radius

shapes = [Rectangle(5, 4), Circle(3)]

for shape in shapes:
    print(shape.area())  # Output: 20 28.274333882308138
