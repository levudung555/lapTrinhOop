public class NhanVienSX extends NhanVien{
    private int SanPham;
    public NhanVienSX( String tenNV, int namVaoLam,int SanPham) {
        super( tenNV, namVaoLam);
        this.SanPham=SanPham;
    }

    @Override
    public double LuongNV() {
        return SanPham *10000;
    }
}
