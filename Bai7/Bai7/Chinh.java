public class Chinh {
    public static void main(String[] args) {
        NhanVien[] ds = new NhanVien[5];

        // === Nhập 5 nhân viên (input mẫu) ===
        ds[0] = new NhanVienSX("Nguyen Van A", 2018, 200);
        ds[1] = new NhanVienSX("Tran Thi B", 2020, 250);
        ds[2] = new NhanVienVP("Le Van C", 2019, 8000000, 2);
        ds[3] = new NhanVienVP("Pham Thi D", 2017, 7500000, 3);
        ds[4] = new NhanVienSX("Do Quang E", 2021, 180);
        // === Xuất danh sách ===
        System.out.println("=================== DANH SÁCH NHÂN VIÊN ==================");
        NhanVien.InTieuDe();
        for (NhanVien nv : ds) {
            nv.Xuat();
        }

    }
}
