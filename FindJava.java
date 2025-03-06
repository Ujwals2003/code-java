public class FindJava {
    public static void main(String[] args) {
        for (String arg : args) {
            if (arg.equals("Java")) {
                System.out.println("Java is present");
                return;
            }
        }
        System.out.println("Java is not present");
    }
}
