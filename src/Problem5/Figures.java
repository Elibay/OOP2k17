package Problem5;

abstract public class Figures {
	public int x, y;
	char color;
	String mean;
	public Figures (Position pos, char c, String mean) {
		x = pos.x;
		y = pos.y;
		color = c;
		this.mean = mean;
	}
	public Figures () {
		x = 0;
		y = 0;
	}
	abstract boolean canMove (int tox, int toy);
	abstract void move(int tox, int toy);
}
