# Towers of Hanoi Solution

## Overview

This Java program provides a solution to the Towers of Hanoi problem, both for the traditional 3-peg setup and an extended 4-peg version. The solution is implemented using recursive algorithms.

## Class Structure

The `A2Q2` class contains the following methods:

- `threePegTOH(int n)`: Returns the sequence of moves to solve the 3-peg Towers of Hanoi problem with `n` disks.
- `fourPegTOH(int n)`: Returns the sequence of moves to solve the 4-peg Towers of Hanoi problem with `n` disks, following the strategy described in the assignment handout.
- `moveTower(int n, int fromPeg, int toPeg, int auxPeg, ArrayList<Move> moves)`: Helper method for the traditional 3-peg Towers of Hanoi problem.
- `EvenTower(int n, int fromPeg, int toPeg, int auxPeg1, int auxPeg2, ArrayList<Move> moves)`: Helper method for the 4-peg Towers of Hanoi problem with even `n`.
- `OddTower(int n, int fromPeg, int toPeg, int auxPeg1, int auxPeg2, ArrayList<Move> moves)`: Helper method for the 4-peg Towers of Hanoi problem with odd `n`.
- `main(String[] args)`: Main method demonstrating usage with sample inputs.

## Installation

To use the Towers of Hanoi Solution program, follow these steps:

1. Clone the repository to your local machine.
2. Open the project in your preferred Java IDE.
3. Compile the `A2Q2.java` file.
4. Run the program.

## Usage

To use the provided methods, simply call them with the desired number of disks (`n`) as the parameter. For example:

```java
System.out.println(threePegTOH(3));
System.out.println(fourPegTOH(3));





