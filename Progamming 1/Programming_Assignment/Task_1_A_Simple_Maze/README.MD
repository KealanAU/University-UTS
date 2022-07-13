<b>Task 1 - A Simple Maze</b>

Introduction

For the first part of the assignment, we will build a model of a maze in Java to later use in a game. This will consist of two classes Location and GameMap. Location will represent details of a single location in the maze, GameMap will keep track of all locations. Each of these classes is described in more detail below. The maze is a simple grid of locations, where each location may or may not have a way to get to the adjacent locations to the north, east, south or west. Some parts of what we do here will become useful in later tasks. At this point you do not have to handle the game itself, that comes later.

You start with (almost) empty versions of these two classes, plus a Runner class. The task is to fill these classes out according to the specification. The Runner class is given to facilitate your own testing, but does not form part of the assessment (but if you have bad code in it, it will stop the whole thing compiling).
Location

The Location class stores details about a particular location. How you actually store the information is up to you (though simple is generally better). The information is created and accessed through the following public methods:

    A constructor that takes five booleans as parameters. In order these represent:

        Whether the player can go north from here.

        Whether the player can go east from here.

        Whether the player can go south from here.

        Whether the player can go west from here.

        Whether the player can exit the maze from here.

    A method called isExit that takes no parameters and returns true if the Location is an exit (see also the constructor) and false if it's not.

    A method called hasDirection that takes a String representing a direction (valid options are "north", "east", "south" and "west"), and returns true if the player can go in that direction from here and false if they can't (or if it's not a valid direction).

    A method called toString that overrides the standard Object.toString() and returns a description of the current location that looks like:
        Available directions:
        north
        south

        Of course the actual directions listed depend on what directions are actually available at the Location. For those that are available, they should appear in the same order as they appear in the constructor's parameter list.

    A method called mapRepresentation that takes no parameters and returns a "drawing" of the current location using the character sets given in the supplied ACTIVE_SYMBOLS and INACTIVE_SYMBOLS arrays. The representation return should have a line heading in each available direction (where "north" is up). Whether the ACTIVE or INACTIVE symbol is used depends on the togglePlayerHere method. For example, if the player is not here (see below) and there are paths to the north and west, the String "┘" should be returned.

    A method called togglePlayerHere which takes no parameters and changes the state of whether the player is here or not. You will need to keep track of this internal in some manner, and at creation of the object, the player is not here. If the player is not here, the INACTIVE_SYMBOLS are used in mapRepresentation, if the player is here, the ACTIVE_SYMBOLS are used instead.

The Location class should have no other public methods or fields than these.
GameMap

The GameMap class stores the map as a whole, so you will need a structure to store a simple 2D grid. GameMap will have the following public methods:

    A constructor that takes an int for the "height" of the maze and an int for the "width" of the maze. These should be non-negative numbers. Any that are negative should be replaced with zero.

    A method called getHeight that takes no parameters and returns the height.

    A method called getWidth that takes no parameters and returns the width.

    A method called setLocation which takes two coordinates, row first, then column, where (0,0) is the top left and a Location object, and puts the location at those coordinates in the map. If the coordinates are out of bounds, or there's already a location at that point, it takes no action. If the action happened, the method returns true, if it took no action, it returns false.

    A method called getLocation which takes two coordinates and returns the Location at those coordinates. If the coordinates are out of bounds or there is no Location at those coordinates, the method should return null.

    A toString method that overrides Object.toString() and returns a "drawing" of the map as a String. The individual Locations in the maze should use their mapRepresentation. If there is no location at a set of coordinates, a blank space (" ") should be substituted. The following is an example of such a drawing for a 3x10 maze:
        ├┌└╴┴┌┴╴┴┌
        ╴┴┤╷└┌├┴┤─
        ┴┐┘──╵┼╶╴─

GameMap should have no other public methods or fields.
General Advice and Answers

You can use any of the library classes you wish, but the task is easily completable without any special classes or tricks. Keep things simple. Everything can be done with simple loops and if statements, however a bit of thought and careful use of some other syntactical constructs can help make things simpler.

Don't try and do all the methods in one go. Get one working before moving to the next. If you plan carefully this will not be a problem, but you may find that your initial design needs revision, and trying to refactor a large amount of half-working code is no fun at all.