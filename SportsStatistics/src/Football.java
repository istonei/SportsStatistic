
public class Football {
	private static String player;
	private static String position;
	private static int tackles;
	private static int interceptions;
	
	public Football (String Player, String Position, int Tackles, int Interceptions)
	{
		player = Player;
		position = Position;
		tackles = Tackles;
		interceptions = Interceptions;
	}
	public String toString()
	{
		return "Football" + "\n" + "Player: " + player + "\n" +"Position: " + position + "\n" +"Tackles: " + tackles
				+ "\n" + "Interceptions: " + interceptions + "\n";
	}
}
