
public class DienVienMua extends NgheNghiep {
    private String phongCach;

    public DienVienMua(String hoTen, int soNamKinhNghiem, String noiLamViec, String phongCach) {
        super(hoTen, soNamKinhNghiem, noiLamViec);
        this.phongCach = phongCach;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Phong cách múa: " + phongCach);
    }

    public void setPhongCach(String phongCach) {
        this.phongCach = phongCach;
    }

    public String getPhongCach() {
        return phongCach;
    }
}
