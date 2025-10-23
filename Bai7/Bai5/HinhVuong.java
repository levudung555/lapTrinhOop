public class HinhVuong extends HinhPhang {
    private double canh;

    public HinhVuong(double canh) {
        super("Hình Vuông");
        this.canh = canh;
    }

    @Override
    public double tinhChuVi() {
        return 4 * canh;
    }

    @Override
    public double tinhDienTich() {
        return canh * canh;
    }
}
