import java.util.*;

public class Bai2e {
    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // giá trị nhỏ để dễ kiểm tra
            }
        }
        return matrix;
    }

    // Tìm tất cả các submatrix có tổng = target
    public static void findSubMatrices(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int r1 = 0; r1 < rows; r1++) {
            for (int c1 = 0; c1 < cols; c1++) {
                for (int r2 = r1; r2 < rows; r2++) {
                    for (int c2 = c1; c2 < cols; c2++) {
                        int sum = 0;
                        for (int i = r1; i <= r2; i++) {
                            for (int j = c1; j <= c2; j++) {
                                sum += matrix[i][j];
                            }
                        }
                        if (sum == target) {
                            System.out.println("Submatrix từ (" + r1 + "," + c1 + ") đến (" + r2 + "," + c2 + ")");
                        }
                    }
                }
            }
        }
    }

    public static void printMatrix(int[][] M) {
        for (int[] row : M) System.out.println(Arrays.toString(row));
    }

    public static void main(String[] args) {
        int[][] mat = generateMatrix(3, 3);
        System.out.println("Mảng ban đầu:");
        printMatrix(mat);

        int target = 10;
        System.out.println("Các mảng con có tổng = " + target + ":");
        findSubMatrices(mat, target);
    }
}
