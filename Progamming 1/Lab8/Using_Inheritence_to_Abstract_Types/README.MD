<b>Using Inheritance to Abstract Types</b>

Inheritance not only passes on methods and data, it passes on type information. In the previous exercise, when we say "Student is a Person", this also means that objects of the type Student also have type Person (but not every Person is necessarily a student). Alongside dynamic dispatch, this allows us (when applicable) to use the more general type to help abstract and simplify code.

For this exercise, we're going to expand our Person hierarchy a little, and exploit the abstraction to allow us to treat different subtypes of Person uniformly.

We start with a simpler Person class, and three subclasses: Student, Academic and CodeMonkey. Each of these classes overrides the toString() method from its parent (Person overrides that of Object. Student, Academic and CodeMonkey override that of Person. It's worth looking at these to see how they function).

We also have a Runner class, where all the action will take place.

The task is to write a method to read in information about people, and collect this in a List. The exercise here is in choosing the correct types so that everything can be collected in a single List, but no information is lost.

In the main method of Runner, this input method is called, and there's a for loop to complete that just iterates over the list and prints out each person on a separate line.

An example input is given below, with each of the possible prompts, the input has been underlined to try and separate it from the ouput:

    How many people are there? 3
    What type of person is it?
    1. Student
    2. Academic
    3. Code Monkey
    Enter a choice: 1
    What is the person's name? Alice
    What degree are they studying? Computer Science
    What year are they in? 2
    What type of person is it?
    1. Student
    2. Academic
    3. Code Monkey
    Enter a choice: 2
    What is the person's name? Bob
    What subject do they teach? Programming
    What type of person is it?
    1. Student
    2. Academic
    3. Code Monkey
    Enter a choice: 3
    What is the person's name? Eve
    What programming language do they like? Scala
    Hi, I'm Alice. I am studying Computer Science. I am in my 2nd year.
    Hi, I'm Bob. I teach Programming.
    Hi, I'm Eve. I like to program in Scala.