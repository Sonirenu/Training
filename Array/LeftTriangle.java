package Array;

public class LeftTriangle {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};

        int[][] leftTriangleAddition = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = i; j < 2; j++) {
                leftTriangleAddition[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display Result
        System.out.println("Left Triangle Addition:");
        printMatrix(leftTriangleAddition);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}
