# dice-roll-ave-for-number

My solution for Chapter 4 Exercise 3 AND Chapter 4 Exercise 4 of “Introduction to Programming Using Java”.


Problem Description for 4.3:
Write a function that simulates rolling a pair of dice until the total on the dice comes up
to be a given number. The number that you are rolling for is a parameter to the function.
The number of times you have to roll the dice is the return value of the function. The
parameter should be one of the possible totals: 2, 3, . . . , 12. The function should throw
an IllegalArgumentException if this is not the case. Use your function in a program that
computes and prints the number of rolls it takes to get snake eyes. (Snake eyes means
that the total showing on the dice is 2.)

Problem Description for 4.5:
This exercise builds on Exercise 4.3. Every time you roll the dice repeatedly, trying to
get a given total, the number of rolls it takes can be different. The question naturally
arises, what’s the average number of rolls to get a given total? Write a function that
performs the experiment of rolling to get a given total 10000 times. The desired total is
a parameter to the subroutine. The average number of rolls is the return value. Each
individual experiment should be done by calling the function you wrote for Exercise 4.3.
Now, write a main program that will call your function once for each of the possible totals
(2, 3, ..., 12). It should make a table of the results, something like:
Total On Dice Average Number of Rolls
------------- -----------------------
2 35.8382
3 18.0607
. .
. .


Notes: TextIO is an IO helper class created by the textbook's author to assist with IO before the book covers java's IO utilities.
