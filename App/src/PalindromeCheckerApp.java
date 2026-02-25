import java.util.*;

public class PalindromeCheckerApp {

    static class Node {
        char data;
        Node next;
        Node(char d) { data = d; }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        // Step 1: Convert string to linked list
        Node head = buildLinkedList(input);

        // Step 2: Check palindrome using slow-fast pointer technique
        boolean isPalindrome = checkPalindrome(head);

        if (isPalindrome) {
            System.out.println("Palindrome (Linked List Method)");
        } else {
            System.out.println("Not Palindrome (Linked List Method)");
        }

        sc.close();
    }

    // Build linked list from string
    public static Node buildLinkedList(String s) {
        Node head = null, tail = null;

        for (char ch : s.toCharArray()) {
            Node newNode = new Node(ch);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    // Check palindrome using linked list
    public static boolean checkPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // Step 1: Find middle (slow-fast pointer)
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node secondHalf = reverse(slow.next);

        // Step 3: Compare first & second half
        Node left = head;
        Node right = secondHalf;

        while (right != null) {
            if (left.data != right.data) return false;
            left = left.next;
            right = right.next;
        }

        return true;
    }

    // Reverse Linked List
    public static Node reverse(Node head) {
        Node prev = null;
        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}