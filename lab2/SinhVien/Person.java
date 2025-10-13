package SinhVien;

import java.util.Scanner;

public class Person {
    protected String name;
    protected int age;
    protected String CMND;

    public void nhap() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Vui long nhap ten cua ban :");
            this.name = sc.nextLine();
            while(true) {
                try {
                    System.out.print("Vui long nhap tuoi cua ban :");
                    this.age = sc.nextInt();
                    break;
                }catch (Exception e){
                    System.out.println("Bạn chỉ được giá trị là số ");
                    sc.nextLine();
                }
            }
            sc.nextLine();
            System.out.print("Vui long nhap CMND cua ban :");
            this.CMND = sc.nextLine();

    }
    public Person() {
            }
            public void introduce () {
                System.out.println("Tôi tên là : " + name + " , năm nay tôi " + age + " tuổi, mã CMND của tôi là : " + CMND);
            }

            public String toString () {
                return "Person{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", CMND=" + CMND +
                        '}';
            }
}

