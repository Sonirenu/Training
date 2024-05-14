package Task_Date_14;

public class Factorial {

    // Recursive method to calculate the factorial of a number
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Main method
    public static void main(String[] args) {
        int num = 5; // Example number
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
