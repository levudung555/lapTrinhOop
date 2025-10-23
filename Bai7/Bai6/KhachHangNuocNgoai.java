public class KhachHangNuocNgoai extends KhachHang {
    private String QuocTinh;

    public KhachHangNuocNgoai(String maHK, String hoTen, int ngay, int thang, int nam, double soLuong, double donGia, String QuocTich) {
        super(maHK, hoTen, ngay, thang, nam,soLuong, donGia);
        this.QuocTinh=QuocTich;
    }

    @Override
    public double ThanhTien() {
        return SoLuong*DonGia;
    }
}
