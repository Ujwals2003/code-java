public class TabRunner {
    public static void main(String[] args) {
        Tab t1 = new Tab(101, "TabX", "BrandA", "ModelA", "Android 12", "Quad-Core", 128, 6, 10, "1920x1080", 6000, 
                         "Wi-Fi & LTE", true, true, 12, true, true, "Black", 30000, true);
        Tab t2 = new Tab(102, "TabY", "BrandB", "ModelB", "iOS 16", "Snapdragon", 256, 8, 11, "2388x1668", 7500, 
                         "Wi-Fi & Cellular", true, true, 10, true, true, "Silver", 50000, false);
        Tab t3 = new Tab(103, "TabZ", "BrandC", "ModelC", "Windows 11", "Octa-Core", 512, 16, 12, "2736x1824", 8000, 
                         "Wi-Fi only", true, true, 15, true, true, "Gray", 70000, true);

        // Calling display method for each Tab
        t1.display();
        t2.display();
        t3.display();
    }
}