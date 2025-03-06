public class SumOf{
	public static void main(String args[])
	{
		int[] arr = {2, 3, 5, 4};
		int target = 25;
		int sum = 0;

		for (int num : arr)
		{
			sum += num;
		}
		if(sum == target)
		{
			System.out.println("TARGET IS EQUAL TO THE SUM OF ARRAY ELEMENTS");
		} else{
			System.out.println("TARGET IS NOT EQUAL TO THE SUM OF ARRAY ELEMENTS");
		}
	}
}