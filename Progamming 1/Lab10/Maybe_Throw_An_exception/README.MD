<b>Maybe Throw an Exception</b>
We've seen handling exception, and very briefly, creating them.

For this (simple exercise), we're going to cause an exception, and pass it up to the calling method to deal with.

In the class ExceptionThrower, there is a method thrower. You also have a custom exception called ProgOneException. The task is to make thrower generate a ProgOneException and pass it on (i.e. you don't want a try-catch).