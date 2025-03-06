public class ConcatArgs {
    public static void main(String[] args) {
        String result = "";
        for (String arg : args) {
            result += arg + " ";
        }
        System.out.println(result.trim());
    }
}
