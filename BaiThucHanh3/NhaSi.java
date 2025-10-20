
public class NhaSi extends NgheNghiep {
    private String chuyenKhoa;

    public NhaSi(String hoTen, int soNamKinhNghiem, String noiLamViec, String chuyenKhoa) {
        super(hoTen, soNamKinhNghiem, noiLamViec);
        this.chuyenKhoa = chuyenKhoa;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Chuyên khoa: " + chuyenKhoa);
    }

    public String getChuyenKhoa() {
        return chuyenKhoa;
    }

    public void setChuyenKhoa(String chuyenKhoa) {
        this.chuyenKhoa = chuyenKhoa;
    }
}
