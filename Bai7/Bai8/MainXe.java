import java.util.Scanner;

public class MainXe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng xe: ");
        int n = sc.nextInt();
        sc.nextLine();

        XeCo[] dsXeCo = new XeCo[n];

        // Nhập thông tin doanh nghiệp
        System.out.println("=== Nhập thông tin doanh nghiệp ===");
        System.out.print("Mã DN: ");
        String ma = sc.nextLine();
        System.out.print("Tên DN: ");
        String ten = sc.nextLine();
        System.out.print("Địa chỉ DN: ");
        String dc = sc.nextLine();

        DoanhNghiep dn = new DoanhNghiep(ma, ten, dc);

        // Nhập thông tin xe
        for (int i = 0; i < n; i++) {
            System.out.println("\n-- Nhập xe thứ " + (i + 1) + " --");
            dsXeCo[i] = new XeCo();
            dsXeCo[i].Nhap();
            dsXeCo[i].setNamSX(2020 + i); // ví dụ
            dsXeCo[i].setNhienLieu("Dầu Diesel");
            dsXeCo[i].DoanhNghiep = dn;
        }

        // Xuất thông tin
        System.out.println("\n===== DANH SÁCH XE =====");
        XeCo.inTieuDe();
        for (XeCo x : dsXeCo) x.Xuat();

        // Tìm xe có trọng tải lớn nhất
        XeCo maxXeCo = dsXeCo[0];
        for (int i = 1; i < n; i++) {
            if (dsXeCo[i].getTrongTai() > maxXeCo.getTrongTai())
                maxXeCo = dsXeCo[i];
        }

        System.out.println("\nXe có trọng tải lớn nhất:");
        XeCo.inTieuDe();
        maxXeCo.Xuat();
    }
}
