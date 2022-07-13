<b>Smallest Swap again, but with a LinkedList and a twist</b>

For this exercise we're going to write a LinkedList version of the "Smallest Swap" exercise from a couple of weeks ago (the solution for that is now visible, if you missed it, or want a refresher).

The task is to write a method called smallestSwap that takes a LinkedList<Integer> and an int iii as a parameter. You are guaranteed that the int will be smaller than the length of the list. The method should then find the smallest element starting at position iii onward (so it ignores position i−1i-1i−1 and before) and then swap that element with the element at position iii.

The method should be public and static and does not need to return anything (why not? If you don't understand why it doesn't, ask your tutor - this is an important concept about working with objects).

For example, if the input list was:
[1, 3, 5, 7, 2, 8, 4]

and the starting position iii was 2 (remember we start from 0), the final list should look like:
[1, 3, 2, 7, 5, 8, 4]

as 2 is the smallest value starting from the 5 onward, so it gets swapped with the 5. Nothing else moves. The 1 and the 3 aren't considered.

As usual there is a main method, but it does not form part of the testing (apart from if you mess it up and stop things from compiling!).