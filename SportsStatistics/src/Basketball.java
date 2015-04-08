
public class Basketball {
	private static String player;
	private static int points;
	private static int assists;
	
	public Basketball (String Player, int Points, int Assists)
	{
		player = Player;
		points = Points;
		assists = Assists;
	}
	public String toString()
	{
		return "Basketball" + "\n" +"Player: " + player + "\n" + "Points: " + points + "\n"+ "Assists: " + assists + "\n";
	}
}
