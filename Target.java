public class Target{
	public  void main(String[] atgs){
	int [] arr = {2,3,5,7,9};
	int target = 13;
	boolean find = false;

	for (int num : arr)
		{
			if( num == target)
			{
				find = true;
				break;
			}
		}
		if(find)
		{
			System.out.println("THE NUMBER IS PRSENT IN ARRAY :" + target);
		} else{
			System.out.println("THE NUMBER IS NOT PRESENT :" + target);
		}
	}
}