package Problem5;

public class Position {
	public int x;
	public int y;
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Position (int x, char y) {
		this.y = y - 'a' + 1;
		this.x = x;
	}
	public Position (String s) {
		this.y = s.charAt(0) - 'a' + 1;
		this.x = s.charAt(1) - '0';
	}
}
