import java.util.ArrayList;

public class Dog {
	private String breed;
	private String name;
	private ArrayList<Paw> paws;
	
	public Dog() {
		breed = "";
		name = "";
		paws = new ArrayList<Paw>();
		paws.add(new Paw(0));
		paws.add(new Paw(1));
		paws.add(new Paw(2));
		paws.add(new Paw(3));
	}
}
