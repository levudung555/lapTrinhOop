import java.util.Arrays;
import java.util.Random;

public class Bai1a {
    // Sinh mảng ngẫu nhiên và sắp xếp
    public static int[] generateArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100); // giá trị 0-99
        }
        Arrays.sort(arr);
        return arr;
    }

    // Tìm kiếm nhị phân
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        return -1; // không tìm thấy
    }

    public static void main(String[] args) {
        int[] arr = generateArray(10);
        System.out.println("Mảng: " + Arrays.toString(arr));

        int key = 25;
        int pos = binarySearch(arr, key);
        if (pos != -1) System.out.println("Tìm thấy " + key + " tại vị trí " + pos);
        else System.out.println("Không tìm thấy " + key);
    }
}
