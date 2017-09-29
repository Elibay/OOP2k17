
public class Cat extends Animal {
	String sound;
	public Cat(String name, String sound) {
		super(name);
		this.sound = sound;
	}
	public Cat()
	{
		super();
		sound = "";
	}
	public String toString()
	{
		return super.toString() + " " + sound;
	}
}
