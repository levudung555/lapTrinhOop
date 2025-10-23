import java.util.Calendar;

public abstract class NhanVien {
    protected String TenNV ;
    protected int  NamVaoLam;
    protected double Luong,PhuCap;
    Calendar ca = Calendar.getInstance();
    int year =ca.get(Calendar.YEAR);
    public NhanVien( String tenNV, int namVaoLam) {
        TenNV = tenNV;
        NamVaoLam = namVaoLam;
    }
    public abstract double LuongNV();
    public double phuCap(){
        return (year-NamVaoLam)*20000+100000;
    }
    public static void InTieuDe(){
        System.out.printf("%-20s%-15s%-15s%-15s%n","Ten NV", "Nam Vao Lam ","Luong","Phu Cap");
    }
    public void Xuat(){
        System.out.printf("%-20s%-15d%-15.1f%-15.1f%n"
                 ,TenNV,NamVaoLam,LuongNV(),phuCap());
    }

}

