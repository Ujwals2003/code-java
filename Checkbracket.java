public class CheckBracket {
    public static void main(String args[]) {
        String input = "[({})";  
        int count = 0;  

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') count++;  
            if (ch == ')' || ch == '}' || ch == ']') count--;  
        }

        if (count == 0) {
            System.out.println("All the brackets are closed.");
        } else {
            System.out.println("Not closed.");
        }
    }
}
