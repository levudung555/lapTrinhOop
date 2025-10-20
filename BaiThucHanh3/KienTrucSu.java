
public class KienTrucSu extends NgheNghiep {
    private String chuyenNganh;

    public KienTrucSu(String hoTen, int soNamKinhNghiem, String noiLamViec, String chuyenNganh) {
        super(hoTen, soNamKinhNghiem, noiLamViec);
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Chuyên ngành: " + chuyenNganh);
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
}
