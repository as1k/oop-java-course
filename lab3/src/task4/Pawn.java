package task4;

class Pawn extends Piece {
	  public boolean check;
	  public Pawn(boolean check){
	    super();
	    this.check = check;
	  }
	  public boolean isLegalMove(Position a, Position b) {
	    
	    if ((b.b - a.b == 2) && a.a == b.a && check == false){
	      return true;
	    } else if (b.b - a.b == 1 && a.a == b.a){
	      return true;
	    }
	    return false;
	    
	  }
	}