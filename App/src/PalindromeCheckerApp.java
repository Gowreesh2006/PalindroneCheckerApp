import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // STEP 1: Normalize
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // STEP 2: Check palindrome
        boolean isPalindrome = checkPalindrome(normalized);

        if (isPalindrome) {
            System.out.println("Palindrome (Case-Insensitive & Space-Ignored)");
        } else {
            System.out.println("Not Palindrome (Case-Insensitive & Space-Ignored)");
        }

        sc.close();
    }

    // UC10 logic
    public static boolean checkPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}