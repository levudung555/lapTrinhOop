import java.security.ProtectionDomain;

public abstract class KhachHang {
    protected String MaHK,HoTen;
    protected int  ngay , thang , nam;
    protected  double SoLuong, DonGia;

    public KhachHang(String maHK , String hoTen, int ngay, int thang, int nam,double soLuong, double donGia) {
        MaHK = maHK;
        SoLuong = soLuong;
        HoTen = hoTen;
        this.ngay = ngay;
        this.nam = nam;
        this.thang = thang;
        DonGia = donGia;
    }
    public abstract double ThanhTien();
    public static void InTieuDe(){
        System.out.printf("%-15s%-20s%-15s%-15s%-15s%-15s%-15s%-15s%n", "Mã KH ", "HoTen","Ngay","Thang","Nam","SoLuong","DonGia","ThanhTien");
    }
    public  void Xuat(){
        System.out.printf("%-15s%-20s%-15d%-15d%-15d%-15.1f%-15.1f%-15.1f%n",
                MaHK,HoTen,ngay,thang,nam,SoLuong,DonGia,ThanhTien() );
    }

    public int getThang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }
}
