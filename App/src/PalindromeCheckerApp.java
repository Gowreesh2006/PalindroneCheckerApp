public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=== UC2: Hardcoded Palindrome Check ===");

        // Hardcoded string
        String word = "madam";

        // Reverse the string manually
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        // Compare and print result
        if (word.equals(reverse)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}