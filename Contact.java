public class Contact{
	static long[] number= {0,0,0,0};
	static int index = 0;
	public static void contactNumber(long contact)
	{
		if(number != null)
		{
			if(index < number.length)
			{
				number[index] = contact;
				index++;
				System.out.println("the contact is is empty");
			}else{
					System.out.println("the contact is is present");
				 }
		}
	}
	// 	public static void display(){
	// 		for(int i=0;i<Number.length;i++){
	// 					System.out.println(Number[i]);

	// 	}

	// }

	
	public static void main(String args[])
	{

		contactNumber(8660730618L);
		contactNumber(8496086909L);
		contactNumber(8496086909L);
		contactNumber(8496086909L);
		for(int i=0;i<number.length;i++){
	 			System.out.println(number[i]);
	}
		

	}
}
