
public class ThuNgan extends NgheNghiep {
    private int caLam;

    public ThuNgan(String hoTen, int soNamKinhNghiem, String noiLamViec, int caLam) {
        super(hoTen, soNamKinhNghiem, noiLamViec);
        this.caLam = caLam;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Ca làm: " + caLam);
    }

    public int getCaLam() {
        return caLam;
    }

    public void setCaLam(int caLam) {
        this.caLam = caLam;
    }
}
