import java.util.*;

public class Bai2d {
    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(100);
            }
        }
        return matrix;
    }

    // Cách 1: Chuyển về mảng 1 chiều để sắp xếp
    public static int[][] sortByFlatten(int[][] matrix, boolean asc) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] temp = new int[rows * cols];
        int idx = 0;

        for (int[] row : matrix) for (int val : row) temp[idx++] = val;

        Arrays.sort(temp);
        if (!asc) {
            for (int i = 0; i < temp.length / 2; i++) {
                int tmp = temp[i];
                temp[i] = temp[temp.length - 1 - i];
                temp[temp.length - 1 - i] = tmp;
            }
        }

        idx = 0;
        int[][] sorted = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                sorted[i][j] = temp[idx++];

        return sorted;
    }

    public static void printMatrix(int[][] M) {
        for (int[] row : M) System.out.println(Arrays.toString(row));
    }

    public static void main(String[] args) {
        int[][] mat = generateMatrix(3, 4);
        System.out.println("Mảng ban đầu:");
        printMatrix(mat);

        int[][] sortedAsc = sortByFlatten(mat, true);
        System.out.println("Mảng sau khi sắp xếp tăng dần:");
        printMatrix(sortedAsc);

        int[][] sortedDesc = sortByFlatten(mat, false);
        System.out.println("Mảng sau khi sắp xếp giảm dần:");
        printMatrix(sortedDesc);
    }
}
