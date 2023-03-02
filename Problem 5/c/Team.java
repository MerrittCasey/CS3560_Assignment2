import java.util.List;

public class Team {
	private int code;
	private List<Player> players;
	
	public Team() {
		code = 0;
	}

	public setPlayers(List<Player> players){
		this.players = players;
	}

	public addPlayer(Player player){
		players.add(player);
	}
}
