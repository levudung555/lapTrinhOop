
public class NhaKinhTe extends NgheNghiep {
    private String linhVucNghienCuu;

    public NhaKinhTe(String hoTen, int soNamKinhNghiem, String noiLamViec, String linhVucNghienCuu) {
        super(hoTen, soNamKinhNghiem, noiLamViec);
        this.linhVucNghienCuu = linhVucNghienCuu;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Lĩnh vực nghiên cứu: " + linhVucNghienCuu);
    }

    public String getLinhVucNghienCuu() {
        return linhVucNghienCuu;
    }

    public void setLinhVucNghienCuu(String linhVucNghienCuu) {
        this.linhVucNghienCuu = linhVucNghienCuu;
    }
}
