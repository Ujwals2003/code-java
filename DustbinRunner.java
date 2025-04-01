class DustbinRunner {
    public static void main(String[] args) {
        Dustbin db1 = new Dustbin(401, "EcoBin", "BrandA", "Round", 30, "Green", "Plastic", 499.99, true, true, true, 
                                  "Outdoor", "Pedal Operated", false, 5, "Recyclable", "Eco-Friendly", "Anti-Odor", 
                                  "Compact", true);
        Dustbin db2 = new Dustbin(402, "SmartBin", "BrandB", "Square", 50, "Gray", "Stainless Steel", 1299.99, false, true, 
                                  true, "Indoor", "Sensor Operated", true, 3, "Non-Recyclable", "Not Eco-Friendly", 
                                  "No Odor Control", "Bulky", false);
        Dustbin db3 = new Dustbin(403, "BasicBin", "BrandC", "Rectangular", 20, "Blue", "Plastic", 299.99, false, false, 
                                  false, "Indoor", "Manual Lid", false, 7, "Recyclable", "Eco-Friendly", "Anti-Odor", 
                                  "Compact", true);

        db1.display();
        db2.display();
        db3.display();
    }
}