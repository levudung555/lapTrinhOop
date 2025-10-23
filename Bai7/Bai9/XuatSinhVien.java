import java.util.Scanner;

public class XuatSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();

        SinhVienn[] ds = new SinhVienn[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n-- Nhập sinh viên thứ " + (i + 1) + " --");
            ds[i] = new SinhVienn();
            ds[i].Nhap();
        }

        // In danh sách
        System.out.println("\n===== DANH SÁCH SINH VIÊN =====");
        System.out.printf("%-20s%-20s%-20s%-15s%-10s%n",
                "Họ tên", "Địa chỉ nhà", "Địa chỉ trường", "Chuyên ngành", "ĐTB");
        for (SinhVienn sv : ds)
            System.out.println(sv);

        // Tìm sinh viên có điểm TB cao nhất
        SinhVienn max = ds[0];
        for (int i = 1; i < n; i++) {
            if (ds[i].DiemTrungBinh() > max.DiemTrungBinh())
                max = ds[i];
        }

        System.out.println("\n== Sinh viên có điểm trung bình cao nhất ==");
        System.out.println(max);
    }
}
