package Problem3;

import java.util.Vector;

public class Manager extends Employee {
	private Vector < Employee > Employes;
	public boolean canGetBonus () {
		return (Employes.size() >= 4);
	}
	public Manager (String name, double salary, int year, String insuranceNumber) {
		super (name, salary, year, insuranceNumber);
	}
	public void addEmployees (Employee employee) {
		Employes.add(employee);
	}
	public Manager () {
		super();
	}
	public String toString() {
		return super.toString();
	}
	public boolean equals (Manager mg)
	{
		if (super.equals(mg))
			return true;
		return false;
	}
}
