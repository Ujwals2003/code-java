public class Shope
{
    static String[] itemName = {null, null, null, null};
    static String[] brandName = {null, null, null, null};
    static int itemIndex = 0;
    static int brandIndex = 0;
    static double gst = 18; 
    static double quantity = 2;
    static double price = 200;
    static double totalPrice;
    static String item1 = "Frill";
    static String item2 = "Grill";
    
    public static double totalCalculation(double price, double quantity) {
        totalPrice = price * quantity;
        return totalPrice;
    }
    
    public static double totalCalculation(double totalPrice) {
        return totalPrice + (totalPrice * gst / 100);
    }
    
    public static void totalCalculation(String item, double price) 
    {
        if (itemIndex < itemName.length) 
        { 
            itemName[itemIndex] = item;
            itemIndex++;
        } else 
        {
            System.out.println("Item list is full!");
        }
    }
    
    public static void totalCalculation(String brand)
    {
        if(brandIndex < brandName.length)
        {
            brandName[brandIndex] = brand;
            brandIndex++;
        } else {
            System.out.println("The brand list is full");
        }
    }
    
    public static void main(String[] args) {
        double total = totalCalculation(price, quantity); 
        double finalPrice = totalCalculation(total); 
        totalCalculation("Laptop", 300);
        totalCalculation("Mobile", 600);
        totalCalculation("airpods", 250);
        totalCalculation("wireless keyboard", 550);
        totalCalculation("Lenovo");
        totalCalculation("apple");
        totalCalculation("boat");
        totalCalculation("hp");

        System.out.println("The total price without GST: " + total);
        System.out.println("The total price with GST: " + finalPrice);
        System.out.println("Stored items:");
        for(String item : itemName)
        {
            System.out.println(item);
        }
        System.out.println("Stored brands:");
        for(String brand : brandName)
        {
            System.out.println(brand);
        }
    }
}