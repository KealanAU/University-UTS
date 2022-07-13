<b>Selection Sort</b>
This is the assessment task for this lab. It is due by 9:00AM  on 18/4/2021

For this assessment task, you will encounter your first sorting algorithm (as far as this subject is concerned anyway). We will be implementing Selection Sort. This is a well known sorting algorithm, it is not a particularly efficient one, but it is very simple to implement. If you look at the linked Wikipedia page, you will see that it's essentially two loops. You may also notice that you've almost implemented this already - if you have completed the exercises up to now, you've already written the inner loop (or something close enough to it to work). The next slide also gives a visualisation tool to show you how elements are swapped step by step.

Selection sort works by keeping the initial part of the array/list sorted (beginning with nothing sorted), and looking in the unsorted remainder of the array/list for the smallest available element, which will be put on the end of the sorted section (the sorted section grows by one element and the unsorted section shrinks by one element). When there's nothing left in the unsorted section, the algorithm has sorted the array/list.

The task is to write a method called selectionSort in the class Sort. The method should take a List<Integer> as its only parameter, return void, and be public and static. After the method has finished, the list should be sorted.

If you know another sorting algorithm, you can implement that, but you are not allowed to used any of the sorting algorithms in the Java libraries.

The tests for this will assume that you can get the method signature correct, so will jump straight to testing the functionality.

The Sort class has a main method for your use.

A demonstration:
https://www.youtube.com/watch?v=ZgiVA4pqju8