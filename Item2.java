public class Item2 {
    public static void itemName(String itemName, double price) {
        String item = itemName;
        double pr = price;

        System.out.println("The item is : " + item);
        System.out.println(GSTCal.calGST(pr));
    }

    public static void itemName(String brandName, String itemName, double price) {
        String br = brandName;
        String it = itemName;
        double pr = price;
        double totalamt = GSTCal.calGST(pr) + pr;

        if (br.equalsIgnoreCase("Apple,Samsung")) {
            double dis = totalamt - (totalamt * 5) / 100;
            System.out.println("The discount is added");
            System.out.println("The total payable amount after discount is " + dis);
        } else {
            System.out.println("The total payable amount is " + totalamt);
        }
        System.out.println("-------------------------------------------------");
    }

    public static void itemName(double[] prices) {
        double maxamt = 0;
        for (int i = 0; i < prices.length; i++) {
            double pr = prices[i];
            double totalamt = GSTCal.calGST(pr) + pr;
            System.out.println("The price of the item is " + pr);
            System.out.println("The item GST is " + GSTCal.calGST(pr));
            System.out.println("The total amount after GST is " + totalamt);

            if (totalamt > maxamt) {
                maxamt = totalamt;
            }
        }
        System.out.println("The Maximum amount spent in the List is " + maxamt);
    }

    public static void itemName(String[] itemNames, double[] prices) {
        if (itemNames.length != prices.length) {
            System.out.println("The number of items and prices do not match.");
            return;
        }

        System.out.println("Items and Prices are:");

        double totalamt = 0;

        for (int i = 0; i < itemNames.length; i++) {
            System.out.println(itemNames[i] + " : Rs " + prices[i]);
            totalamt += GSTCal.calGST(prices[i]) + prices[i];
            System.out.println("The total amount is " + totalamt);
        }
    }

    public static void itemName(String coupon, String[] itemNames, double[] prices) {
        for (int i = 0; i < prices.length; i++) {
            double price = prices[i];
            double gstAmount = GSTCal.calGST(price);
            double totalWithGST = price + gstAmount;

            if (coupon.equalsIgnoreCase("Tech2024!")) {
                double discount = (totalWithGST * 25) / 100;
                double finalPrice = totalWithGST - discount;
                System.out.println("25% discount applied on " + itemNames[i] + ". Discounted Price: Rs " + finalPrice);
            } else if (coupon.equalsIgnoreCase("GadgetDeal99")) {
                if (itemNames[i].equalsIgnoreCase("Smartphone")) {
                    double discount = (totalWithGST * 33.33) / 100;
                    double finalPrice = totalWithGST - discount;
                    System.out.println("33.3% discount applied on Smartphone. Discounted Price: Rs " + finalPrice);
                }
            }
        }
    }
}
