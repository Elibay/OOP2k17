package Problem3;

public class Employee extends Person {
	public double salary;
	public int year;
	public String insuranceNumber;
	public Employee (String name, double salary, int year, String insuranceNumber) {
		super (name);
		this.salary = salary;
		this.year = year;
		this.insuranceNumber = insuranceNumber;
	} 
	public Employee() {
		salary = 0;
		year = 0;
		insuranceNumber = "";
	}
	public String toString(){
		return super.toString() + " " + salary + " " + year;
	}
	public boolean equals (Employee employee) {
		if (super.equals(employee) && year == employee.year && insuranceNumber.equals(employee.insuranceNumber))
			return true;
		return false;
	}
}
