
public class Soccer {
	private static String player;
	private static String position;
	private static int goals;
	
	public Soccer(String Player, String Position, int Goals)
	{
		player = Player;
		position = Position;
		goals = Goals;
	}
	
	public String toString()
	{
		return "Soccer" + "\n" + "Player: " + player + "\n" + "Position: " + position + "\n" + "Goals: " + goals + "\n";
	}
}
