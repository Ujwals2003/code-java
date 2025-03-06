public class CountGreater {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int value = 25, count = 0;
        for (int num : arr) {
            if (num > value) {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}
