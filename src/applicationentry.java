public class applicationentry {

    // Method 1: Reverse String Method
    public static boolean reverseMethod(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        return str.equals(reversed);
    }

    // Method 2: Two Pointer Method
    public static boolean twoPointerMethod(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "racecar";

        // Measure reverse method performance
        long startTime1 = System.nanoTime();
        boolean result1 = reverseMethod(word);
        long endTime1 = System.nanoTime();

        // Measure two pointer method performance
        long startTime2 = System.nanoTime();
        boolean result2 = twoPointerMethod(word);
        long endTime2 = System.nanoTime();

        // Display results
        System.out.println("Reverse Method Result: " + result1);
        System.out.println("Execution Time (Reverse Method): " + (endTime1 - startTime1) + " ns");

        System.out.println();

        System.out.println("Two Pointer Method Result: " + result2);
        System.out.println("Execution Time (Two Pointer Method): " + (endTime2 - startTime2) + " ns");
    }
}