import java.util.*;

// UC13: Performance Comparison

class PalindromePerformance {

    public static boolean checkUsingStack(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) stack.push(c);
        for (char c : s.toCharArray()) if (c != stack.pop()) return false;

        return true;
    }

    public static boolean checkUsingDeque(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new LinkedList<>();

        for (char c : s.toCharArray()) deque.addLast(c);
        while (deque.size() > 1)
            if (deque.removeFirst() != deque.removeLast()) return false;

        return true;
    }

    public static boolean checkUsingTwoPointer(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while (left < right)
            if (s.charAt(left++) != s.charAt(right--)) return false;

        return true;
    }
}

// MAIN UC13 EXECUTION
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any text for performance check: ");
        String input = sc.nextLine();

        System.out.println("\n--- UC13: Performance Comparison ---");

        long start, end;

        // STACK
        start = System.nanoTime();
        boolean stackResult = PalindromePerformance.checkUsingStack(input);
        end = System.nanoTime();
        long stackTime = end - start;

        // DEQUE
        start = System.nanoTime();
        boolean dequeResult = PalindromePerformance.checkUsingDeque(input);
        end = System.nanoTime();
        long dequeTime = end - start;

        // TWO POINTER
        start = System.nanoTime();
        boolean tpResult = PalindromePerformance.checkUsingTwoPointer(input);
        end = System.nanoTime();
        long tpTime = end - start;

        System.out.println("\nResults:");
        System.out.println("Stack Method          : " + stackResult + " | Time: " + stackTime + " ns");
        System.out.println("Deque Method          : " + dequeResult + " | Time: " + dequeTime + " ns");
        System.out.println("Two Pointer Method    : " + tpResult + " | Time: " + tpTime + " ns");

        System.out.println("\nFastest Method: " +
                (tpTime < dequeTime && tpTime < stackTime ? "Two Pointer" :
                        (dequeTime < stackTime ? "Deque" : "Stack")));

        sc.close();
    }
}