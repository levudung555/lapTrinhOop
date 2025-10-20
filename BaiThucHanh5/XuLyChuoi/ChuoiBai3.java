import java.util.*;

public class ChuoiBai3 {
    public static void countCharacters(String str) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String s = "HelloWorld";
        countCharacters(s);
    }
}
