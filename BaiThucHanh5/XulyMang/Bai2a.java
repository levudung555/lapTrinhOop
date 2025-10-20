import java.util.*;

public class Bai2a {
    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(100); // giá trị 0-99
            }
        }
        return matrix;
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0) return false;
        return true;
    }

    public static int findMaxPrime(int[][] matrix) {
        int maxPrime = -1;
        for (int[] row : matrix) {
            for (int val : row) {
                if (isPrime(val) && val > maxPrime) {
                    maxPrime = val;
                }
            }
        }
        return maxPrime;
    }

    public static void main(String[] args) {
        int[][] mat = generateMatrix(4, 5);
        System.out.println("Mảng 2 chiều:");
        for (int[] row : mat) System.out.println(Arrays.toString(row));

        int maxP = findMaxPrime(mat);
        if (maxP != -1) System.out.println("Số nguyên tố lớn nhất: " + maxP);
        else System.out.println("Không có số nguyên tố trong mảng.");
    }
}
