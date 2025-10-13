public class QuanLySinhVien {
    private SinhVien[] SV;
    private  int  SoLuong ;

    public QuanLySinhVien() {
        SV = new SinhVien[10];
        SoLuong = 0;
    }
    public void themSinhVien(SinhVien sv){
        if(SoLuong>=10){
            System.out.println("Danh sách sinh viên đã đầy ");return ;
        }
        SV[SoLuong++]= sv;
    }
    public SinhVien timSinhVienTheoMa(String maSV){
        for(SinhVien x : SV){
            if(x!=null && x.getMaSV().equalsIgnoreCase(maSV)) {
                return x;
            }
        }
        return null;
    }
    public void inDanhSach(){
        if(SoLuong==0){
            System.out.println("Chưa có sinh vien nào ");return;
        }
        System.out.println("--------------Danh sách sinh viên------------------ ");
        for(int i =0;i<SoLuong;i++){
            SV[i].inThongTin();
            System.out.println("-------------------------------------------");
        }
    }
}
