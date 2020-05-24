package task4;

class Bishop extends Piece{
	public Bishop() {
		super();
		}
	public boolean isLegalMove(Position a, Position b) {
		if (Math.abs(b.b - a.b) == Math.abs(b.a - a.a)) {
			return true;
			}
		return false;
		}
	}