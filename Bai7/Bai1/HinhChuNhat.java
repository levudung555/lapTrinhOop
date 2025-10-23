import java.util.Scanner;

public class HinhChuNhat {
    private float length;
    private float width;
    Scanner sc = new Scanner(System.in);
    public void  Nhap(){
        try {
           do {
            System.out.println("Nhap chieu dai cua hinh chu nhat :");
            length = sc.nextFloat();
            System.out.println("Nhap Chieu rong cua hinh chu nhat :");
            width = sc.nextFloat();
            }while(length <=0 || width <=0 ||width >length);
        }catch(Exception e){
            System.out.println("Loi ");
        }finally{
            sc.close();
        }

    }
    public float DienTich(){
        return length*width;
    }
    public float ChuVi(){
        return 2*(length+width);
    }
    public static void inTieuDe(){
        System.out.printf("%15s%15s%15s%15s%n",
                "Chiều dài ","Chiều rộng "," chu vi","Diện tich");
    }
    public void xuat() {

        System.out.printf("%15.1f%15.1f%15.1f%15.1f%n",
                length,width,ChuVi(),DienTich());
    }

    public static void main(String[] args) {
        HinhChuNhat a = new HinhChuNhat();
        a.Nhap();
        HinhChuNhat.inTieuDe();
        a.xuat();

    }

}
