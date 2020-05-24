package task4;

class King extends Piece{
	public boolean isLegalMove(Position a, Position b) {
		if ((Math.abs(b.b - a.b) == 1 && b.a == a.a) ||
				(Math.abs(b.a - a.a) == 1 && b.b == a.b) ||
				(Math.abs(b.b - a.b) == 1 && Math.abs(b.a - a.a) == 1)) {
			return true;
			}
		return false;
		}
	}