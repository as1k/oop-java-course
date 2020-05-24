package task4;

class Queen extends Piece{
	  public Queen() {
	    super();
	  }
	  public boolean isLegalMove(Position a, Position b) {
	    if (Math.abs(b.b - a.b) == Math.abs(b.a - a.a) || 
	        b.b == a.b || a.a == b.a) {
	      return true;
	    }
	    return false;
	  }
	}