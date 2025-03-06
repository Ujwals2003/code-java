public class SoftwareInfo {
    static String name = "MyApp";
    static String version = "1.0";
    static String developer = "XYZ Tech";

    public static void displayInfo() {
        System.out.println("Software Name: " + name);
        System.out.println("Version: " + version);
        System.out.println("Developer: " + developer);
    }

    public static void main(String[] args) {
        displayInfo();
    }
}