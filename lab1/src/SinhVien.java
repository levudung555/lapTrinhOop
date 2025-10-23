public class SinhVien {
    private String maSV;
    private  String name;
    private  int age;
    private  double diemTB;
    public SinhVien() {
        
    }

    public SinhVien(String maSV, String name, int age, double diemTB) {
        this.maSV = maSV;
        this.name = name;
        this.age = age;
        this.diemTB = diemTB;
    }
    public void inThongTin(){
        System.out.println("Mã SV : "+ maSV);
        System.out.println("Tên : "+name);
        System.out.println("Tuổi :" +age  );
        System.out.println("Điểm TB : "+diemTB);
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaSV() {
        return maSV;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
public void capNhatDiem(double diemMoi){
        if(diemMoi<=0 || diemMoi >10) System.out.println("Điểm mói không hợp lệ");
        else {
            diemTB=diemMoi;
            System.out.println("Sau cập nhật : Điểm TB :"+diemTB);

        }
}

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV='" + maSV + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", diemTB=" + diemTB +
                '}';
    }
}
