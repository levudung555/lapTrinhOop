public class ChuoiBai2 {
    public static int countSubstring(String text, String pattern) {
        int count = 0, idx = 0;
        while ((idx = text.indexOf(pattern, idx)) != -1) {
            count++;
            idx += pattern.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "abcababcababc";
        String sub = "ab";
        System.out.println("Chuỗi \"" + sub + "\" xuất hiện: " + countSubstring(text, sub) + " lần");
    }
}
