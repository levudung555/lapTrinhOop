public class ChuoiBai5 {
    public static int countWordsBasic(String str) {
        str = str.trim().replaceAll("\\s+", " ");
        if (str.isEmpty()) return 0;
        return str.split(" ").length;
    }

    public static void main(String[] args) {
        String s = "   Hello   world   Java  ";
        System.out.println("Số từ: " + countWordsBasic(s));
    }
}
