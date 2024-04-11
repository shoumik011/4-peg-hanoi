# hanoi
This code implements solutions for the Tower of Hanoi problem with 3 pegs (threePegTOH() method) and 4 pegs (fourPegTOH() method). Let's break down the code:

Move Class:

Represents a single move in the Tower of Hanoi solution.
Contains two fields: fromPeg (the peg from which the disk is moved) and toPeg (the peg to which the disk is moved).
Provides methods to get the values of fromPeg and toPeg.

threePegTOH(int n) Method:
Takes an integer n representing the number of disks.
Implements the Tower of Hanoi solution for 3 pegs.
It uses a recursive approach (moveTower() method) to move the disks from the source peg to the destination peg via an auxiliary peg.

fourPegTOH(int n) Method:
Takes an integer n representing the number of disks.
Implements the Tower of Hanoi solution for 4 pegs.
Depending on whether n is even or odd, it calls either EvenTower() or OddTower() method to perform the movement of disks. 

Helper Methods:
moveTower(int n, int fromPeg, int toPeg, int auxPeg, ArrayList<Move> moves): Recursive method to move the tower of disks from one peg to another using an auxiliary peg. It adds the moves to the moves list.
EvenTower(int n, int fromPeg, int toPeg, int auxPeg1, int auxPeg2, ArrayList<Move> moves): Implements the tower of Hanoi solution for even number of disks in the four-peg scenario.
OddTower(int n, int fromPeg, int toPeg, int auxPeg1, int auxPeg2, ArrayList<Move> moves): Implements the tower of Hanoi solution for odd number of disks in the four-peg scenario.

main() Method:
Contains test cases to demonstrate the functionality of both threePegTOH() and fourPegTOH() methods.
Overall, the code provides solutions to the Tower of Hanoi problem for both three pegs and four pegs, implementing different strategies for the latter based on the parity of the number of disks.





