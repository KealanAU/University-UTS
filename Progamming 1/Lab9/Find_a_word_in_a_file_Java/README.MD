<b>Find a word in a file (Java)</b>

For this exercise, we're going to do the same thing, but in Java.

The task is to complete the method contains(String, String) which takes a file name as a parameter and test word, and returns true if the file contains that word (as a whole word on its own line, it will not be hidden in another string).

As with the first exercise, the scaffold starts with a partially completed program and an example file.

As it was only previously mentioned briefly, an important thing to remember is that given two Strings (and indeed any objects), the == operator compares the reference values of the variables (i.e. what location in memory the two objects are stored at). This will tell you if the two variables are pointing at exactly the same object, which is often not what we want. We usually want to know if the two objects have the same contents (e.g. both Strings contain the text "Hi", even if they're stored in different places). To do this sort of comparison, we use the equals method: string1.equals(string2).