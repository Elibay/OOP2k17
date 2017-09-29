package Problem2;

public class Rectangle extends Figures {
	private double a, b, c;
	public Rectangle (int x, int y) {
		super(x, y);
		a = 0;
		b = 0;
		c = 0;
	}
	public Rectangle() {
		a = 0;
		b = 0;
	}
	public void setEdge(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double Volume() {
		return a * b * c;
	}

	public double Area() {
		return 2 * (a * b + b * c + a * c);
	}
}
