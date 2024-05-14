package Task_Date_14;

import java.util.Scanner;

public class PrimeNumber {

    // Recursive method to check if a number is prime
    public static boolean isPrime(int num, int divisor) {
        // Base cases
        if (num <= 1) {
            return false;
        }
        if (divisor == 1) {
            return true;
        }

        // Check if num is divisible by divisor
        if (num % divisor == 0) {
            return false;
        }

        // Recursive case: Check the next divisor
        return isPrime(num, divisor - 1);
    }

    // Main method
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        if (isPrime(number, number / 2)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
