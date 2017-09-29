package Problem2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube cube = new Cube (2, 3);
		cube.setEdge(10);
		Rectangle r = new Rectangle (2, 3);
		r.setEdge(4, 3, 5);
		System.out.println(cube.Area() + " " + cube.GetCordinates());
		System.out.print(r.Area() + " " + r.Volume());
	}

}
