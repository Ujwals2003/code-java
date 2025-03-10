public class BracketReverser {
    public static void main(String[] args) {
    
        String input = "{[\\"; 
        String output = "";

    
        for (int i = input.length() - 1; i >= 0; i--) {
            char ch = input.charAt(i);
            if (ch == '{') output += '}';
            else if (ch == '[') output += ']'
            else if (ch == '\\') output += '/';
            
        }

        System.out.println("Output: " + output);
    }
}