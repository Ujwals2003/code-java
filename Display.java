public class Display{
	public static void main(String args[])
	{
		int Display[][] = {{1,2,3,4},{2,3,4,5},{3,4,5,6}};
		for(int i = 0; i < Display.length; i++)
		{
			
			for(int j = 0; j < Display[i].length; j++)
			{
				System.out.print(Display[i][j]);
			}
			
			System.out.println(" ");
		}

	}
}
