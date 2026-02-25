import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        boolean isPalindrome = checkRecursive(input, 0, input.length() - 1);

        if (isPalindrome) {
            System.out.println("Palindrome (Recursive Method)");
        } else {
            System.out.println("Not Palindrome (Recursive Method)");
        }

        sc.close();
    }

    // UC9: Recursive palindrome check
    public static boolean checkRecursive(String s, int left, int right) {

        // Base condition: crossed or met in middle
        if (left >= right) {
            return true;
        }

        // If mismatch
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        // Recursive call
        return checkRecursive(s, left + 1, right - 1);
    }
}