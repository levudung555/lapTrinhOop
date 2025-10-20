
public class GiangVien extends NgheNghiep {
    private String monGiangDay;

    public GiangVien(String hoTen, int soNamKinhNghiem, String noiLamViec, String monGiangDay) {
        super(hoTen, soNamKinhNghiem, noiLamViec);
        this.monGiangDay = monGiangDay;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Môn giảng dạy: " + monGiangDay);
    }

    public String getMonGiangDay() {
        return monGiangDay;
    }

    public void setMonGiangDay(String monGiangDay) {
        this.monGiangDay = monGiangDay;
    }
}
