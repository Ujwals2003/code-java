public class DisplayAdd{
	public static void main(String args[])
	{
		int Display[][] = {{1,2,3,4},{2,3,4,5},{3,4,5,6}};
		int sum = 0;
		for(int i = 0; i < Display.length; i++)
		{
			
			for(int j = 0; j < Display[i].length; j++)
			{
				 sum += Display[i][j];
			}
			
			System.out.println(" ");
		}
		System.out.println(sum + "the addition is");

	}
}
