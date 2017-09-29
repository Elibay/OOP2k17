package Problem2;

abstract public class Figures {
	public double x, y;
	public Figures() {
		x = 0;
		y = 0;
	}
	public Figures (double x, double y) {
		this.x = x;
		this.y = y;
	}
	abstract public double Volume ();
	abstract public double Area();
	public String GetCordinates() {
		return x + " " + y;
	}
}
