
public class Person {
	private String name;
	private List<Watch> movies;
	
	public Person(String name,  List<Watch> movies) {
		this.name = name;
		this.movies = movies;
	}

	public addMove(Watch watching){
		movies.add(watching);
	}
}
