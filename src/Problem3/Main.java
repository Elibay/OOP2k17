package Problem3;

public class Main {

	public static void main(String[] args) {
		Employee em = new Employee ("Zhora", 20, 1, "16BD0001");
		Manager mg = new Manager ("Tima", 20, 1, "16BD0002");
		Person pg = new Person ("Zhora");
		if (em.equals (mg))
			System.out.println("Hello");
		if (pg.equals(em))
			System.out.println("BYe");
		if (pg.equals(mg))
			System.out.println("Legend is born");
		System.out.print("Error");
	}

}
