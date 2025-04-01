class Tab {
    int id;
    String name;
    String brand;
    String model;
    String operatingSystem;
    String processor;
    int storageCapacity; 
    int ram; 
    int screenSize;
    String resolution;
    int batteryCapacity; 
    String connectivity; 
    boolean isTouchScreen;
    boolean hasCamera;
    int cameraResolution; 
    boolean hasGPS;
    boolean hasBluetooth;
    String color;
    int price;
    boolean isOnSale;

    public Tab(int id, String name, String brand, String model, String operatingSystem, String processor, int storageCapacity, 
               int ram, int screenSize, String resolution, int batteryCapacity, String connectivity, boolean isTouchScreen, 
               boolean hasCamera, int cameraResolution, boolean hasGPS, boolean hasBluetooth, String color, int price, boolean isOnSale) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.processor = processor;
        this.storageCapacity = storageCapacity;
        this.ram = ram;
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.batteryCapacity = batteryCapacity;
        this.connectivity = connectivity;
        this.isTouchScreen = isTouchScreen;
        this.hasCamera = hasCamera;
        this.cameraResolution = cameraResolution;
        this.hasGPS = hasGPS;
        this.hasBluetooth = hasBluetooth;
        this.color = color;
        this.price = price;
        this.isOnSale = isOnSale;
    }

    // Display function to print Tab details
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Processor: " + processor);
        System.out.println("Storage Capacity: " + storageCapacity + "GB");
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Resolution: " + resolution);
        System.out.println("Battery Capacity: " + batteryCapacity + "mAh");
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Touch Screen: " + (isTouchScreen ? "Yes" : "No"));
        System.out.println("Has Camera: " + (hasCamera ? "Yes, " + cameraResolution + "MP" : "No"));
        System.out.println("GPS: " + (hasGPS ? "Yes" : "No"));
        System.out.println("Bluetooth: " + (hasBluetooth ? "Yes" : "No"));
        System.out.println("Color: " + color);
        System.out.println("Price: ₹" + price);
        System.out.println("On Sale: " + (isOnSale ? "Yes" : "No"));
        System.out.println("-------------------------------");
    }
}
