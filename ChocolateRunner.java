class ChocolateRunner {
    public static void main(String[] args) {
        Chocolate ch1 = new Chocolate(101, "MilkChoco", "BrandA", "Milk Chocolate", "Round", 100, "Brown", true, 
                                      "Hazelnut", 150, 8, false, true, 1, 80, true, "Eco-Friendly", "Glossy", 
                                      "Plastic Wrapper", true);
        Chocolate ch2 = new Chocolate(102, "DarkChoco", "BrandB", "Dark Chocolate", "Square", 200, "Dark Brown", false, 
                                      "Almond", 200, 10, true, true, 0, 90, false, "Non-Eco-Friendly", "Matte", 
                                      "Aluminum Foil", false);
        Chocolate ch3 = new Chocolate(103, "WhiteChoco", "BrandC", "White Chocolate", "Heart", 150, "White", true, 
                                      "Coconut", 250, 5, false, false, 1, 75, true, "Eco-Friendly", "Glossy", 
                                      "Paper Wrapper", true);

        ch1.display();
        ch2.display();
        ch3.display();
    }
}