public class Mainn {
    public static void main(String[] args) {
        // Tạo mảng các hình phẳng (đa hình)
        HinhPhang[] ds = new HinhPhang[3];

        ds[0] = new HinhVuong(5);
        ds[1] = new HinhChuNhat1(4, 6);
        ds[2] = new HinhTron1(3.5);

        // In kết quả
        HinhPhang.inTieuDe();
        for (HinhPhang h : ds) {
            h.inThongTin();
        }
    }
}
