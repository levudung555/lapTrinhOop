public class HinhTron1 extends HinhPhang {
    private double banKinh;

    public HinhTron1(double banKinh) {
        super("Hình Tròn");
        this.banKinh = banKinh;
    }

    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }
}
