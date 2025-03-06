public class Cricket{
	static String teamName;
	static int teamPlayers;
	static int numberOfMatch;
	static int gameWinner;
	static int gameLoss;

	public static void main(String args[])
	{
		Cricket.teamName = "RCB";
		Cricket.teamPlayers = 12;
		Cricket.numberOfMatch = 14;
		Cricket.gameWinner = 7;
		Cricket.gameLoss = 7;
		
		System.out.println("THE DETAILS OF CRICKET IS:");
		System.out.println("The team name is:" + Cricket.teamName);
		System.out.println("The teamplayers is:" + Cricket.teamPlayers);
		System.out.println("The number of match played is:" + Cricket.numberOfMatch);
		System.out.println("The number of match winning is:" + Cricket.gameWinner);
		System.out.println("The number of match lossing is:" + Cricket.gameLoss);
	}
}