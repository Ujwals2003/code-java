public class UpperCaseArgs {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.print(arg.toUpperCase() + " ");
        }
    }
}
