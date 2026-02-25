import java.util.*;

class PalindromeService {

    // Encapsulated palindrome logic (UC11)
    public boolean checkPalindrome(String input) {

        // Clean up input
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any word or sentence: ");
        String input = sc.nextLine();

        // Create service object (OOPS concept)
        PalindromeService service = new PalindromeService();

        boolean result = service.checkPalindrome(input);

        if (result) {
            System.out.println("Palindrome (UC11 - OOPS Service Method)");
        } else {
            System.out.println("Not Palindrome (UC11 - OOPS Service Method)");
        }

        sc.close();
    }
}