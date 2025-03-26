class HangerRunner {
    public static void main(String[] args) {
        Hanger hanger1 = new Hanger();
        System.out.println("Hanger 1 is an old hanger tucked away in a forgotten closet.");
        System.out.println("Default Values:");
        System.out.println("Material: " + hanger1.material);
        System.out.println("Capacity: " + hanger1.capacity);
        System.out.println("Is Foldable: " + hanger1.isFoldable);
        System.out.println("Shape: " + hanger1.shape);

        Hanger hanger2 = new Hanger();
        hanger2.material = "Wooden";
        hanger2.capacity = 10;
        hanger2.isFoldable = true;
        hanger2.shape = "Curved";
        System.out.println("\nHanger 2 is a modern, space-saving solution for a minimalist wardrobe.");
        System.out.println("Updated Values:");
        System.out.println("Material: " + hanger2.material);
        System.out.println("Capacity: " + hanger2.capacity);
        System.out.println("Is Foldable: " + hanger2.isFoldable);
        System.out.println("Shape: " + hanger2.shape);
    }
}