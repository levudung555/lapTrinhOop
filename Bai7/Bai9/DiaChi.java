public class DiaChi {
    private String Duong,Quan,ThanhPho;
    private long MaVung;

    public DiaChi(String duong, String quan, String thanhPho, long maVung) {
        Duong = duong;
        Quan = quan;
        ThanhPho = thanhPho;
        MaVung = maVung;
    }

    @Override
    public String toString() {
        return "DiaChi{" +
                "Duong='" + Duong + '\'' +
                ", Quan='" + Quan + '\'' +
                ", ThanhPho='" + ThanhPho + '\'' +
                ", MaVung=" + MaVung +
                '}';
    }
}
