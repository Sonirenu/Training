public class Recursion {
    // Recursive method to print the Fibonacci series
    public static void FibonacciSeries(int a, int b, int count) {
        if (count > 0) {
            System.out.print(a + " ");
            FibonacciSeries(b, a + b, count - 1);
        }
    }

    public static void main(String[] args) {
        int count = 10; // Number of Fibonacci numbers to print
        System.out.print("Fibonacci Series: ");
        FibonacciSeries(0, 1, count); // Start with 0 and 1
    }
}

