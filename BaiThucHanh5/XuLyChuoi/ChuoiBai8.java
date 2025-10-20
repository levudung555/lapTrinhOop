public class ChuoiBai8 {
    public static String cutWords(String str, int n) {
        str = str.trim().replaceAll("\\s+", " ");
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(n, words.length); i++) {
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "Tôi đang học lập trình hướng đối tượng";
        System.out.println("Cắt 3 từ đầu: " + cutWords(s, 3));
    }
}
