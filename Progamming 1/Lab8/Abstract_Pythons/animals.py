# need to import something
from abc import ABC, abstractmethod

class Animal(ABC):  # this should inherit from something
    # pass  # replace this with an abstract method
    
    @abstractmethod
    def noise(self):
        print(self)


# now set up the three classes, remembering
# to inherit from Animal

class Cat(Animal):
    def noise(self):
        return "meow"

class Dog(Animal):
    def noise(self):
        return "woof"

class Frog(Animal):
    def noise(self):
        return "ribbit"

if __name__ == "__main__":
    # a main section for your own testing
    pass
