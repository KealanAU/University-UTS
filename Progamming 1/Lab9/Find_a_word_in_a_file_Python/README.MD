<b>Find a word in a file (Python)</b>

For this exercise, we're going to do the simplest string matching task, finding a string in a list of strings. In this case, the strings are stored in a file.

The task is to complete the method contains(str, str) which takes a file name as a parameter and test word, and returns true if the file contains that word (as a whole word on its own line, it will not be hidden in another string).

As with the previous exercise, the scaffold starts with a partially completed program and an example file.

You may find the strip() method on str useful (e.g. "test ".strip() results in "test" without the whitespace).