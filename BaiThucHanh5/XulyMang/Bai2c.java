import java.util.*;

public class Bai2c {
    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(50);
            }
        }
        return matrix;
    }

    // Cách 1: Shallow copy (copy tham chiếu hàng)
    public static int[][] shallowCopy(int[][] matrix) {
        return matrix.clone();
    }

    // Cách 2: Deep copy (copy từng phần tử)
    public static int[][] deepCopy(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] copy = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            copy[i] = matrix[i].clone();
        }
        return copy;
    }

    public static void printMatrix(int[][] M) {
        for (int[] row : M) System.out.println(Arrays.toString(row));
    }

    public static void main(String[] args) {
        int[][] mat = generateMatrix(3, 4);
        System.out.println("Mảng gốc:");
        printMatrix(mat);

        int[][] shallow = shallowCopy(mat);
        int[][] deep = deepCopy(mat);

        // Thay đổi để thấy sự khác biệt
        mat[0][0] = 999;

        System.out.println("Shallow copy (ảnh hưởng khi thay đổi mảng gốc):");
        printMatrix(shallow);

        System.out.println("Deep copy (không ảnh hưởng):");
        printMatrix(deep);
    }
}
