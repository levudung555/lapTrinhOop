
public class Mainnn {
    public static void main(String[] args) {
        KhachHang[] ds = new KhachHang[5];

        ds[0] = new KhachHangVN("VN01", "Nguyen Van A", 10, 9, 2013, 80, 2000, "Sinh hoạt", 100.0);
        ds[1] = new KhachHangVN("VN02", "Tran Thi B", 12, 8, 2013, 120, 2000, "Kinh doanh", 100.0);
        ds[2] = new KhachHangNuocNgoai("NN01", "John Smith", 15, 9, 2013, 200, 3000, "USA");
        ds[3] = new KhachHangNuocNgoai("NN02", "Kim Yuna", 25, 7, 2013, 180, 2500, "Korea");
        ds[4] = new KhachHangVN("VN03", "Le Van C", 1, 9, 2013, 90, 2500, "Sản xuất", 100.0);
        // Xuât hóa đơn
        System.out.println("=====================================================Danh Sách Hóa Đơn======================================================");
        KhachHang.InTieuDe();
        for (KhachHang x : ds) {
            x.Xuat();
        }
        //Tính tổng sô lượng
        double TongVn = 0, TongNn = 0, TongTienNN = 0;
        int dem = 0;
        for (KhachHang x : ds) {
            if (x instanceof KhachHangVN) {
                TongVn += x.SoLuong;
            } else {
                TongNn += x.SoLuong;
                TongTienNN += x.ThanhTien();
                dem++;
            }
        }
        System.out.println("\nTổng tiền của khách trong nước là : " + TongVn);
        System.out.println("\nTổng tiền của khách nước ngoài là : " + TongNn);
        System.out.println("\nTrung bình thanh tiền của khách nước ngoài la :" + TongTienNN);
        // Xuất hóa đơn trong tháng 9 năm 2013;
        System.out.println("\n=============================================== HÓA ĐƠN THÁNG 09 NĂM 2013 =================================================");
        KhachHang.InTieuDe();
        boolean check=false;
        for(KhachHang x :ds){
            if(x.getNam()==2013 && x.getThang()==9){
                x.Xuat();
                check=true;
            }
        }
        if(!check){
            System.out.println("Không tìm thấy ");
        }
    }

}
