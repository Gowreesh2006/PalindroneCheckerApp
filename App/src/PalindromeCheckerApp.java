import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        Deque<Character> deque = new LinkedList<>();

<<<<<<< HEAD
        // Insert into deque
=======
>>>>>>> 3d63a90faa9fcb8b0374b84957df6cb8a70381aa
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

<<<<<<< HEAD
        // Compare front and rear
=======
>>>>>>> 3d63a90faa9fcb8b0374b84957df6cb8a70381aa
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome (Deque Method)");
        } else {
            System.out.println("Not Palindrome (Deque Method)");
        }

        sc.close();
    }
}