public class RCB{
	
	public static void matchDetails(String DayName , String... PlayerNames){
		String day = DayName;
		for (String name : PlayerNames ) {
			System.out.println("The name of the players are "+name);
			System.out.println("The day name is "+day);
		}

	}

	public static void matchDetails(String[] PlayerNames, int[] noOfMatches , int[] totalRuns){
		for (int i=0;i<PlayerNames.length ;i++ ) {
			String name = PlayerNames[i];
			int match = noOfMatches[i];
			int run = totalRuns[i];

			int avg = run/match;
			System.out.println("The Player Name is "+name);
			System.out.println("The average of the player is "+avg);
		}
	}


	public static void main(String[] args){
		 String[] PlayerNames ={"Virat Kholi","Rajat","ABD","Gayle"};
		 int[] noOfMatches = {130,60,110,90};
		 int[] totalRuns = {8089,2080,4516,3986};
		matchDetails("Friday",PlayerNames);	
		matchDetails(PlayerNames,noOfMatches,totalRuns);	

	}
}