import java.util.Deque;
import java.util.LinkedList;
public class applicationentry {



        public static void main(String[] args) {

            // Original string
            String word = "radar";

            // Create a Deque
            Deque<Character> deque = new LinkedList<>();

            // Insert characters into deque
            for (int i = 0; i < word.length(); i++) {
                deque.addLast(word.charAt(i));
            }

            boolean isPalindrome = true;

            // Compare front and rear elements
            while (deque.size() > 1) {

                char front = deque.removeFirst();
                char rear = deque.removeLast();

                if (front != rear) {
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



