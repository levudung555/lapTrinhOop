import java.util.*;

public class Bai1c {
    public static int[] generateArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = rand.nextInt(20);
        return arr;
    }

    public static void findSubArrays(int[] arr, int target) {
        int n = arr.length;
        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end];
                if (sum == target) {
                    System.out.print("Mảng con: [");
                    for (int k = start; k <= end; k++) {
                        System.out.print(arr[k] + (k < end ? "," : ""));
                    }
                    System.out.println("]");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = generateArray(10);
        System.out.println("Mảng: " + Arrays.toString(arr));
        int target = 15;
        findSubArrays(arr, target);
    }
}
