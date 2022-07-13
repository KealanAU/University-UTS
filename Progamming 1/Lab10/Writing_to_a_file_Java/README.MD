<b>Writing to a File (Java)</b>

Last week we looked at input, so now it's time to go the other way!

Output works largely the same as input (in terms of how the I/O libraries work), just with different classes. If you don't remember which one is the "easiest", you may want to take a quick look back at the Basic I/O lesson.

The task here is to complete the method inToFile(String), which will read user input (as Strings) from the command line. When the user writes done (by itself on a line), the input is finished. Each line of input should be written to the file given by the String parameter to the method. You should not write done to the file.