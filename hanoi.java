public class A2Q2 {

 /**
  * A class representing a single move in the TOH solution,
  * i.e., moving the disk at the top of fromPeg to the top of toPeg
  * Note: a move is invalid if it results in a larger disk being above a smaller disk.
  *
  * DO NOT MODIFY THIS CLASS.
  */
 public static class Move {

     private final int fromPeg;
     private final int toPeg;

     public Move(int from, int to) {
         this.fromPeg = from;
         this.toPeg = to;
     }

     public String toString() {
         return String.format("%d to %d", this.fromPeg, this.toPeg);
     }
     public int getFromPeg() { return this.fromPeg; };
     public int getToPeg() { return this.toPeg; };
 }

 /**
  * Return the sequence of moves that solves the 3-peg TOH problem with n disks.
  * Assumptions:
  * - The pegs are numbered 1, 2, 3
  * - The origin peg is 1.
  * - The destination peg is 2.
  * - n > 0
  */
 public static ArrayList<Move> threePegTOH(int n) {
     ArrayList<Move> moves = new ArrayList<>();
	        moveTower(n, 1, 2, 3, moves);
	        return moves;
         }

 /**
  * Return the sequence of moves that solves the 4-peg TOH problem with n disks,
  * with the strategy described in the assignment handout
  * Assumptions:
  * - The pegs are numbered 1, 2, 3, 4
  * - The origin peg is 1.
  * - The destination peg is 2.
  * - n > 0
  */
 public static ArrayList<Move> fourPegTOH(int n) {
      ArrayList<Move> moves = new ArrayList<>();
	        if (n % 2 == 0) {
             EvenTower(n, 1, 2, 3, 4, moves);
	        } else {
             OddTower(n, 1, 2, 3, 4, moves);
	        }
	        return moves;
 }

 private static void moveTower(int n, int fromPeg, int toPeg, int auxPeg, ArrayList<Move> moves) {
	        if (n == 1) {
	            moves.add(new Move(fromPeg, toPeg));
	        } else {
	            moveTower(n - 1, fromPeg, auxPeg, toPeg, moves);
	            moves.add(new Move(fromPeg, toPeg));
	            moveTower(n - 1, auxPeg, toPeg, fromPeg, moves);
	        }
	    }

	    private static void EvenTower(int n, int fromPeg, int toPeg, int auxPeg1, int auxPeg2, ArrayList<Move> moves) {
	        if (n == 1) {
	            moves.add(new Move(fromPeg, toPeg));
	        } else {
             EvenTower(n - 2, fromPeg, auxPeg1, auxPeg2, toPeg, moves);
	            moves.add(new Move(fromPeg, auxPeg2));
	            moves.add(new Move(fromPeg, toPeg));
	            moves.add(new Move(auxPeg2, toPeg));
             EvenTower(n - 2, auxPeg1, toPeg, auxPeg2, fromPeg, moves);
	        }
	    }

	    private static void OddTower(int n, int fromPeg, int toPeg, int auxPeg1, int auxPeg2, ArrayList<Move> moves) {
	        if (n == 1) {
	            moves.add(new Move(fromPeg, toPeg));
	        } else {
             OddTower(n - 2, fromPeg, auxPeg1, auxPeg2, toPeg, moves);
	            moves.add(new Move(fromPeg, auxPeg2));
	            moves.add(new Move(fromPeg, toPeg));
	            moves.add(new Move(auxPeg2, toPeg));
             OddTower(n - 2, auxPeg1, toPeg, auxPeg2, fromPeg, moves);
	        }
	    }


 public static void main(String[] args) {

     System.out.println(threePegTOH(3));
     System.out.println(fourPegTOH(3));
 }
}
