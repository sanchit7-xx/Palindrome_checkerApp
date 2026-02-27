import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
public class applicationentry {
    public static void main(String[] args) {
                // Original string
                String word = "level";

                // Create Queue and Stack
                Queue<Character> queue = new LinkedList<>();
                Stack<Character> stack = new Stack<>();

                // Insert characters into Queue and Stack
                for (int i = 0; i < word.length(); i++) {
                    char ch = word.charAt(i);
                    queue.add(ch);      // Enqueue
                    stack.push(ch);     // Push
                }

                boolean isPalindrome = true;

                // Compare dequeue from queue and pop from stack
                while (!queue.isEmpty()) {
                    if (queue.remove() != stack.pop()) {
                        isPalindrome = false;
                        break;
                    }
                }

                // Display result
                if (isPalindrome) {
                    System.out.println("The string \"" + word + "\" is a Palindrome.");
                } else {
                    System.out.println("The string \"" + word + "\" is NOT a Palindrome.");

            }
        }
}



