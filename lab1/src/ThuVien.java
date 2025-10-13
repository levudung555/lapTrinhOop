public class ThuVien {
    private Sach[] book;
    private int kichThuoc ;

    public ThuVien() {
        book = new Sach[10];
        kichThuoc =0;
    }
    public void ThemSach(Sach s){
        if(kichThuoc <10){
            book[kichThuoc++] =s;
        }else {
            System.out.println("mang da day ");
        }
    }
    public void timMaTheoSach(String ma ){
        for(int i=0;i<kichThuoc;i++){
            if(book[i].getMaSach().equalsIgnoreCase(ma)){
                book[i].inThongTin();
                return;
            }
        }
        System.out.println("khong tim thay ");return ;
    }
    public void inDsanhSach(){
        for(int i=0;i<kichThuoc;i++){
            book[i].inThongTin();
        }
    }
}
