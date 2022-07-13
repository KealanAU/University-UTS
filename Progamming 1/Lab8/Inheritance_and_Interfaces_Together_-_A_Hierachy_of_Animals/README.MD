<b>Inheritance and Interfaces Together - A Hierarchy of Animals</b>

Now we're going to combine the two types of inheritance to produce an inheritance structure that hopefully captures some of the key elements of what we use inheritance for.

The scaffold contains several classes:

    Animal - this will be our parent class for inheritance, and declares the eat method.

    Cat

    Wolf

    Centipede

    SeaAnemone

    WalkingPalm

We also have three interfaces:

    Mobile which has the move method.

    Noisy which has the makeNoise method.

    Pet which has the patThePet method.

The task is to correctly implement the inheritance relationships, and (unlike the previous exercise) implement the behaviour correctly.

    All the animals should inherit from Animal, the WalkingPalm shouldn't.

    The Cat is Noisy, Mobile and a Pet.

    The Wolf is Noisy and Mobile.

    The Centipede is Mobile.

    The SeaAnemone doesn't do anything.

    The WalkingPalm is Mobile.

Note that extends always comes before implements, if you have both.

This means they should have the following behaviours:

    Cat.makeNoise() should return "The cat says meow.".

    Cat.move() should return "The cat slinks along.".

    Cat.eat() should override the Animal.eat() method and return "The cat eats fish.".

    Cat.patThePet() should return "The cat purrs.".

    Wolf.makeNoise() should return "The wolf howls.".

    Wolf.move() should return "The wolf lopes.".

    Wolf.eat() should override the Animal.eat() method and return "The wolf eats meat.".

    SeaAnemone.eat() should override the Animal.eat() method and return "The anemone eats krill.".

    Centipede.move() should return "The centipede skitters."

    Centipede should not override the eat() method.

    WalkingPalm.move() should return "The tree walks? Is this a joke?".