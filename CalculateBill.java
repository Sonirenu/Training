import java.util.*;
public class CalculateBill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the units consumed: ");
        double units = scanner.nextDouble();

        double rate1 = 2.00;
        double rate2 = 3.00;
        double rate3 = 4.00;

        int limit1 = 100;
        int limit2 = 150;
        int limit3 = 200;

        double bill = (units <= limit1) ? (units * rate1) :
                (units <= limit2) ? ((limit1 * rate1) + ((units - limit1) * rate2)) :
                        ((limit1 * rate1) + ((limit2 - limit1) * rate2) + ((units - limit2) * rate3));

        System.out.println("Electricity Bill: " + bill);

        scanner.close();
    }

}
