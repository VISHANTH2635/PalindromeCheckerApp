import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static boolean arrayPalindrome(String input) {
        char[] arr = input.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean stackPalindrome(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static boolean dequePalindrome(String input) {
        Deque<Character> deque = new LinkedList<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        long start1 = System.nanoTime();
        boolean result1 = arrayPalindrome(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = stackPalindrome(input);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        boolean result3 = dequePalindrome(input);
        long end3 = System.nanoTime();

        System.out.println("Array Method Result: " + result1 + " Time: " + (end1 - start1) + " ns");
        System.out.println("Stack Method Result: " + result2 + " Time: " + (end2 - start2) + " ns");
        System.out.println("Deque Method Result: " + result3 + " Time: " + (end3 - start3) + " ns");

        sc.close();
    }
}