import java.util.Scanner;

public class SinhVienn implements ChuyenNganh {
    private String HoTen,TenCN;
    private DiaChi DiaChiNha;
    private DiaChi DiaChiTruong;
    private double Diem1,Diem2,Diem3;
    private String ChuyenNganh;

    public SinhVienn() {
    }
    // ======== NHẬP DỮ LIỆU ========
    public void Nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập họ tên sinh viên: ");
        HoTen = sc.nextLine();

        System.out.println("== Nhập địa chỉ nhà ==");
        System.out.print("Đường: "); String duongNha = sc.nextLine();
        System.out.print("Phường: "); String phuongNha = sc.nextLine();
        System.out.print("Quận: "); String quanNha = sc.nextLine();
        System.out.print("Thành phố: "); String tpNha = sc.nextLine();
        DiaChiNha = new DiaChi(duongNha, phuongNha, quanNha, 3333);

        System.out.println("== Nhập địa chỉ trường ==");
        System.out.print("Đường: "); String duongTr = sc.nextLine();
        System.out.print("Phường: "); String phuongTr = sc.nextLine();
        System.out.print("Quận: "); String quanTr = sc.nextLine();
        System.out.print("Ma Vung: "); double tpTr = sc.nextDouble();
        DiaChiTruong = new DiaChi(duongTr, phuongTr, quanTr, 123);

        System.out.print("Nhập chuyên ngành: ");
        ChuyenNganh = sc.nextLine();

        System.out.print("Nhập điểm 1: "); Diem1 = sc.nextDouble();
        System.out.print("Nhập điểm 2: "); Diem2 = sc.nextDouble();
        System.out.print("Nhập điểm 3: "); Diem3 = sc.nextDouble();
    }
    public void setCotDiem(int LoaiDiem, double Diem){
        if(LoaiDiem==1)this.Diem1=Diem;
        else if(LoaiDiem==2)this.Diem2=Diem;
        else if (LoaiDiem==3)this.Diem3=Diem;
        else{
            System.out.println("Loai Diem khong hop le !");
        }
    }
    public double getCotDiem(int LoaiDiem){
        if(LoaiDiem==1)return Diem1;
        else if(LoaiDiem==2)return Diem2;
        else if (LoaiDiem==3)return Diem3;
        else{
            System.out.println("Loai Diem khong hop le !");
            return  -1;
        }
    }
    public double DiemTrungBinh(){
        return(Diem1+Diem2+Diem3)/3;
    }
    @Override
    public String toString() {
        return String.format("%-20s%-20s%-20s%-15s%-10.2f",
                HoTen, DiaChiNha, DiaChiTruong, ChuyenNganh, DiemTrungBinh());
    }

    @Override
    public void setChuyenNganh(String chuyenNganh) {
        this.ChuyenNganh=chuyenNganh;
    }

    @Override
    public String getChuyenNganh() {
        return ChuyenNganh;
    }
}
