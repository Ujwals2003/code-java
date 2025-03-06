import java.util.Arrays;

public class SortArgs {
    public static void main(String[] args) {
        Arrays.sort(args);
        for (String arg : args) {
            System.out.print(arg + " ");
        }
    }
}
