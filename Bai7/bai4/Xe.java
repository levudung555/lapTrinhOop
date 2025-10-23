import java.util.Scanner;

public class Xe {
    private String chuXe;
    private String loaiXe;
    private float triGia;
    private int dungTich;

    Scanner sc = new Scanner(System.in);

    // === Nhập thông tin xe ===
    public void nhap() {
        System.out.print("Nhập tên chủ xe: ");
        chuXe = sc.nextLine();
        System.out.print("Nhập loại xe: ");
        loaiXe = sc.nextLine();
        System.out.print("Nhập dung tích xy-lanh (cc): ");
        dungTich = sc.nextInt();
        System.out.print("Nhập trị giá xe (triệu đồng): ");
        triGia = sc.nextFloat();
        sc.nextLine(); // tránh lỗi khi nhập tiếp
    }

    // === Tính thuế trước bạ ===
    public double tinhThue() {
        if (dungTich < 100)
            return triGia * 0.01;
        else if (dungTich <= 200)
            return triGia * 0.03;
        else
            return triGia * 0.05;
    }

    // === In tiêu đề bảng (phương thức tĩnh) ===
    public static void inTieuDe() {
        System.out.printf("%20s%20s%20s%20s%20s%n",
                "Chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế trước bạ");
    }

    // === Xuất thông tin 1 xe ===
    public void xuat() {
        System.out.printf("%20s%20s%20d%20.2f%20.2f%n",
                chuXe, loaiXe, dungTich, triGia, tinhThue());
    }
}
