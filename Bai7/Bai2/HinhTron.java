import java.util.Random;

public class HinhTron {
    private float banKinh;

    // Phương thức nhập
    public void nhap() {
        Random random = new Random();
        banKinh = random.nextFloat() * 9 + 1; // Tạo bán kính ngẫu nhiên từ 1 đến 10
    }

    // Tính chu vi
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    // Tính diện tích
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    // In tiêu đề bảng (static vì dùng chung)
    public static void inTieuDe() {
        System.out.printf("%15s%20s%20s%n",
                "Bán kính", "Chu vi", "Diện tích");
    }

    // Xuất thông tin hình tròn
    public void xuat() {
        System.out.printf("%15.2f%20.2f%20.2f%n",
                banKinh, tinhChuVi(), tinhDienTich());
    }

    // Hàm main kiểm thử
    public static void main(String[] args) {
        HinhTron h = new HinhTron();
        h.nhap();
        HinhTron1.inTieuDe();
        h.xuat();
    }
}
