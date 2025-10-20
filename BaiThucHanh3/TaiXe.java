
public class TaiXe extends NgheNghiep {
    private String loaiBangLai;

    public TaiXe(String hoTen, int soNamKinhNghiem, String noiLamViec, String loaiBangLai) {
        super(hoTen, soNamKinhNghiem, noiLamViec);
        this.loaiBangLai = loaiBangLai;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Loại bằng lái: " + loaiBangLai);
    }

    public String getLoaiBangLai() {
        return loaiBangLai;
    }

    public void setLoaiBangLai(String loaiBangLai) {
        this.loaiBangLai = loaiBangLai;
    }
}
