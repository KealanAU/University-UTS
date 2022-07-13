<b>Setting Up an Inheritance Hierarchy</b>
To begin with, we're going to build a small inheritance hierarchy in Python.

We begin with a class Shape, which has an __init__ method that receives a numSides value to be stored in the object. It also has a print_sides method that essentially prints that value out.

The task is to complete the two classes Triangle and Rectangle so that they inherit from Shape, and correctly use super() to fill in the appropriate details (hint: a triangle has 3 sides and a rectangle has 4).

Neither Triangle nor Rectangle should have any methods other than __init__(self), nor should they have any data members, the goal here is to use inheritance to do some of the work.