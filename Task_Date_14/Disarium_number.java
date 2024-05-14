package Task_Date_14;

//A Disarium number is a number defined as a number for which the sum of its digits each raised to the power of their
//respective positions is equal to the number itself. For example, 135 is a Disarium number

import java.util.Scanner;

public class Disarium_number{
      public static boolean check(int n)
        {
            int count_digits = Integer.toString(n).length();

            // Compute sum of terms like digit multiplied by
            // power of position
            int sum = 0; // Initialize sum of terms
            int x = n;
            while (x!=0)
            {
                // Get the rightmost digit
                int r = x%10;

                // Sum the digits by powering according to
                // the positions
                sum = (int) (sum + Math.pow(r, count_digits--));
                x = x/10;
            }

            // If sum is same as number, then number is
            return (sum == n);
        }

        // Driver method
        public static void main(String[] args)
        {
           // int n = 135;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number : ");
             int n=sc.nextInt();
            System.out.println(check(n) ? "Disarium Number" : "Not a Disarium Number");
        }
    }

