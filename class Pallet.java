class Pallet {
    String material;
    int weight;
    String color;
    int height;
    int width;
    int length;
    String brand;
    boolean isReusable;
    String manufacturer;
    double cost;

    Pallet() {
        this("Wood", 50, "Brown", 10, 20, 30, "XYZ", true, "ABC Corp", 150.50);
    }

    Pallet(String material, int weight, String color, int height, int width, int length, String brand, boolean isReusable, String manufacturer, double cost) {
        this.material = material;
        this.weight = weight;
        this.color = color;
        this.height = height;
        this.width = width;
        this.length = length;
        this.brand = brand;
        this.isReusable = isReusable;
        this.manufacturer = manufacturer;
        this.cost = cost;
    }

    void info() {
        System.out.println("Pallet - Material: " + material + ", Weight: " + weight + ", Color: " + color);
    }
}


