import java.util.Scanner;

public class Bai15 {

    // 15.1
    public static void bai151() {
        int x = 5, y = 7, z;
        z = x++ + y;
        System.out.println("z = " + z + ", x = " + x);
    }

    // 15.2
    public static void bai152() {
        int count = 12;
        if (count > 10) {
            System.out.println("Count is greater than 10");
        }
    }

    // 15.3
    public static void bai153() {
        int x = 10, total = 50;
        total -= --x;
        System.out.println("total = " + total + ", x = " + x);
    }

    // 15.4
    public static void bai154() {
        int q = 17, d = 5;
        q %= d;
        System.out.println("q = " + q);
    }

    // 15.5, 15.6, 15.7
    public static void bai155_157() {
        int sum = 0, x = 5;
        sum += x;
        System.out.println("The sum is " + sum);
    }

    // 15.8
    public static void bai158() {
        int sumEven = 0;
        for (int i = 2; i <= 98; i += 2) sumEven += i;
        System.out.println("Sum of even numbers = " + sumEven);
    }

    // 15.9
    public static void bai159(int n) {
        if (n > 0) System.out.println("Số dương");
        else if (n < 0) System.out.println("Số âm");
        else System.out.println("Số không");
    }

    // 15.10
    public static void bai1510(int day) {
        switch (day) {
            case 1: System.out.println("Chủ nhật"); break;
            case 2: System.out.println("Thứ Hai"); break;
            case 3: System.out.println("Thứ Ba"); break;
            case 4: System.out.println("Thứ Tư"); break;
            case 5: System.out.println("Thứ Năm"); break;
            case 6: System.out.println("Thứ Sáu"); break;
            case 7: System.out.println("Thứ Bảy"); break;
            default: System.out.println("Số không hợp lệ");
        }
    }

    // 15.11
    public static void bai1511(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.println("Tổng từ 1 đến " + n + " = " + sum);
    }

    // 15.12
    public static void bai1512(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println("Năm nhuận");
        else
            System.out.println("Không phải năm nhuận");
    }

    // 15.13
    public static void bai1513(double a, double b, double c) {
        double delta = b*b - 4*a*c;
        if (delta < 0) System.out.println("Vô nghiệm");
        else if (delta == 0) System.out.println("Nghiệm kép: x = " + (-b / (2*a)));
        else {
            double x1 = (-b + Math.sqrt(delta)) / (2*a);
            double x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
    }

    // 15.14
    public static void bai1514(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        System.out.println(n + "! = " + fact);
    }

    // 15.15
    public static void bai1515(int a, int b) {
        int x = a, y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        System.out.println("UCLN của " + a + " và " + b + " = " + x);
    }

    // 15.16
    public static void bai1516(int n) {
        boolean isPrime = true;
        if (n < 2) isPrime = false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(n + (isPrime ? " là số nguyên tố" : " không phải số nguyên tố"));
    }

    // 15.17
    public static void bai1517() {
        double a = 5, b = 7, h = 4, r = 3;
        double S1 = 0.5 * a * h;
        double S2 = (a + b) * h / 2;
        double S3 = Math.PI * r * r;

        System.out.println("Diện tích tam giác = " + S1);
        System.out.println("Diện tích hình thang = " + S2);
        System.out.println("Diện tích hình tròn = " + S3);
    }

    // MAIN
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Gọi thử một số bài
        bai151();
        bai152();
        bai153();
        bai154();
        bai155_157();
        bai158();
        bai159(-5);
        bai1510(3);
        bai1511(10);
        bai1512(2024);
        bai1513(1, -3, 2); // x^2 - 3x + 2 = 0
        bai1514(5);
        bai1515(36, 60);
        bai1516(17);
        bai1517();
    }
}
