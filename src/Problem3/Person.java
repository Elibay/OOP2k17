package Problem3;

public class Person {
	public String name;
	public Person (String name) {
		this.name = name;
	}
	public Person () { 
		name = "";
	}
	public String toString() {
		return name;
	}
	public String getName () {
		return name;
	}
	public boolean equals(Person p)
	{
		if (p.name.equals (this.name))
			return true;
		return false;
	}
}
