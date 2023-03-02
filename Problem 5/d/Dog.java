
public class Dog {
	private String breed;
	private String name;
	private Paw[] paws;
	
	public Dog() {
		breed = "";
		name = "";
		paws = new Paw[] {new Paw(0), new Paw(1), new Paw(2), new Paw(3)};
	}
}
