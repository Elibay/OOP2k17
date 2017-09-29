package Problem5;

public class Rook extends Figures {
	public Rook (Position pos, char c, String m) {
		super (pos, c, m);
	}
	boolean canMove(int tox, int toy) {
		if (tox < 0 || toy < 0 || tox > 8 || toy > 8)
			return false;
		if (x == tox && y == toy)
			return false;
		if (!(tox == x || toy == y))
			return false;
		int dx[] = {0, 0, -1, -1};
		int dy[] = {-1, 1, 0, 0};
		for (int j = 0; j < 4; ++ j)
		{
			for (int i = 1; i <= 8; ++ i)
			{
				int X = x + i * dx[j];
				int Y = y + i * dy[j];
				if (X < 1 || Y < 1 || X > 8 || Y > 8)
					break;
				if (X == tox && Y == toy)
				{
					if (Main.u[X][Y] == null)
						return true;
					if (Main.u[X][Y].color != color)
						return true;
					return false;
				}
				if (Main.u[X][Y] != null)
					break;
			}
		}
		return false;
	}
	void move (int tox, int toy) {
		Main.u[x][y] = null;
		Main.u[tox][toy] = null;
		Rook p;
		if (color == 'w')
			p = new Rook (new Position (tox, toy), color, Main.wrook);
		else 
			p = new Rook (new Position (tox, toy), color, Main.brook);
		Main.u[tox][toy] = p;
	}
}


