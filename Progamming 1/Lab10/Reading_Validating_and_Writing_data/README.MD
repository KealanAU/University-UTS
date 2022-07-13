<b>Reading, Validating and Writing Data</b>

Now we will combine what we've learnt about I/O into something approximating a real use-case.

The scaffold contains a class Processor with a method mapData(String inputFilename, String outputFilename, Function<Integer, O> map).  The input file specified by the String inputFilename contains a sequence of integers, one per line. The method should read each integer in (making sure to turn it into an int, apply the apply(Integer) method given by the parameter map (an example Function will be given, but the tests may use others, so don't hardcode it), and write the result out to the file specified by outputFilename. The catch is that the input file may have mistakes in it! You should catch the generated exceptions (the type of the exception will depend on how your have decided to read in the data), then continue processing, skipping the bad input.

You may wish to write out the steps to follow on a piece of paper before attempting to code this one, as there's several things going on at once.