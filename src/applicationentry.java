public class applicationentry {
    public static void main(String[] args) {

        // Display application details
        System.out.println("====================================");
        System.out.println("     PALINDROME CHECKER APP");
        System.out.println("====================================");

        // Application information
        System.out.println("Application Name  : Palindrome Checker");
        System.out.println("Application Version : 1.0");

        System.out.println("------------------------------------");
        System.out.println("Welcome to the Palindrome Checker Application!");
        System.out.println("This program will help you check whether a word");
        System.out.println("or number is a palindrome.");
        System.out.println("------------------------------------");

        // Flow control message
        System.out.println("Program is ready to continue to the next use case...");
    }

    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Reverse the string
        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome using if-else
        if(word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        }
        else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program execution completed.");
    }
}

