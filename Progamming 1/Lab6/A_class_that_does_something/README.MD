<b>A Class that Does Something</b>
For this exercise, we'll build a simple class that models a certain type of triangle. The class should have the following properties:

    It should be called Triangle

    It should have three private data members that store the side lengths, all ints.

    It should have a constructor that takes no parameters, and sets the side lengths to 3, 4 and 5.

    It should have a constructor that takes 3 ints as parameters and uses them to initialise the private members (these may not be given in any particular order).

    It should have a series of public methods, all returning a boolean:

        isIsosceles() - returns true if the triangle is an isosceles triangle (has at least two sides with the same length).

        isEquilateral() - returns true if the triangle is an equilateral triangle (all sides have the same length).

        isScalene() - returns true if  the triangle is a scalene triangle (all sides have different lengths).

        isRightTriangle() - returns true if the triangle is a right angled triangle (the triangle satisifies the Pythagorean Theorem).

This class should be constructed in Triangle.java. You are not limited to the methods listed above, and you may find it useful to add others. These will not be directly tested.

You are also provide with another class called Runner, which has a main method that you can use to do any testing of your own, but is not part of the marked tests.

For the tests in this exercise, I'm going to assume that the methods (including the constructor) exist as specified, so we can focus on functionality.