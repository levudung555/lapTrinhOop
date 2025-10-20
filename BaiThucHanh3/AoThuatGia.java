
public class AoThuatGia extends NgheNghiep {
    private String phongCach;

    public AoThuatGia(String hoTen, int soNamKinhNghiem, String noiLamViec, String phongCach) {
        super(hoTen, soNamKinhNghiem, noiLamViec);
        this.phongCach = phongCach;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Phong cách biểu diễn: " + phongCach);
    }
}
