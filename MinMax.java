import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 30, 25};
        Arrays.sort(arr);
        System.out.println("Minimum: " + arr[0]);
        System.out.println("Maximum: " + arr[arr.length - 1]);
    }
}
