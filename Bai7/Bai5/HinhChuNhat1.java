public class HinhChuNhat1 extends HinhPhang {
    private double dai, rong;

    public HinhChuNhat1(double dai, double rong) {
        super("Hình Chữ Nhật");
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    public double tinhChuVi() {
        return 2 * (dai + rong);
    }

    @Override
    public double tinhDienTich() {
        return dai * rong;
    }
}
