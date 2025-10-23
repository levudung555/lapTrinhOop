import java.util.Scanner;

public class XeCo implements MayMoc {
    public DoanhNghiep DoanhNghiep;
    private String TenXe,TenKhachHang,NhienLieu;
    private int TrongTai, TienDatCoc,NamSx;

    public XeCo(){};
    public XeCo(String tenXe, String tenKhachHang, int trongTai, String nhienLieu, int namSx, int tienDatCoc) {
        TenXe = tenXe;
        TenKhachHang = tenKhachHang;
        NhienLieu = nhienLieu;
        TrongTai = trongTai;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print( "Vui long nhap ten xe :");
        TenXe=sc.nextLine();
        System.out.print("vui long nhap Ten Khach Hang : ");
        TenKhachHang = sc.nextLine();
        System.out.print("Vui long nhap Trong tai cua xe :");
        TrongTai = sc.nextInt();
        System.out.println("Vui long nhap Tien Dat Coc : ");
        TienDatCoc=sc.nextInt();
    }
    public static void inTieuDe(){
        System.out.printf("%-20s%-20s%-15s%-15s%-15s%-15s%n","Ten Xe","Ten Khach Hang","Trong Tai","Nhien Lieu","Nam San Xuat","Tien Dat Coc");
    }
    public void Xuat(){
        System.out.printf("%-20s%-20s%-15d%-15s%-15d%-15d%n",TenXe,TenKhachHang,TrongTai,NhienLieu ,NamSx,TienDatCoc);
    }

    @Override
    public void setNhienLieu(String NL) {
        this.NhienLieu=NL;
    }

    @Override
    public  void setNamSX(int NamSX) {
        this.NamSx=NamSX;
    }

    public String getTenXe() {
        return TenXe;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public String getNhienLieu() {
        return NhienLieu;
    }

    public int getTrongTai() {
        return TrongTai;
    }

    public int getTienDatCoc() {
        return TienDatCoc;
    }

    public int getNamSx() {
        return NamSx;
    }
}
