    import java.util.Scanner;

    public class Main
    {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Bai 1 :: Cài Đặt Lớp SinhVien ");
            SinhVien sv1 = new SinhVien("2024603443" , "Lê Vũ Dũng", 19, 9.0);
            SinhVien sv2 = new SinhVien("202418112006" ,  "Nguyễn Thị Tâm Mai", 18, 8.0);
            sv1.inThongTin();
            sv1.capNhatDiem(10);
            sv2.inThongTin();
            sv2.capNhatDiem(9.0);
            System.out.println("-----------------------------------");
            System.out.println("Bài 2: Xử Lý Mảng Đối Tượng SinhVien");
            QuanLySinhVien qlsv = new QuanLySinhVien();
            qlsv.themSinhVien(sv1);
            qlsv.themSinhVien(sv2);
            qlsv.themSinhVien(new SinhVien("SV003", "Le Van C", 22, 6.5));
            System.out.print("Nhap ma sinh vien ma ban muon tim : ");
            String a =sc.nextLine();
           SinhVien tmp = qlsv.timSinhVienTheoMa(a);
                if(tmp!= null){
                    System.out.println(tmp.toString());
                }else{
                    System.out.println("Không tìm thấy sinh viên "+ a);
                }
            qlsv.inDanhSach();
            System.out.println("-----------------------------------");
            System.out.println("Bài 3: Xử Lý Chuỗi Trong Lớp ChuoiUtil");
            String chuoiGoc = " hello world from java ";
            ChuoiUtil chuoi = new ChuoiUtil(chuoiGoc);
            System.out.println("Chuỗi đảo ngược là : "+chuoi.daoNguocChuoi());
            System.out.println("Số từ trong chuỗi là : "+chuoi.dem());
            System.out.println("Chuẩn hóa : "+chuoi.chuanHoaChuoi());
            System.out.println("-----------------------------------");
            System.out.println("Bài 4: Xử Lý Mảng Chuỗi Trong Lớp DanhSachTen");
            DanhSachTen dst = new DanhSachTen();
            dst.themTen("Anna");
            dst.themTen("Zoe");
            dst.themTen("Bob");
            dst.themTen("Charlie");
            System.out.println("Vi tri của Anna " + dst.timTen("Anna"));
            dst.XepTangDan();
            dst.inDanhSach();
            System.out.println("-----------------------------------");
            System.out.println("----- Bài 5: Sach & ThuVien -----");
            ThuVien thuVien = new ThuVien();

            Sach s1 = new Sach("S001", "java oop basics", 2020);
            s1.themTacGia("Author A");
            s1.themTacGia("Author B");

            Sach s2 = new Sach("S002", "c programming: from zero", 2018);
            s2.themTacGia("Author C");
            s2.themTacGia("Author D");

            Sach s3 = new Sach("S003", "introduction to algorithms", 2015);
            s3.themTacGia("Author X");
            s3.themTacGia("Author Y");

            thuVien.ThemSach(s1);
            thuVien.ThemSach(s2);
            thuVien.ThemSach(s3);
            System.out.println("Danh sach sach :");
            thuVien.inDsanhSach();
            System.out.println(" ");
            System.out.println("Tieu de sau khi chuan hoa "+s1.chuanHoaTieuDeSach() );
            System.out.println("tac gia Author X cso trong thư viện đúng ko " +
                    " :"+s1.timTacGia("Author A") );


        }
    }
