public abstract class HinhPhang {
    protected String tenHinh;

    public HinhPhang(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    // Phương thức trừu tượng: không có thân hàm
    public abstract double tinhChuVi();
    public abstract double tinhDienTich();

    // Phương thức thường (có thân hàm)
    public void inThongTin() {
        System.out.printf("%-15s%-20.2f%-20.2f%n",
                tenHinh, tinhChuVi(), tinhDienTich());
    }

    // In tiêu đề bảng
    public static void inTieuDe() {
        System.out.printf("%-15s%-20s%-20s%n",
                "Tên hình", "Chu vi", "Diện tích");
        System.out.println("-----------------------------------------------------");
    }
}
