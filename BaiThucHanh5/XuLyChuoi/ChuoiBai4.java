import java.util.*;

public class ChuoiBai4 {
    public static void findMostFrequentChars(String str) {
        Map<Character, Integer> freq = new HashMap<>();
        int maxFreq = 0;

        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(c));
        }

        System.out.print("Ký tự xuất hiện nhiều nhất: ");
        for (Map.Entry<Character, Integer> e : freq.entrySet()) {
            if (e.getValue() == maxFreq) System.out.print(e.getKey() + " ");
        }
        System.out.println(" (tần suất = " + maxFreq + ")");
    }

    public static void main(String[] args) {
        findMostFrequentChars("everybody");
    }
}
