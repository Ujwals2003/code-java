public class CountMultiples{
	public static void main(String[] args)
	{
		int[] arr = {2, 6, 8, 10, 12 };
		int target = 2;
		int count = 0;

		for(int num : arr)
		{
			if(num % target == 0)
			{
				count++;
			}
		}
		System.out.println("Count of multiples of" + target + "is:" + count);
	}
}