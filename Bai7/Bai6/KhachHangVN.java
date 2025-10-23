public  class KhachHangVN extends KhachHang {
    private String DoiTuongKhacHang;
    private double DinhMuc ;

    public KhachHangVN(String maHK, String hoTen, int ngay, int thang, int nam,  double soLuong , double donGia,String DoiTuongKH , Double DinhMuc) {
        super(maHK, hoTen, ngay, thang, nam , soLuong, donGia);
        this.DoiTuongKhacHang=DoiTuongKH;
        this.DinhMuc=DinhMuc;
    }

    @Override
    public double ThanhTien() {
        if(SoLuong <= DinhMuc) return SoLuong *DonGia;
        else return SoLuong*DonGia*DinhMuc+(SoLuong-DinhMuc)*DonGia*2.5;
    }
}
