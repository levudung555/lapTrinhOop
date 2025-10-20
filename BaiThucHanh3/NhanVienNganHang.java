
public class NhanVienNganHang extends NgheNghiep {
    private String chucVu;

    public NhanVienNganHang(String hoTen, int soNamKinhNghiem, String noiLamViec, String chucVu) {
        super(hoTen, soNamKinhNghiem, noiLamViec);
        this.chucVu = chucVu;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Chức vụ: " + chucVu);
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
}
