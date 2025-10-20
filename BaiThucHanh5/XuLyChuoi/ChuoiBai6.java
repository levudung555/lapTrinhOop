public class ChuoiBai6 {
    public static String capitalizeWords(String str) {
        str = str.trim().replaceAll("\\s+", " ").toLowerCase();
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "nguyen van abc";
        System.out.println("Kết quả: " + capitalizeWords(s));
    }
}
