public class ItemRunner {
    public static void main(String[] args) {

        Item2.itemName("Smartphone", 49999.99);

        Item2.itemName("Laptop", "Gaming Laptop", 75999.50);

        double[] prices = {1999.99, 1500.50, 75999.50, 49999.99};
        String[] itemNames = {"Smartwatch", "Bluetooth Speaker", "Gaming Laptop", "Smartphone"};
        Item2.itemName(prices);

        Item2.itemName(itemNames, prices);

        Item2.itemName("Tech2024!", itemNames, prices);
    }
}
