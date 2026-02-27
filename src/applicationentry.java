public class applicationentry {
    public static void main(String[] args) {

        // Original string with spaces and mixed case
        String input = "A man a plan a canal Panama";

        // Normalize the string
        // Remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Reverse the normalized string
        String reversed = "";

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed = reversed + normalized.charAt(i);
        }

        // Check palindrome
        if (normalized.equals(reversed)) {
            System.out.println("\"" + input + "\" is a Palindrome (ignoring spaces and case).");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }
    }
}



