package task4;

class Knight extends Piece{
	  public Knight() {
	    super();
	  }
	  public boolean isLegalMove(Position a, Position b) {
	    if (((Math.abs(b.b - a.b) == 1 && Math.abs(b.a - a.a) == 2)) ||
	        (Math.abs(b.b - a.b) == 2 && Math.abs(b.a - a.a) == 1)) {
	      return true;
	      }
	    return false;
	  }
	}