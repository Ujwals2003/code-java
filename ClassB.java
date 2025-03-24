public class ClassB {
    public static void show(int a) {
        System.out.println("ClassB: Showing int: " + a);
    }

    public static void show(double a) {
        System.out.println("ClassB: Showing double: " + a);
    }

    public static void show(String a) {
        System.out.println("ClassB: Showing String: " + a);
    }

    public static void show(int a, int b) {
        System.out.println("ClassB: Showing two ints: " + a + ", " + b);
    }

    public static void show(double a, double b) {
        System.out.println("ClassB: Showing two doubles: " + a + ", " + b);
    }

    public static void show(int a, String b) {
        System.out.println("ClassB: Showing int and String: " + a + ", " + b);
    }

    public static void show(String a, int b) {
        System.out.println("ClassB: Showing String and int: " + a + ", " + b);
    }

    public static void show(boolean a) {
        System.out.println("ClassB: Showing boolean: " + a);
    }

    public static void show(char a) {
        System.out.println("ClassB: Showing char: " + a);
    }

    public static void show(int[] a) {
        System.out.println("ClassB: Showing int array: " + java.util.Arrays.toString(a));
    }

    public static void main(String[] args) {
        show(20);
        show(20.5);
        show("World");
        show(20, 30);
        show(20.5, 30.5);
        show(20, "World");
        show("World", 20);
        show(false);
        show('B');
        show(new int[]{4, 5, 6});
    }
}