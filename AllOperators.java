public class AllOperators {
    public static void main(String[] args) {
        // Arithmetic operators
        int a = 10;
        int b = 5;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Assignment operators
        int c = 20;
        c += 5; // equivalent to c = c + 5;
        System.out.println("Value of c after += operation: " + c);

        // Relational operators
        boolean isEqual = a == b;
        boolean isNotEqual = a != b;
        boolean isGreater = a > b;
        boolean isLess = a < b;
        boolean isGreaterOrEqual = a >= b;
        boolean isLessOrEqual = a <= b;
        System.out.println("Is a equal to b? " + isEqual);
        System.out.println("Is a not equal to b? " + isNotEqual);
        System.out.println("Is a greater than b? " + isGreater);
        System.out.println("Is a less than b? " + isLess);
        System.out.println("Is a greater than or equal to b? " + isGreaterOrEqual);
        System.out.println("Is a less than or equal to b? " + isLessOrEqual);

        // Logical operators
        boolean x = true;
        boolean y = false;
        boolean andResult = x && y;
        boolean orResult = x || y;
        boolean notResult = !x;
        System.out.println("x && y: " + andResult);
        System.out.println("x || y: " + orResult);
        System.out.println("!x: " + notResult);

        // Increment and Decrement operators
        int num = 10;
        num++; // Increment
        System.out.println("After increment: " + num);
        num--; // Decrement
        System.out.println("After decrement: " + num);

        // Conditional or Ternary operator
        int m = 5;
        int n = 10;
        int max = (m > n) ? m : n;
        System.out.println("Max value: " + max);
    }
}
