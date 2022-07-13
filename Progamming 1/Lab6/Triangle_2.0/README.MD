<b>Triangle 2.0</b>
This is the assessment task for this lab. It is due by 9:00AM on 12/4/2021

For the assessment task, we'll take some of the training wheels off. The tests for this task will not check what's happening inside the class you create, so it's up to you as to what data members you use. The tests will also assume you can write methods and constructors correctly. This means that you have to get the names, returns and parameters correct before the tests will even run.

Okay, now the task itself.

Your company is doing some consulting work and the client has asked for a new, more exciting version of their existing Triangle. They want a Triangle, but with an extra side, which they're calling Triangle 2.0.

To meet the specification you need to create a class called Rectangle with the following methods:

    A no-parameter constructor that sets all side lengths to 1.

    A one parameter constructor that takes an int, and sets all side lengths to that value.

    A two parameter constructor, that takes two ints, and sets two opposite sides to one length, and the other pair of opposite sides to the other length.

    A method getShortSide that takes no parameters and returns the length of the shortest side as an int.

    A method getLongSide that takes no parameters and returns the length of the longest side as an int.

    A method isSquare that takes no parameters and returns true if the rectangle is a square, and false otherwise.

    A method area that takes no parameters and returns the area of the rectangle as an int.

    A method diagonal that takes no parameters and returns the length of the diagonals as a double. The library function Math.sqrt(double) may be useful here.

    A method bigger that takes a Rectangle as a parameter and returns true if the current Rectangle has an area strictly greater than the area of one given in the parameter.

You don't have to worry about not-right-angled quadrilaterals (so there's only squares and rectangles, no parallelograms, rhombi, trapezoids etc.).

You also start with nothing in the scaffold. You will have to create a suitable file for the class. The run button will assume that Rectangle has a main method, but it's not part of the tests, so you don't write it if you don't care about it.