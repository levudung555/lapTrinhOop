
public class KiemToanVien extends NgheNghiep {
    private String congTyKiemToan;
    private String chungChi;

    public KiemToanVien(String hoTen, int soNamKinhNghiem, String noiLamViec,
                        String congTyKiemToan, String chungChi) {
        super(hoTen, soNamKinhNghiem, noiLamViec);
        this.congTyKiemToan = congTyKiemToan;
        this.chungChi = chungChi;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Công ty kiểm toán: " + congTyKiemToan +
                ", Chứng chỉ: " + chungChi);
    }

    public String getCongTyKiemToan() {
        return congTyKiemToan;
    }

    public void setCongTyKiemToan(String congTyKiemToan) {
        this.congTyKiemToan = congTyKiemToan;
    }
}
