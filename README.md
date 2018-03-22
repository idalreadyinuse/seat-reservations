# seat-reservations
Example TDD of a Codility test

"You are processing plane seat reservations. The plane has N rows of seats, numbered from 1 to N. There are 10 seats in each row (labelled from A to K, with the letter I omitted).

Some of the seats are already reserved. The list of reserved seats is given as a string containing seats separated by single spaces: for example “1A 3C 2B 40G 5A”. The reserved seats can be listed in any order.

Your task is to allocate seats for as many three-person families as possible. A three-person family occupies three seats that are next to each other on the same row. Seats across aisles (2C and 2D & 2G and H) are not considered to be next to each other. Obviously each available seat cannot be taken by more than one family.

Write a function that returns the maximum number of three-person families that can be seated in the remaining unreserved seats.

Aisles: ABC DEFG HJK (between C-D & G-H) - letter I omitted"

example

function / method - noOfAvailableThreeTogether(rows, taken) {}

So the number of rows and the seats taken are parameters. Seats taken is a string separated by spaces, eg "1A 2C 3H 40G" etc etc 

https://stackoverflow.com/questions/46696364/javascript-beginner-task-incorrectly-returning-the-wrong-value

