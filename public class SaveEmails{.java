public class SaveEmails {
    static String[] emails = new String[5]; // Storage for emails
    static String[] foodNames = new String[5]; // Storage for food names
    static int emailCount = 0;
    static int foodCount = 0;

    // Check for duplicate email
    public static boolean isDuplicateEmail(String email) {
        for (int i = 0; i < emailCount; i++) {
            if (emails[i] != null && emails[i].equalsIgnoreCase(email)) {
                return true;
            }
        }
        return false;
    }

    // Add email
    public static void addEmail(String email) {
        if (isDuplicateEmail(email)) {
            System.out.println("Duplicate email \"" + email + "\" found! Not adding.");
            return;
        }
        if (emailCount < emails.length) {
            emails[emailCount] = email;
            emailCount++;
            System.out.println("Email added: " + email);
        } else {
            System.out.println("Email list is full! Cannot add: " + email);
        }
    }

    // Display all emails
    public static void displayEmails() {
        System.out.println("\nSaved Emails:");
        for (String email : emails) {
            if (email != null) {
                System.out.println("- " + email);
            }
        }
    }

    // Search email
    public static void searchEmail(String email) {
        for (String e : emails) {
            if (e != null && e.equalsIgnoreCase(email)) {
                System.out.println("Email \"" + email + "\" found!");
                return;
            }
        }
        System.out.println("Email \"" + email + "\" not found.");
    }

    // Check for duplicate food name
    public static boolean isDuplicateFood(String food) {
        for (int i = 0; i < foodCount; i++) {
            if (foodNames[i] != null && foodNames[i].equalsIgnoreCase(food)) {
                return true;
            }
        }
        return false;
    }

    // Add food name
    public static void addFood(String food) {
        if (isDuplicateFood(food)) {
            System.out.println("Duplicate food \"" + food + "\" found! Not adding.");
            return;
        }
        if (foodCount < foodNames.length) {
            foodNames[foodCount] = food;
            foodCount++;
            System.out.println("Food added: " + food);
        } else {
            System.out.println("Food list is full! Cannot add: " + food);
        }
    }

    // Display all food names
    public static void displayFoods() {
        System.out.println("\nSaved Food Names:");
        for (String food : foodNames) {
            if (food != null) {
                System.out.println("- " + food);
            }
        }
    }

    // Search food name
    public static void searchFood(String food) {
        for (String f : foodNames) {
            if (f != null && f.equalsIgnoreCase(food)) {
                System.out.println("Food \"" + food + "\" found!");
                return;
            }
        }
        System.out.println("Food \"" + food + "\" not found.");
    }

    public static void main(String[] args) {
        // Add Emails
        addEmail("ujwals2003@gmail.com");
        addEmail("ujwalskumar8@gmail.com"); // Duplicate test
        addEmail("sudeep@gmail.com");

        // Display Emails
        displayEmails();

        // Search Email
        searchEmail("ujwals2003@gmail.com");
        searchEmail("ujwalskumar8@gmail.com");

        // Add Food Names
        addFood("Pizza");
        addFood("pizza"); // Duplicate test
        addFood("Burger");

        // Display Food Names
        displayFoods();

        // Search Food
        searchFood("Pizza");
        searchFood("Pasta");
    }
}
