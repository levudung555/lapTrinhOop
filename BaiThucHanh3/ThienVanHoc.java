
public class ThienVanHoc extends NgheNghiep {
    private String linhVucNghienCuu;
    private int soBaiBao;

    public ThienVanHoc(String hoTen, int soNamKinhNghiem, String noiLamViec,
                          String linhVucNghienCuu, int soBaiBao) {
        super(hoTen, soNamKinhNghiem, noiLamViec);
        this.linhVucNghienCuu = linhVucNghienCuu;
        this.soBaiBao = soBaiBao;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Lĩnh vực nghiên cứu: " + linhVucNghienCuu +
                ", Số bài báo: " + soBaiBao);
    }

    public String getLinhVucNghienCuu() {
        return linhVucNghienCuu;
    }

    public void setLinhVucNghienCuu(String linhVucNghienCuu) {
        this.linhVucNghienCuu = linhVucNghienCuu;
    }
}
