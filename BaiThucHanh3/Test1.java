import java.util.ArrayList;
public class Test1 {
    public static void main(String[] args) {
        // Tạo danh sách nghề nghiệp
        ArrayList<NgheNghiep> danhSach = new ArrayList<>();

        // Khởi tạo đối tượng
        danhSach.add(new BacSi("Nguyen Van A", 10, "Bệnh viện Bạch Mai", "Tim mạch"));
        danhSach.add(new KienTrucSu("Le Thi B", 7, "Công ty Xây dựng ABC", "Nhà cao tầng"));
        danhSach.add(new LuatSu("Tran Van C", 5, "Hãng luật XYZ", "Dân sự"));
        danhSach.add(new KySu("Pham Van D", 8, "Công ty Cơ khí", "Cơ khí chế tạo"));
        danhSach.add(new NhaKinhTe("Nguyen Thi E", 12, "ĐH Kinh tế Quốc dân", "Tài chính"));

        // In ra toàn bộ danh sách
        System.out.println("=== Danh sách nghề nghiệp ===");
        for (NgheNghiep nghe : danhSach) {
            nghe.hienThiThongTin();
            System.out.println("--------------------");
        }

        // Tìm kiếm: lấy ra tất cả Bác sĩ có chuyên môn "Tim mạch"
        System.out.println("\n=== Tìm kiếm Bác sĩ chuyên môn Tim mạch ===");
        for (NgheNghiep nghe : danhSach) {
            if (nghe instanceof BacSi) {
                BacSi bacSi = (BacSi) nghe;
                if (bacSi.getChuyenMon().equalsIgnoreCase("Tim mạch")) {
                    bacSi.hienThiThongTin();
                }
            }
        }
    }
}
