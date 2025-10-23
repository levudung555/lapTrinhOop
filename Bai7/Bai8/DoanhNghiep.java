public class DoanhNghiep {
    private String maDN;
    private String tenDN;
    private String diaChi;

    public DoanhNghiep() {}

    public DoanhNghiep(String maDN, String tenDN, String diaChi) {
        this.maDN = maDN;
        this.tenDN = tenDN;
        this.diaChi = diaChi;
    }

    public String getMaDN() { return maDN; }
    public void setMaDN(String maDN) { this.maDN = maDN; }

    public String getTenDN() { return tenDN; }
    public void setTenDN(String tenDN) { this.tenDN = tenDN; }

    public String getDiaChi() { return diaChi; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }

    @Override
    public String toString() {
        return tenDN + " (" + maDN + "), " + diaChi;
    }
}
