import java.util.Random;

public class PhuongTrinhBac2 {
    private float a, b, c;

    // Nhập ngẫu nhiên
    public void nhap() {
        Random random = new Random();
        a = random.nextFloat() * 10 - 5; // a ∈ [-5, 5)
        b = random.nextFloat() * 10 - 5;
        c = random.nextFloat() * 10 - 5;
    }

    // Tính delta
    public double tinhDelta() {
        return b * b - 4 * a * c;
    }

    // Giải phương trình
    public String giai() {
        if (a == 0) {
            if (b == 0)
                return (c == 0) ? "Vô số nghiệm" : "Vô nghiệm";
            else
                return String.format("x = %.2f", -c / b);
        }

        double delta = tinhDelta();
        if (delta < 0)
            return "Vô nghiệm";
        else if (delta == 0)
            return String.format("x = %.2f", -b / (2 * a));
        else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return String.format("x1 = %.2f, x2 = %.2f", x1, x2);
        }
    }

    // In tiêu đề bảng
    public static void inTieuDe() {
        System.out.printf("%10s%10s%10s%15s%30s%n",
                "a", "b", "c", "Δ (delta)", "Kết quả");
    }

    // Xuất thông tin phương trình
    public void xuat() {
        System.out.printf("%10.2f%10.2f%10.2f%15.2f%30s%n",
                a, b, c, tinhDelta(), giai());
    }

    // Hàm main để test
    public static void main(String[] args) {
        int n = 5; // số phương trình muốn tạo
        PhuongTrinhBac2[] ds = new PhuongTrinhBac2[n];

        for (int i = 0; i < n; i++) {
            ds[i] = new PhuongTrinhBac2();
            ds[i].nhap();
        }

        PhuongTrinhBac2.inTieuDe();
        for (int i = 0; i < n; i++) {
            ds[i].xuat();
        }
    }
}
