import java.util.*;

public class Bai1d {
    public static int[] generateArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = rand.nextInt(50) + 1;
        return arr;
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Cách 1: Dùng mảng tạm
    public static int[] rearrangePrimes(int[] arr, boolean asc) {
        List<Integer> primes = new ArrayList<>();
        List<Integer> nonPrimes = new ArrayList<>();

        for (int x : arr) {
            if (isPrime(x)) primes.add(x);
            else nonPrimes.add(x);
        }

        if (asc) {
            Collections.sort(primes);
            Collections.sort(nonPrimes);
        } else {
            Collections.sort(primes, Collections.reverseOrder());
            Collections.sort(nonPrimes, Collections.reverseOrder());
        }

        primes.addAll(nonPrimes);
        return primes.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = generateArray(12);
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));

        int[] newArr = rearrangePrimes(arr, true);
        System.out.println("Mảng sau khi đưa số nguyên tố lên đầu (tăng dần): " + Arrays.toString(newArr));
    }
}
