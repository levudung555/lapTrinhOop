package Computer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Computer> computers = new ArrayList<>();

        // Thêm vài máy tính mẫu
        computers.add(new Computer(
                "C01", "Dell", "XPS 15", "Laptop", 2500, 2023,
                "Intel", "i7-13700H", 3.7, 14, 20,
                16, "DDR5", 4800, 2,
                "SSD", 1000, 3500,
                "NVIDIA", "RTX 4050", 6,
                15.6, "1920x1080", 120, false,
                "USB-C, HDMI, Thunderbolt", "WiFi 6E, Bluetooth 5.3", 90, 1.8
        ));

        computers.add(new Computer(
                "C02", "Apple", "MacBook Air M2", "Laptop", 1800, 2022,
                "Apple", "M2", 3.5, 8, 8,
                8, "Unified", 3200, 0,
                "SSD", 512, 3000,
                "Apple", "GPU M2", 10,
                13.3, "2560x1600", 60, false,
                "USB-C, Thunderbolt", "WiFi 6, Bluetooth 5.0", 52, 1.3
        ));

        computers.add(new Computer(
                "C03", "Asus", "ROG Strix", "Laptop", 2200, 2023,
                "AMD", "Ryzen 9 7945HX", 3.9, 16, 32,
                32, "DDR5", 5200, 2,
                "SSD", 2000, 5000,
                "NVIDIA", "RTX 4070", 8,
                17.3, "2560x1440", 165, true,
                "USB-C, HDMI, LAN", "WiFi 6E, Bluetooth 5.2", 90, 2.5
        ));

        // Menu
        while (true) {
            System.out.println("\n====== MENU ======");
            System.out.println("1. In danh sách máy tính");
            System.out.println("2. Tìm máy tính theo hãng");
            System.out.println("3. Lọc theo RAM >= ... và giá <= ...");
            System.out.println("4. Lọc theo GPU NVIDIA");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (choice == 0) break;

            switch (choice) {
                case 1:
                    System.out.println("\n📌 Danh sách máy tính:");
                    for (Computer c : computers) System.out.println(c);
                    break;

                case 2:
                    System.out.print("Nhập tên hãng: ");
                    String brand = sc.nextLine();
                    for (Computer c : computers) {
                        if (c.getBrand().equalsIgnoreCase(brand)) {
                            System.out.println(c);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nhập RAM tối thiểu (GB): ");
                    int ram = sc.nextInt();
                    System.out.print("Nhập giá tối đa ($): ");
                    double maxPrice = sc.nextDouble();
                    for (Computer c : computers) {
                        if (c.getRamSize() >= ram && c.getPrice() <= maxPrice) {
                            System.out.println(c);
                        }
                    }
                    break;

                case 4:
                    System.out.println(" Máy tính có GPU NVIDIA:");
                    for (Computer c : computers) {
                        if (c.getGpuBrand().equalsIgnoreCase("NVIDIA")) {
                            System.out.println(c);
                        }
                    }
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }

        sc.close();
    }

}
