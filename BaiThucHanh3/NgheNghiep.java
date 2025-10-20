
public class NgheNghiep {
    protected String hoTen;
    protected int soNamKinhNghiem;
    protected String noiLamViec;

    public NgheNghiep(String hoTen, int soNamKinhNghiem, String noiLamViec) {
        this.hoTen = hoTen;
        this.soNamKinhNghiem = soNamKinhNghiem;
        this.noiLamViec = noiLamViec;
    }

    public void hienThiThongTin() {
        System.out.println("Họ tên: " + hoTen +
                ", Kinh nghiệm: " + soNamKinhNghiem + " năm" +
                ", Nơi làm việc: " + noiLamViec);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
}
