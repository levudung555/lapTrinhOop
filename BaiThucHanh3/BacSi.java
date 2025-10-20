
public class BacSi extends NgheNghiep {
    private String chuyenMon;

    public BacSi(String hoTen, int soNamKinhNghiem, String noiLamViec, String chuyenMon) {
        super(hoTen, soNamKinhNghiem, noiLamViec);
        this.chuyenMon = chuyenMon;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Chuyên môn: " + chuyenMon);
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }
}
