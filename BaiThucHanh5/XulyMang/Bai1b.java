import java.util.Arrays;
import java.util.Random;

public class Bai1b {
    public static int[] generateSortedArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = rand.nextInt(100);
        Arrays.sort(arr);
        return arr;
    }

    public static int[] insertValue(int[] arr, int value) {
        int[] newArr = new int[arr.length + 1];
        int i = 0, j = 0;
        while (i < arr.length && arr[i] < value) {
            newArr[j++] = arr[i++];
        }
        newArr[j++] = value;
        while (i < arr.length) {
            newArr[j++] = arr[i++];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = generateSortedArray(8);
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));

        int value = 45;
        int[] newArr = insertValue(arr, value);
        System.out.println("Mảng sau khi chèn " + value + ": " + Arrays.toString(newArr));
    }
}
