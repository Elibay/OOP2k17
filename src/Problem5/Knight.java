package Problem5;

public class Knight extends Figures {
	public Knight (Position pos, char c, String mean) {
		super (pos, c, mean);
	}
	
	boolean canMove(int tox, int toy) {
		if (tox < 0 || toy < 0 || tox > 8 || toy > 8)
			return false;
		
		int dx[] = {-2, -2, -1,  1, 2, 2, 1, -1};
		int dy[] = {-1,  1,  2,  2, 1, -1, -2, -2};
		for (int i = 0; i < 9; ++ i) {
			int X = x + dx[i];
			int Y = y + dy[i];
			if (tox == X && toy == Y)
			{
				if (Main.u[tox][toy] == null || Main.u[tox][toy].color != color)
					return true;
				return false;
			}
		}
		return false;
	}
	void move (int tox, int toy) {
		Main.u[x][y] = null;
		Main.u[tox][toy] = null;
		Knight p;
		if (color == 'w')
			p = new Knight (new Position (tox, toy), color, Main.wknight);
		else 
			p = new Knight (new Position (tox, toy), color, Main.bknight);
		Main.u[tox][toy] = p;
	}

}