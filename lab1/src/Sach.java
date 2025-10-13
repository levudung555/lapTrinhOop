public class Sach {
    private String maSach;
    private String tieuDe;
    private int namSanXuat;
    private  String[] tacGia;
    private int kichThuoc;

    public Sach(String maSach, String tieuDe, int namSanXuat) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.namSanXuat = namSanXuat;
        tacGia = new String[5];
        kichThuoc =0;
    }

    public String getMaSach() {
        return maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public Sach(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public void themTacGia(String tacGiaMoi){
        if(kichThuoc <5){
            tacGia[kichThuoc++]=tacGiaMoi;
        }
        else{
            System.out.println("Mảng đã đầy ");
        }
    }
    public String chuanHoaTieuDeSach() {
        String t = tieuDe.trim();
        if (t.isEmpty()) return null;

        String[] w = t.split("\\s+");   // dùng t thay vì tieuDe
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < w.length; i++) {
            String z = w[i].toLowerCase();
            sb.append(Character.toUpperCase(z.charAt(0)))
                    .append(z.substring(1));
            if (i < w.length - 1) sb.append(" ");
        }

        return sb.toString();
    }

    public void inThongTin(){
        System.out.println("Ma "+maSach);
        System.out.println("Tieu de "+tieuDe);
        System.out.println("Nam "+namSanXuat);
        System.out.print("tac gia ");
        for(int i=0;i<kichThuoc;i++){
            System.out.print(tacGia[i]);
            System.out.print(" ");
        }
    }
    public boolean timTacGia(String tacGiaCanTim){
        for(int i=0;i<kichThuoc;i++){
            if(tacGia[i].equalsIgnoreCase(tacGiaCanTim)){
                return true;
            }
        }
        return false;
    }
}
