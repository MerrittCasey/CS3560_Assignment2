
public class Staff extends Employee{
	private int role;
	
	public Staff(int role, String name, int hours) {
		super(name, hours);
		this.role = role;
	}
}
