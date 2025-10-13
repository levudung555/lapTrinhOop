package Animals;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        ArrayList<Animal> An = new ArrayList<>();
        while (true) {
            System.out.println("Vui lòng nhập tên :");
            String name = sc.nextLine();
            System.out.println("Đó là con vật nào ?");
            System.out.println("1. Con chó");
            System.out.println("2. Con Mèo");
            try {
                System.out.println("Vui lòng nhập câu trả lời : ");
                num = sc.nextInt(); break;
            }catch (InputMismatchException e){
                System.out.println("Vui lòng chỉ nhập sô");
            }


            sc.nextLine();
            if (num == 1) {
                Dog a = new Dog(name);
                An.add(a);
            } else if (num == 2) {
                Cat b = new Cat(name);
                An.add(b);
            } else {
                System.out.println("Giá trị không hợp lệ ");
                break;
            }
    }
        for(Animal x: An){
            x.introduce();
            x.makeSound();
        }
        Pet c = new Dog("Vàng");
        Pet d = new Cat( "Meo");
        c.play();
        d.play();
        }

}
