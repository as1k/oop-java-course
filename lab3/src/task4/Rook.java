package task4;

class Rook extends Piece {
	public Rook() {
		super();
		}
	public boolean isLegalMove(Position a, Position b) {
		if (b.b == a.b && (Math.abs(b.a - a.a) == 1 || Math.abs(b.a - a.a) == 2 ||
				Math.abs(b.a - a.a) == 3 || Math.abs(b.a - a.a) == 4 ||
				Math.abs(b.a - a.a) == 5 || Math.abs(b.a - a.a) == 6) ||
				(b.a == a.a && (Math.abs(b.b - a.b) == 1 || Math.abs(b.b - a.b) == 2 ||
				Math.abs(b.b - a.b) == 3 || Math.abs(b.b - a.b) == 4 ||
				Math.abs(b.b - a.b) == 5 || Math.abs(b.b - a.b) == 6))) {
			return true;
			}
		return false;
		}
	}