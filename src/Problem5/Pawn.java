package Problem5;

public class Pawn extends Figures {
	public Pawn (Position pos, char c, String m) {
		super (pos, c, m);
	}

	boolean canMove(int tox, int toy) {
		if (tox < 0 || toy < 0 || tox > 8 || toy > 8)
			return false;
		int dir;
		if (color == 'w')
			dir = 1;
		else
			dir = -1;
		if (x == tox && y == toy)
			return false;
		if (tox - x == dir && y == toy && Main.u[tox][toy] == null)
			return true;
		if (Main.u[tox][toy] == null)
			return false;
		if (tox - x == dir && y == toy + 1 && Main.u[tox][toy].color != color)
			return true;
		if (tox - x == dir && y == toy - 1 && Main.u[tox][toy].color != color)
			return true;
		return false;
	}
	void move (int tox, int toy) {
		Main.u[x][y] = null;
		Main.u[tox][toy] = null;
		
		Pawn p;
		if (color == 'w')
			p = new Pawn (new Position (tox, toy), color, Main.wpawn);
		else 
			p = new Pawn (new Position (tox, toy), color, Main.bpawn);
		Main.u[tox][toy] = p;
	}
	
}
