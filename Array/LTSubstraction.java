package Array;

public class LTSubstraction {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};

        int[][] leftTriangleSubtraction = subtractLeftTriangle(matrix1, matrix2);

        // Display Result
        System.out.println("Left Triangle Subtraction:");
        printMatrix(leftTriangleSubtraction);
    }

    public static int[][] subtractLeftTriangle(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = i; j < 2; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
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
