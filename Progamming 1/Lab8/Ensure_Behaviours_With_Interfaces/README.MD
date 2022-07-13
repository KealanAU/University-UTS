<b>Ensuring Behaviour With Interfaces</b>

Interfaces are the other inheritance mechanism in Java, and unlike normal inheritance, a class can implement many interfaces.

This is because the basic idea of an interface is to ensure the existence of methods with a given signature, but without given an implementation. As features have been added to Java, the ability to have default implementations in interfaces has been added, which muddies the waters a bit, but we can ignore default implementations for the moment.

One important difference between implementing an interface and extending a superclass is that interfaces cannot have data members. This reinforces the idea that interfaces are intended to propagate behaviour, rather than state.

One similarity between the two inheritance approaches though is that interfaces provide a type to the implementing class. We have seen this already with List, LinkedList and ArrayList. The two concrete classes both implement the List interface.

In this exercise, we're going to use interfaces to achieve something similar to the last exercise, but in a different way. This may also highlight the difference between the types of inheritance that normal inheritance and interfaces provide.

The scaffold contains 2 interfaces: Graduate and Employee; and 3 classes: Academic, Banker and FreelanceJournalist.

The task is to correctly implement the right interfaces for each class.

    An Academic is both a Graduate and an Employee

    A FreelanceJournalist is a Graduate

    A Banker is just an Employee.

To do this you will have to change the signatures of the classes, and implement the methods specified by the interface. As the interface doesn't say anything about how to implement the methods, that part is your choice.

There is also a Runner class to test things out, as usual.