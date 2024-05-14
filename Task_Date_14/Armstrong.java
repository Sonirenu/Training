package Task_Date_14;
import java.util.Scanner;

public class Armstrong {

    // Recursive method to calculate the power of a number
    public static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else {
            return base * power(base, exp - 1);
        }
    }

    // Recursive method to count the number of digits in a number
    public static int countDigits(int num) {
        if (num == 0) {
            return 0;
        } else {
            return 1 + countDigits(num / 10);
        }
    }

    // Recursive method to calculate the sum of digits each raised to the power of the number of digits
    public static int calculateSum(int num, int numDigits) {
        if (num == 0) {
            return 0;
        } else {
            int digit = num % 10;
            return power(digit, numDigits) + calculateSum(num / 10, numDigits);
        }
    }

    // Recursive method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int numDigits = countDigits(num);
        int sum = calculateSum(num, numDigits);
        return sum == num;
    }

    // Main method
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        if (isArmstrong(number))
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
