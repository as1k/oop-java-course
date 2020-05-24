package task4;

public class Problem {
	  public static void main(String[] args) {
	    Position a = new Position(4, 'd');
	    Position b = new Position(2, 'f');
	    Pawn pawn = new Pawn(true);
	    if (pawn.isLegalMove(a, b)) {
	      System.out.println("Pawn: it is legal move!");
	    } else {
	      System.out.println("Pawn: it is illegal move!");
	    }
	    Knight k = new Knight();
	    if (k.isLegalMove(a, b)) {
	      System.out.println("Knight: it is legal move!");
	    } else {
	      System.out.println("Knight: it is illegal move!");
	    }
	    Rook r = new Rook();
	    if (r.isLegalMove(a, b)) {
	      System.out.println("Rook: it is legal move!");
	    } else {
	      System.out.println("Rook: it is illegal move!");
	    }
	    Bishop bi = new Bishop();
	    if (bi.isLegalMove(a, b)) {
	      System.out.println("Bishop: it is legal move!");
	    } else {
	      System.out.println("Bishop: it is illegal move!");
	    }
	    Queen q = new Queen();
	    if (q.isLegalMove(a, b)) {
	      System.out.println("Queen: it is legal move!");
	    } else {
	      System.out.println("Queen: it is illegal move!");
	    }
	    King king = new King();
	    if (king.isLegalMove(a, b)) {
	      System.out.println("King: it is legal move!");
	    } else {
	      System.out.println("King: it is illegal move!");
	    }
	  }
	  
	}