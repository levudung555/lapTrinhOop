import java.util.*;

public class ChuoiBai1 {
    public static String removeSpecialChars(String str) {
        return str.replaceAll("[^a-zA-Z0-9\\s\\.!?]", "");
    }

    public static String removeExtraSpaces(String str) {
        return str.trim().replaceAll("\\s+", " ");
    }

    public static String normalizeName(String str) {
        str = removeExtraSpaces(str.toLowerCase());
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            if (!w.isEmpty())
                sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    public static String normalizeSentence(String str) {
        str = removeExtraSpaces(str);
        if (!str.isEmpty()) {
            str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
            if (!str.endsWith(".") && !str.endsWith("!") && !str.endsWith("?"))
                str += ".";
        }
        return str;
    }

    public static void main(String[] args) {
        String s1 = "   nguyen    van   a!!";
        System.out.println("Tên chuẩn hóa: " + normalizeName(s1));

        String s2 = "   toi dang hoc lap trinh   huong doi tuong";
        System.out.println("Câu chuẩn hóa: " + normalizeSentence(s2));
    }
}
