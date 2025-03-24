public class ClassA {
    public static void display(int a) {
        System.out.println("ClassA: Displaying int: " + a);
    }

    public static void display(double a) {
        System.out.println("ClassA: Displaying double: " + a);
    }

    public static void display(String a) {
        System.out.println("ClassA: Displaying String: " + a);
    }

    public static void display(int a, int b) {
        System.out.println("ClassA: Displaying two ints: " + a + ", " + b);
    }

    public static void display(double a, double b) {
        System.out.println("ClassA: Displaying two doubles: " + a + ", " + b);
    }

    public static void display(int a, String b) {
        System.out.println("ClassA: Displaying int and String: " + a + ", " + b);
    }

    public static void display(String a, int b) {
        System.out.println("ClassA: Displaying String and int: " + a + ", " + b);
    }

    public static void display(boolean a) {
        System.out.println("ClassA: Displaying boolean: " + a);
    }

    public static void display(char a) {
        System.out.println("ClassA: Displaying char: " + a);
    }

    public static void display(int[] a) {
        System.out.println("ClassA: Displaying int array: " + java.util.Arrays.toString(a));
    }

    public static void main(String[] args) {
        display(10);
        display(10.5);
        display("Hello");
        display(10, 20);
        display(10.5, 20.5);
        display(10, "Hello");
        display("Hello", 10);
        display(true);
        display('A');
        display(new int[]{1, 2, 3});
    }
}