public class RecursionExample {
    public static void main(String[] args) {
        int result1 = factorial(5);
        System.out.println("Factorial of 5 is " + result1);
        int result2 = factorial(9);
        System.out.println("Factorial of 9 is " + result2);
    }

    static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
