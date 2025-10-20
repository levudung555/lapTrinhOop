
public class LapTrinhVien extends NgheNghiep {
    private String ngonNguChinh;

    public LapTrinhVien(String hoTen, int soNamKinhNghiem, String noiLamViec, String ngonNguChinh) {
        super(hoTen, soNamKinhNghiem, noiLamViec);
        this.ngonNguChinh = ngonNguChinh;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Ngôn ngữ chính: " + ngonNguChinh);
    }

    public String getNgonNguChinh() {
        return ngonNguChinh;
    }

    public void setNgonNguChinh(String ngonNguChinh) {
        this.ngonNguChinh = ngonNguChinh;
    }
}
