public class Palindrome1{
	public static void checkPalindrome(int num)
	{
		int rev = 0, original = num;
		while(num > 0)
		{
			rev = rev * 10 + num % 10;
			System.out.println(rev + "rev");


			num = num/10;
			System.out.println(num + "Number");

		}
		if(original == rev)
		{
			System.out.println(original + "is a palindrome");

		}else{
			System.out.println(original + "is not palindrome");
		}
	}
	public static void main(String args[])
	{
		int num = 1332;
		checkPalindrome(num);

	}
	
}

