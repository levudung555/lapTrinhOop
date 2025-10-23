public class NhanVienVP extends NhanVien {
    private double MucLuong ;
    private int NgayNghi;

    public NhanVienVP( String tenNV, int namVaoLam,double mucLuong,int ngayNghi) {
        super( tenNV, namVaoLam);
        this.MucLuong=mucLuong;
        this.NgayNghi=ngayNghi;
    }

    @Override
    public double LuongNV() {
        return MucLuong-(float)NgayNghi *10000;
    }
}
