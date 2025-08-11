public class CompareStrings {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        // Compare memory addresses
        boolean result1 = (s1 == s2);
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s1 == s2: " + result1);

        // New memory address
        String s3 = new String("Hello");
        boolean result2 = (s1 == s3);

        System.out.println("s1: " + s1);
        System.out.println("s3: " + s3);
        System.out.println("s1 == s3: " + result2);

        // Compare string content
        boolean result3 = s1.equals(s3);
        System.out.println("s1 == s3 using .equals: " + result3);

        // Compare strings using ignore case
        String s4 = new String("hello");
        System.out.println("s4: " + s4);
        boolean result4 = s4.equalsIgnoreCase(s1);
        System.out.println("s4.equalsIgnoreCase(s1): " + result4);
    }
}
