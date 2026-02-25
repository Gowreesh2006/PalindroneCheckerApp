import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        // Push characters
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop to reverse
        String reverse = "";
        while (!stack.isEmpty()) {
            reverse = reverse + stack.pop();
        }

        if (input.equals(reverse)) {
            System.out.println("Palindrome (Stack Method)");
        } else {
            System.out.println("Not Palindrome (Stack Method)");
        }

        sc.close();
    }
}