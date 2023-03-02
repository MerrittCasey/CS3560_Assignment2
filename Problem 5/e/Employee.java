
public class Employee {
	private String name;
	private int hours;
	
	public Employee(String name, int hours) {
		this.name = name;
		this.hours = hours;
	}
	
	//returns salary of an employee,  hours * 20
	public double calculateSalaray() {
		return hours * 20;
	}
	
	//return hours
	//you need this to calculate professor salary
	public int getHours() {
		return hours;
	}
}
