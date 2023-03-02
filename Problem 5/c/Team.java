
public class Team {
	private int code;
	private Player[] players;
	
	public Team() {
		code = 0;
		players = new Player[]{new Player("", false)};
	}
}
