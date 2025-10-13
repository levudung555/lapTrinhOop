import javax.swing.plaf.SpinnerUI;
import java.util.Arrays;

public class DanhSachTen {
    private String[] mangTen;
    private int kichThuoc;

    public DanhSachTen() {
        mangTen = new String[20];
        kichThuoc =0;
    }
    public void themTen(String ten){
          if( kichThuoc<20){
              mangTen[kichThuoc++] = ten;
          }
        System.out.println("Mảng đã đầy ");
    }
    public int  timTen(String tenCanTim){
        for (int i = 0; i < kichThuoc; i++) {
            if(mangTen[i].equalsIgnoreCase(tenCanTim)){
                return  i+1;
            }
        }
        return -1;
    }
    public void XepTangDan(){
        Arrays.sort(mangTen,0,kichThuoc);
    }
    public void inDanhSach(){
        System.out.println("Danh sách các tên trong mảng là ");
        for (int i = 0; i < kichThuoc; i++) {
            System.out.print(mangTen[i]);
            System.out.print(",");
        }
    }
}


