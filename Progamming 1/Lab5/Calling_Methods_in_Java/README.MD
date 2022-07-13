<b>Calling Methods in Java</b>
Now that we've seen how to call methods in Python, let's try it with Java. It's the same basic setup, but Java appears more complicated. It's not really, it just uses a lot of space to say very similar things.

Here we have some classes (BankAccount.java and AccountManagement.java) with several methods in them, some static and some non-static, that deal with aspects of a simple bank account program. You should not modify these files, but you should definitely read them carefully.

The unfinished part of the program is in BankManager.java, this is where you will start. The program starts by creating a populated array of accounts (there will always be at least 2). The task is to use the available methods in AccountManagement and BankAccount to (in order):

    Print "The bank has $<x>." Where <x> is replaced with the total balance of all the accounts.

    Print "The richest account is <name>." Where <name> is replaced by the account name of the account with the highest balance.

    Print "The poorest account is <name>." Where <name> is replaced by the account name of the account with the lowest balance.

    Take money from the richest account and give it to the poorest account so that that they have the same balance.

    On one line each, print out "<name> has $<x>." where <name> and <x> are replaced by the account name and balance for each account, in the order they appear in in the array.

To both assist with the testing and to introduce you to some new things (that you don't have to worry about yet if you don't want to), the input data will be read from a file, so if you want to modify the input, it's in AccountData.txt (different files will be used for the tests, so you can't mess anything up).

As an example, if you use the data in AccountData.txt without modifying it, your output should be:
The bank has $146.5.
The richest account is Cat.
The poorest account is Luke.
Luke has $34.59.
Cat has $34.59.
Nick has $35.32.
Mustafa has $42.0.

Note that we're not dealing with trying to make currency print out properly.