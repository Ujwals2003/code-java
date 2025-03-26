class JamoonRunner {
    public static void main(String[] args) {
        Jamoon jamoon1 = new Jamoon();
        System.out.println("Jamoon 1 is a plain dessert waiting to be decorated for a festive occasion.");
        System.out.println("Default Values:");
        System.out.println("Taste: " + jamoon1.taste);
        System.out.println("Color: " + jamoon1.color);
        System.out.println("Weight: " + jamoon1.weight);
        System.out.println("Is Sweet: " + jamoon1.isSweet);

        Jamoon jamoon2 = new Jamoon();
        jamoon2.taste = "Rich";
        jamoon2.color = "Dark Purple";
        jamoon2.weight = 50.5;
        jamoon2.isSweet = true;
        System.out.println("\nJamoon 2 is a gourmet dessert prepared by a skilled pastry chef.");
        System.out.println("Updated Values:");
        System.out.println("Taste: " + jamoon2.taste);
        System.out.println("Color: " + jamoon2.color);
        System.out.println("Weight: " + jamoon2.weight);
        System.out.println("Is Sweet: " + jamoon2.isSweet);
    }
}