
public class NhaSoanNhac extends NgheNghiep {
    private String theLoai;

    public NhaSoanNhac(String hoTen, int soNamKinhNghiem, String noiLamViec, String theLoai) {
        super(hoTen, soNamKinhNghiem, noiLamViec);
        this.theLoai = theLoai;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Thể loại sáng tác: " + theLoai);
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }
}
