package BaseConstructor;

import java.util.Scanner;

public class Menu {
    public void mainMenu() {
        int select;
        dsHoaDon dshd = new dsHoaDon();

        do {
            System.out.println("+---------------------------------------------+");
            System.out.println("|           Quan li hoa don cay xang          |");
            System.out.println("| -------------------=====--------------------|");
            System.out.println("| 1. Nhap danh sach hoa don                   |");
            System.out.println("| 2. Xuat danh sach hoa don                   |");
            System.out.println("| 0. Thoat chuong trinh                       |");
            System.out.println("+---------------------------------------------+");
            System.out.print("Nhap vao tuy chon: "); select = Integer.parseInt(new Scanner(System.in).nextLine());


            switch(select) {
                case 1 -> {
                    dshd.nhapDSHD();
                }

                case 2 -> {
                    dshd.xuatDSHD();
                }

                case 0 -> {
                    System.out.println("\nThoat chuong trinh");
                }

                default -> {
                    System.out.println("Khong co lua chon nao nhu nay !\nVui long nhap lai lua chon.");
                }
            }
        } while (select != 0);
    }


}
