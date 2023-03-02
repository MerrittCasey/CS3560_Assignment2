
public class Professor extends Employee{
	private String field;
	
	public Professor(String field, String name, int hours) {
		super(name,hours);
		this.field = field;
	}
	
	//returns the salary of a professor, hours * 30
	public double calculateSalary() {
		return getHours() * 30;
	}
}
