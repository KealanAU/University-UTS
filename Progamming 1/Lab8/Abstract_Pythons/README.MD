<b>Abstract Pythons</b>

Unlike Java, Python does not have an idea of an interface, but it does have some idea of abstract methods, abstract classes and multiple inheritance.

In this exercise, we're going to set up an abstract class Animal, which has an abstract noise(self) method that when implemented returns a string representing the noise the animal makes.

Then we will create 3 animals that all inherit from Animal, and thus have to implement their own noise(self):

    Cats "meow" ,

    Dogs "woof" , and

    Frogs "ribbit".

(i.e. the three classes are Cat, Dog and Frog, and their noise(self) method should return "meow", "woof" and "ribbit" respectively).

Note that the point here is to familiarise ourselves with the syntax and set-up of abstract classes in Python. You can make this work in simpler ways without the abstract part, but it's handy to know it exists.