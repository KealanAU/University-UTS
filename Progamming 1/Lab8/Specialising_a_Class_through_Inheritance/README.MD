<b>Specialising a Class through Inheritance</b>
Inheritance in Java (and other languages) is a way of specifying that the subclass is a specialised version of the superclass. This means that the subclass should be able to do (almost) everything the superclass does, but may do more.

For this exercise, we'll start with the superclass, and extend it to produce a subclass.

The superclass is Person, and it has a constructor, two methods and two data members:

    A String called name.

    An int called age.

    A constructor which takes a String and an int as parameters to initialise the data members.

    getName() which returns the name of the person.

    getAge() which returns the age of the person.

The task is to complete the class Student that is a subclass of Person. It should

    Override the getName() method and return "<name> (Student)" where <name> is replaced by the value of name. You will need to do this by using the super keyword to call getName() from the super class.

    Implement a method degree() which returns "Computer Science".

    Implement a constructor that takes two parameters, a String and an int and uses the constructor of the parent class to initialise the data members. Important note: your code will not compile until you successfully call the superclass constructor (you may want to see if your tutor knows why).

Some things Student shouldn't do:

    Have any data members.

Some other things to not do:

    Modify Person

The scaffold starts with the complete Person class, an empty class called Student and a Runner class to give a place for a main method.