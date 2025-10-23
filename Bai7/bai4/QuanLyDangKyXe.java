import java.util.Scanner;

public class QuanLyDangKyXe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Xe[] dsXe = new Xe[100];
        int n = 0;
        int chon;

        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Nhập thông tin và tạo danh sách xe");
            System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhập số lượng xe: ");
                    n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("\n-- Nhập thông tin xe thứ " + (i + 1) + " --");
                        dsXe[i] = new Xe();
                        dsXe[i].nhap();
                    }
                    break;

                case 2:
                    if (n == 0) {
                        System.out.println("Chưa có dữ liệu xe!");
                    } else {
                        Xe.inTieuDe();
                        for (int i = 0; i < n; i++) {
                            dsXe[i].xuat();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Chương trình kết thúc!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
            }

        } while (chon != 3);
    }
}
