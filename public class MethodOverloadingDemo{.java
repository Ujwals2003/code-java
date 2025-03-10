public class MethodOverloadingDemo {
    static int[] numbers = new int[10];
    static int count = 0;

    public int display(int a) {
        return a;
    }

    public float display(float a) {
        return a;
    }

    public double display(double a) {
        return a;
    }

    public String display(String a) {
        return a;
    }

    public int display(int a, int b) {
        return a + b;
    }

    public float display(float a, float b) {
        return a + b;
    }

    public double display(double a, double b) {  // Fixed syntax issue here
        return a + b;
    }

    public int[] display(int[] arr) {
        return arr;
    }

    public String[] display(String[] arr) {
        return arr;
    }

    public char display(char a) {
        return a;
    }

    public boolean display(boolean a) {
        return a;
    }

    public double display(int a, double b) {
        return a + b;
    }

    public double display(double a, int b) {
        return a + b;
    }

    public String display(String a, String b) {
        return a + " " + b;
    }

    public int display(int a, int b, int c) {
        return a + b + c;
    }

    public float display(float a, float b, float c) {
        return a + b + c;
    }

    public double display(double a, double b, double c) {
        return a + b + c;
    }

    public String display(String a, int b) {
        return a + " " + b;
    }

    public String display(int a, String b) {
        return a + " " + b;
    }

    // Method to add numbers to the array
    public boolean addNumber(int arr) {
        if (count < numbers.length) {
            numbers[count] = arr; // Fixed variable name (arr instead of num)
            count++;
            return true;
        }
        return false; // Moved inside method body
    }

    public int[] getNumbers() {  // Fixed method name
        return numbers;
    }

    public static void main(String[] args) {
        MethodOverloadingDemo obj = new MethodOverloadingDemo();

        // Demonstrating method overloading
        System.out.println("Integer Display: " + obj.display(10));
        System.out.println("Float Display: " + obj.display(10.5f));
        System.out.println("Double Display: " + obj.display(20.55));
        System.out.println("String Display: " + obj.display("Hello"));
        System.out.println("Addition of two integers: " + obj.display(5, 10));
        System.out.println("Addition of two floats: " + obj.display(5.5f, 2.5f));
        System.out.println("Addition of int and double: " + obj.display(5, 2.5));
        System.out.println("Concatenation of two Strings: " + obj.display("Hello", "World"));

        // Demonstrating array operations
        obj.addNumber(10);
        obj.addNumber(20);
        obj.addNumber(30);

        System.out.print("Stored Numbers: ");
        for (int num : obj.getNumbers()) { // Fixed method call
            System.out.print(num + " ");
        }
    }
}
