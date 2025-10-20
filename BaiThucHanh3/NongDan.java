
public class NongDan extends NgheNghiep {
    private String cayTrongChinh;

    public NongDan(String hoTen, int soNamKinhNghiem, String noiLamViec, String cayTrongChinh) {
        super(hoTen, soNamKinhNghiem, noiLamViec);
        this.cayTrongChinh = cayTrongChinh;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Cây trồng chính: " + cayTrongChinh);
    }

    public String getCayTrongChinh() {
        return cayTrongChinh;
    }

    public void setCayTrongChinh(String cayTrongChinh) {
        this.cayTrongChinh = cayTrongChinh;
    }
}

