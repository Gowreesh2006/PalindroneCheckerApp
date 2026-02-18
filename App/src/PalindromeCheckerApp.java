public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String text = "madam";   // Hardcoded input
        String reversed = "";

        for(int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        if(text.equals(reversed)) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is Not a Palindrome");
        }
    }
}
