public class ClassC {
    public static void print(int a) {
        System.out.println("ClassC: Printing int: " + a);
    }

    public static void print(double a) {
        System.out.println("ClassC: Printing double: " + a);
    }

    public static void print(String a) {
        System.out.println("ClassC: Printing String: " + a);
    }

    public static void print(int a, int b) {
        System.out.println("ClassC: Printing two ints: " + a + ", " + b);
    }

    public static void print(double a, double b) {
        System.out.println("ClassC: Printing two doubles: " + a + ", " + b);
    }

    public static void print(int a, String b) {
        System.out.println("ClassC: Printing int and String: " + a + ", " + b);
    }

    public static void print(String a, int b) {
        System.out.println("ClassC: Printing String and int: " + a + ", " + b);
    }

    public static void print(boolean a) {
        System.out.println("ClassC: Printing boolean: " + a);
    }

    public static void print(char a) {
        System.out.println("ClassC: Printing char: " + a);
    }

    public static void print(int[] a) {
        System.out.println("ClassC: Printing int array: " + java.util.Arrays.toString(a));
    }

    public static void main(String[] args) {
        print(30);
        print(30.5);
        print("Java");
        print(30, 40);
        print(30.5, 40.5);
        print(30, "Java");
        print("Java", 30);
        print(true);
        print('C');
        print(new int[]{7, 8, 9});
    }
}