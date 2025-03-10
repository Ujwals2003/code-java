public class Product{
	static String[] productName = {null, null, null, null};
	static int index = 0;
	public static void productDetails(String product)
	{
		
			if(index < productName.length)
			{
				productName[index] = product;
				index++;
				System.out.println(product + "added successfully");

			}else{
				System.out.println("cannot add more products.");
			}
		
	}
	public static void display()
	{
		for (int i=0; i < productName.length;i++) {
				if(productName[i] != null){
				System.out.println(productName[i]);
			}
			
		}
	}
	public static boolean search(String product)
	{
		for(int i=0; i<productName.length;i++)
		{
			if(product.equals(productName[i])){
				return true;
			}
				return false;
			
		}return false;

	}

	public static void main(String args[])
	{
		productDetails("APPLE");
		productDetails("VIVO");
		productDetails("SAMSUNG");
		productDetails("NOKIA");
		String searchProduct = "redmi";
		if(search(searchProduct))
		{
			System.out.println("the product is prsent:" + searchProduct);
		}else{
			System.out.println("the product is not prsent:" + searchProduct);
		}

		Product.display();
	}
	

}