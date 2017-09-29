package Problem5;

public class King extends Figures {
	public King (Position pos, char c, String m) {
		super (pos, c, m);
	}
	
	boolean canMove(int tox, int toy) {
		if (tox < 0 || toy < 0 || tox > 8 || toy > 8)
			return false;
		if (!(Math.abs (tox - x) <= 1 && Math.abs (toy - y) <= 1))
			return false;
		if (tox == x && toy == y)
			return false;
		
		boolean[][] canGoThere = new boolean[10][10];
		for (int i = 1; i <= 8; ++ i)
		{
			for (int j = 1; j <= 8; ++ j)
			{
				if (Main.u[i][j] == null)
					continue;
				for (int k = 1; k <= 8; ++ k)
				{
					for (int q = 1; q <= 8; ++ q)
					{
						if (Main.u[i][j].color != color && Main.u[i][j].canMove(k, q))
						{
							canGoThere[k][q] = true;
						}
					}
				}
			}
		}
		if (canGoThere[tox][toy] == true)
			return false;
		if (Main.u[tox][toy] == null || Main.u[tox][toy].color != color)
			return true;
		return false;
	}
	void move (int tox, int toy) {
		Main.u[x][y] = null;
		Main.u[tox][toy] = null;
		King p;
		if (color == 'w')
			p = new King (new Position (tox, toy), color, Main.wking);
		else 
			p = new King (new Position (tox, toy), color, Main.wking);
		Main.u[tox][toy] = p;
	}
	
}
