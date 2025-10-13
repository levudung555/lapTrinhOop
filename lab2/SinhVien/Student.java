package SinhVien;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Student extends Person {
    private String  maSV;
    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
            System.out.print("Vui lòng nhập mã sinh viên của bạn : ");
            this.maSV = sc.nextLine();

    }
    public Student() {

    }
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Mã Sinh Viên là :"+maSV);
    }

    @Override
    public String toString() {
        return "Student{" +
                "maSV='" + maSV + '\'' +
                ", CMND=" + CMND +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    }
