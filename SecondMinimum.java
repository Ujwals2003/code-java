import java.util.Arrays;

public class SecondMinimum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 30, 25};
        Arrays.sort(arr);
        System.out.println("Second minimum element: " + arr[1]);
    }
}
S