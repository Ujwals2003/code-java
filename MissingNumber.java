public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5};
        System.out.print("Missing numbers: ");
        for (int i = arr[0]; i <= arr[arr.length - 1]; i++) {
            boolean found = false;
            for (int num : arr) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(i + " ");
            }
        }
    }
}
