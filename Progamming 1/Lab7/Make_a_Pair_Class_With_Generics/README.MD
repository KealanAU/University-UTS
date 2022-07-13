<b>Make a Pair Class with Generics</b>
This exercise is just a simple introduction to generics and type parameters. If you understood the Box example from the lessons, this will be no problem. If not, this will provide a place to develop that understanding.

The task is to create a generic class called Pair. It will have two type parameters (the names don't matter, they just have to be different, but they should start with an uppercase letter). It will have two private data members, one of the same type as the first type parameter, one of the same type as the second.

It will have a constructor that takes two parameters. The first will have the same type as the first type parameter, the second will have the same type as the second type parameter. The parameters should be used to initialise the data members.

It will have a method fst(), which returns the value of the data member with the first type, and a method snd() which returns the value of the data member with the second type.

If you are having trouble with type parameters, just think of them as variables that you will fill in later with an actual type (because that's what they are).

The scaffold has a main method in the Runner class, but this is not part of the exercise, and just there for you to be able to run something if you like.