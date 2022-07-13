<b>A Simple Python Class</b>

For this exercise, we'll essentially repeat the previous one (as we have been doing), but in Python.

The main goals here are to recognise the differences in syntax and handling with Python's classes compared to Java's.

In the foo.py file, you start with a __main__ section so that you can add any running code you care to, without interfering with the tests. Your class should be defined above this.

Define a class called NumberBox. It should have an __init__ method that takes no parameters excepting any implicit parameters, but creates and initialises a data member called number to the value 42.

NumberBox should also have:

    An instance method called get_number that returns the value of number. This will need an implicit parameter.

    An instance method called set_number that takes an implicit parameter and a single non-implicit parameter and assigns that value to number.