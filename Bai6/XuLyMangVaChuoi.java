import java.util.*;
import java.util.stream.*;

public class XuLyMangVaChuoi {

    // ===== 1.1 Đảo ngược mảng =====
    public static void daoNguocMang_String() {
        String[] array = {"A", "B", "C", "D", "E"};
        Collections.reverse(Arrays.asList(array));
        System.out.println("Đảo ngược (Collections.reverse): " + Arrays.toString(array));

        String[] arr2 = {"A", "B", "C", "D", "E"};
        for (int i = 0; i < arr2.length / 2; i++) {
            String temp = arr2[i];
            arr2[i] = arr2[arr2.length - 1 - i];
            arr2[arr2.length - 1 - i] = temp;
        }
        System.out.println("Đảo ngược (for): " + Arrays.toString(arr2));

        String[] arr3 = {"A","B","C","D","E"};
        Object[] reversedArr = IntStream.rangeClosed(1, arr3.length)
                .mapToObj(i -> arr3[arr3.length - i])
                .toArray();
        System.out.println("Đảo ngược (Stream): " + Arrays.toString(reversedArr));
    }

    // ===== 1.2 So sánh hai mảng =====
    public static boolean checkEqualArrays(String[] a1, String[] a2) {
        if (a1 == a2) return true;
        if (a1 == null || a2 == null) return false;
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals(a2[i])) return false;
        }
        return true;
    }

    public static boolean checkEqualityWithStream(String[] a1, String[] a2) {
        if (a1 == a2) return true;
        if (a1 == null || a2 == null || a1.length != a2.length) return false;
        return IntStream.range(0, a1.length)
                .allMatch(i -> a1[i].equals(a2[i]));
    }

    // ===== 1.3 Nối hai mảng =====
    public static void noiMang() {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6};

        // Cách 1: dùng vòng lặp
        int[] result1 = new int[a1.length + a2.length];
        int index = 0;
        for (int x : a1) result1[index++] = x;
        for (int x : a2) result1[index++] = x;
        System.out.println("Nối mảng (for): " + Arrays.toString(result1));

        // Cách 2: dùng System.arraycopy
        int[] result2 = new int[a1.length + a2.length];
        System.arraycopy(a1, 0, result2, 0, a1.length);
        System.arraycopy(a2, 0, result2, a1.length, a2.length);
        System.out.println("Nối mảng (arraycopy): " + Arrays.toString(result2));

        // Cách 3: dùng Stream
        int[] result3 = IntStream.concat(Arrays.stream(a1), Arrays.stream(a2)).toArray();
        System.out.println("Nối mảng (Stream): " + Arrays.toString(result3));
    }

    // ===== 1.4 Xóa phần tử trong mảng =====
    static <Type> void removeIndexAndShift(Type[] array, int indexToRemove) {
        for (int i = indexToRemove; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = null;
    }

    // ===== 1.5 Kiểm tra phần tử trong mảng =====
    public static void kiemTraPhanTu() {
        String[] fruits = {"banana", "guava", "apple", "cheeku"};
        System.out.println("Chứa 'apple'? " + Arrays.asList(fruits).contains("apple"));
        System.out.println("Chứa 'lion'? " + Arrays.asList(fruits).contains("lion"));
    }

    // ===== 2.1 Đảo ngược chuỗi =====
    public static String reverseStringRecursive(String str) {
        if (str.isEmpty()) return str;
        return reverseStringRecursive(str.substring(1)) + str.charAt(0);
    }

    public static void daoNguocChuoi() {
        String blogName = "Kỹ thuật đảo ngược ký tự trong chuỗi";
        String reversed = new StringBuilder(blogName).reverse().toString();
        System.out.println("Đảo chuỗi: " + reversed);
    }

    // ===== 2.2 Loại bỏ khoảng trắng thừa =====
    public static void xoaKhoangTrangThua() {
        String str = "Kỹ   thuật     đảo   ngược   ký   tự   trong   chuỗi";
        String clean = str.replaceAll("\\s+", " ");
        System.out.println("Xóa khoảng trắng thừa: " + clean);
    }

    // ===== 2.3 Đảo ngược các từ trong chuỗi =====
    public static void daoNguocTuTrongChuoi() {
        String str = "Kỹ thuật đảo ngược các từ trong chuỗi";
        StringTokenizer tokenizer = new StringTokenizer(str, " ");
        Stack<String> stack = new Stack<>();
        while (tokenizer.hasMoreTokens()) stack.push(tokenizer.nextToken());
        StringBuilder reversed = new StringBuilder();
        while (!stack.empty()) reversed.append(stack.pop()).append(" ");
        System.out.println("Đảo ngược từ: " + reversed.toString().trim());
    }

    // ===== MAIN =====
    public static void main(String[] args) {
        System.out.println("=== 1. XỬ LÝ MẢNG ===");
        daoNguocMang_String();

        String[] a1 = {"A", "B", "C"};
        String[] a2 = {"A", "B", "C"};
        System.out.println("So sánh mảng equals(): " + Arrays.equals(a1, a2));
        System.out.println("So sánh mảng (tự viết): " + checkEqualArrays(a1, a2));
        System.out.println("So sánh mảng (stream): " + checkEqualityWithStream(a1, a2));

        noiMang();

        Integer[] numbers = {0,1,2,3,4,5,6,7,8,9};
        removeIndexAndShift(numbers, 6);
        System.out.println("Sau khi xóa index 6: " + Arrays.toString(numbers));

        kiemTraPhanTu();

        System.out.println("\n=== 2. XỬ LÝ CHUỖI ===");
        System.out.println("Đệ quy đảo chuỗi: " + reverseStringRecursive("ABCDEF"));
        daoNguocChuoi();
        xoaKhoangTrangThua();
        daoNguocTuTrongChuoi();
    }
}
