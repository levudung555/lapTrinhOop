
public class DauBep extends NgheNghiep {
    private String monTieuBieu;

    public DauBep(String hoTen, int soNamKinhNghiem, String noiLamViec, String monTieuBieu) {
        super(hoTen, soNamKinhNghiem, noiLamViec);
        this.monTieuBieu = monTieuBieu;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Món tiêu biểu: " + monTieuBieu);
    }

    public void setMonTieuBieu(String monTieuBieu) {
        this.monTieuBieu = monTieuBieu;
    }

    public String getMonTieuBieu() {
        return monTieuBieu;
    }
}
