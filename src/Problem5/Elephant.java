package Problem5;

public class Elephant extends Figures {
	public Elephant (Position pos, char c, String mean) {
		super (pos, c, mean);
	}
	boolean canMove(int tox, int toy) {
		if (tox < 0 || toy < 0 || tox > 8 || toy > 8)
			return false;
		if (x == tox && y == toy)
			return false;
		if (!(Math.abs (x - tox) == Math.abs (y - toy)))
			return false;
		int dx[] = {1, 1, -1, -1};
		int dy[] = {-1, 1, -1, 1};
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
		Elephant p;
		if (color == 'w')
			p = new Elephant (new Position (tox, toy), color, Main.welephant);
		else 
			p = new Elephant (new Position (tox, toy), color, Main.belephant);
		Main.u[tox][toy] = p;
	}

}
