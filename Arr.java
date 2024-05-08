public class Arr {
    public static void main(String[] args) {
        int[] a = {4, 7, 10, 30, 15}; // Define the array

        // Print the length of the array
        System.out.println("Length of the array: " + a.length);

        // Iterate over the array to find the peak element
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                System.out.println("Peak element: " + a[i]);
                break;
            }
        }
    }
}
