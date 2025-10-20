import java.util.*;

public class Bai2b {
    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // giá trị nhỏ cho dễ quan sát
            }
        }
        return matrix;
    }

    // Nhân ma trận chuẩn (A[m][n] * B[n][p] = C[m][p])
    public static int[][] multiplyMatrix(int[][] A, int[][] B) {
        int m = A.length;
        int n = A[0].length;
        int p = B[0].length;
        int[][] C = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    public static void printMatrix(int[][] M) {
        for (int[] row : M) System.out.println(Arrays.toString(row));
    }

    public static void main(String[] args) {
        int[][] A = generateMatrix(2, 3);
        int[][] B = generateMatrix(3, 2);

        System.out.println("Ma trận A:");
        printMatrix(A);
        System.out.println("Ma trận B:");
        printMatrix(B);

        int[][] C = multiplyMatrix(A, B);
        System.out.println("Kết quả A * B:");
        printMatrix(C);
    }
}
