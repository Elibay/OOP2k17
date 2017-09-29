package Problem5;

public class Queen extends Figures {
	public Queen (Position pos, char c, String mean) {
		super (pos, c, mean);
	}
	boolean canMove(int tox, int toy) {
		Rook r = new Rook (new Position (x, y), color, "r");
		Elephant e = new Elephant (new Position (x, y), color, "e");
		if (e.canMove(tox, toy))
			return true;
		if (r.canMove(tox, toy))
			return true;
		return false;
	}
	void move (int tox, int toy) {
		Main.u[x][y] = null;
		Main.u[tox][toy] = null;
		Queen p;
		if (color == 'w')
			p = new Queen (new Position (tox, toy), color, Main.wqueen);
		else 
			p = new Queen (new Position (tox, toy), color, Main.bqueen);
		Main.u[tox][toy] = p;
	}

}