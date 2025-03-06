import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 5, 6, 6, 3};
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        System.out.println(freq);
    }
}
