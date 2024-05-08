public class Arr1 {
        public static void main(String[] args) {
            int[] a = {4, 7, 10, 30, 15}; // Define the array

            System.out.println("Length of the array: " + a.length);

            for (int i = 1; i < a.length - 1; i++) {
                if (a[i] < a[i - 1] && a[i] < a[i + 1]) {
                    System.out.println("Valley element: " + a[i]);
                    break;
                }

            }
        }
    }


