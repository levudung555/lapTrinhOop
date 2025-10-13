package SinhVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student a = new Student();
        a.nhap();
        System.out.println(a.toString());
      String b=  a.name;
      a.introduce();
    }
}
