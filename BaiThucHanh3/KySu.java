
public class KySu extends NgheNghiep {
    private String linhVuc;

    public KySu(String hoTen, int soNamKinhNghiem, String noiLamViec, String linhVuc) {
        super(hoTen, soNamKinhNghiem, noiLamViec);
        this.linhVuc = linhVuc;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Lĩnh vực kỹ sư: " + linhVuc);
    }

    public String getLinhVuc() {
        return linhVuc;
    }

    public void setLinhVuc(String linhVuc) {
        this.linhVuc = linhVuc;
    }
}
