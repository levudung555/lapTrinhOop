public class ChuoiBai7 {
    public static String normalize(String str) {
        return str.trim().replaceAll("\\s+", " ").toLowerCase();
    }

    public static double similarity(String s1, String s2) {
        s1 = normalize(s1);
        s2 = normalize(s2);
        int minLen = Math.min(s1.length(), s2.length());
        int match = 0;
        for (int i = 0; i < minLen; i++) {
            if (s1.charAt(i) == s2.charAt(i)) match++;
        }
        return (double) match / Math.max(s1.length(), s2.length()) * 100;
    }

    public static void main(String[] args) {
        String s1 = "Hello world";
        String s2 = "hello worlD!";
        System.out.println("Độ giống nhau: " + similarity(s1, s2) + "%");
    }
}
