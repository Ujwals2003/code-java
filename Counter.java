public class Counter {
    static int count = 0; 

    static void countDisplay() {
        count++; // Increment count
        System.out.println("Method invoked "+count+" times");
    
    }

    public static void main(String[] args) {
        // Invoke the method multiple times without creating an object
        countDisplay();
        countDisplay();
        countDisplay();
        countDisplay();
        countDisplay();
        countDisplay();
        countDisplay();
        countDisplay();
        countDisplay();

    }
}