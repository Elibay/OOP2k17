package Problem2;

public class Cube extends Figures {
	private double a;
	public Cube (int x, int y) {
		super(x, y);
		a = 0;
	}
	public Cube() {
		a = 0;
	}
	public void setEdge(double a) {
		this.a = a;
	}
	public double Volume() {
		return a * a * a;
	}

	public double Area() {
		return 6 * a * a;
	}
	
}
