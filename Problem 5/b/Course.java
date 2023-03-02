import java.util.ArrayList;

public class Course {
	private int code;
	private List<Book> books;
	
	public Course(int code, List<Book> books){
		this.books = books;
		this.code = code;
	}
}
