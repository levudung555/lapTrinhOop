
public class NhaSuHoc extends NgheNghiep {
    private String thoiKyNghienCuu;

    public NhaSuHoc(String hoTen, int soNamKinhNghiem, String noiLamViec, String thoiKyNghienCuu) {
        super(hoTen, soNamKinhNghiem, noiLamViec);
        this.thoiKyNghienCuu = thoiKyNghienCuu;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Thời kỳ nghiên cứu: " + thoiKyNghienCuu);
    }

    public String getThoiKyNghienCuu() {
        return thoiKyNghienCuu;
    }

    public void setThoiKyNghienCuu(String thoiKyNghienCuu) {
        this.thoiKyNghienCuu = thoiKyNghienCuu;
    }
}

