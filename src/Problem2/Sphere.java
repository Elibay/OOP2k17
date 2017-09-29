package Problem2;

public class Sphere extends Figures {
	private double r;
	public Sphere (int x, int y) {
		super(x, y);
		r = 0;
	}
	public Sphere () {
		r = 0;
	}
	public void setRadius(double r) {
		this.r = r;
	}
	public double Volume() {
		return 4.0 / 3.0 * Math.PI * r * r * r;
	}
	public double Area() {
		return 4.0 * Math.PI * r * r;
	}
}
