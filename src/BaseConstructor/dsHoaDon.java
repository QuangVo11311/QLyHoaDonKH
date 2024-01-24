package BaseConstructor;

import HandleEvent.HoaDonThanThiet;
import HandleEvent.HoaDonVangLai;
import HandleEvent.HoaDonVip;

import java.util.ArrayList;
import java.util.Scanner;

public class dsHoaDon {
    public ArrayList<HoaDon> dshd;
    private double tongTienDSHD;
    private int tongSoHDVIP;
    private int tongSoHDThanThiet;

    public dsHoaDon() {
        this.dshd = new ArrayList<>();
        this.tongTienDSHD = 0;
        this.tongSoHDVIP = 0;
        this.tongSoHDThanThiet = 0;
    }

    public ArrayList<HoaDon> getDshd() {
        return dshd;
    }

    public void setDshd(ArrayList<HoaDon> dshd) {
        this.dshd = dshd;
    }

    public double getTongTienDSHD() {
        return tongTienDSHD;
    }

    public void setTongTienDSHD(double tongTienDSHD) {
        this.tongTienDSHD = tongTienDSHD;
    }

    public int getTongSoHDVIP() {
        return tongSoHDVIP;
    }

    public void setTongSoHDVIP(int tongSoHDVIP) {
        this.tongSoHDVIP = tongSoHDVIP;
    }

    public int getTongSoHDThanThiet() {
        return tongSoHDThanThiet;
    }

    public void setTongSoHDThanThiet(int tongSoHDThanThiet) {
        this.tongSoHDThanThiet = tongSoHDThanThiet;
    }

    //====================================================================================//
    public void nhapDSHD() {
        System.out.println("Nhap thong tin hoa don !");
        int select;
        do {
            System.out.println("+---------------------------------------------+");
            System.out.println("|               The Loai Hoa Don              |");
            System.out.println("| -------------------=====--------------------|");
            System.out.println("| 1. Hoa Don Khach Hang vang lai              |");
            System.out.println("| 2. Hoa Don Khach Hang than thiet            |");
            System.out.println("| 3. Hoa Don Khach Hang VIP                   |");
            System.out.println("| 0. Tro ve                                   |");
            System.out.println("+---------------------------------------------+");
            System.out.print("Nhap vao tuy chon: "); select = Integer.parseInt(new Scanner(System.in).nextLine());

            switch (select) {
                case 1 -> {
                    HoaDon hd1 = new HoaDonVangLai();
                    hd1.input();
                    dshd.add(hd1);
                }

                case 2 -> {
                    HoaDon hd2 = new HoaDonThanThiet();
                    hd2.input();
                    dshd.add(hd2);
                }

                case 3 -> {
                    HoaDon hd3 = new HoaDonVip();
                    hd3.input();
                    dshd.add(hd3);
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

    public void xuatDSHD() {
        System.out.println("Xuat thong tin hoa don !");
        int select;
        do {
            System.out.println("+---------------------------------------------------+");
            System.out.println("|                 Danh sach san pham                |");
            System.out.println("| -------------------=====--------------------------|");
            System.out.println("| 1. Xuat danh sach tat ca hoa don                  |");
            System.out.println("| 2. Xuat danh sach hoa don cua khach hang vang lai |");
            System.out.println("| 3. Tong thanh tien hoa don trong danh sach        |");
            System.out.println("| 4. Hoa don co tong thanh tien cao nhat            |");
            System.out.println("| 5. Dem so khach hang VIP va Khach hang than thiet |");
            System.out.println("| 0. Tro ve                                         |");
            System.out.println("+---------------------------------------------------+");
            System.out.print("Nhap vao lua chon: ");
            select = Integer.parseInt(new Scanner(System.in).nextLine());


            switch (select) {
                case 1 -> {
                    xuatDS();
                }

                case 2 -> {
                    xuatDSVangLai();
                }

                case 3 -> {
                    tinhTongThanhTienDSHD();
                }

                case 4 -> {
                    timHDLonNhat();
                }

                case 5 -> {
                    demSL();
                }

                default -> System.out.println("Khong co lua chon nao nhu nay !\nVui long nhap lai lua chon.");
            }
        }while (select != 0);
    }

    //====================================================================================//
    public void xuatDS() {
        for(HoaDon item : dshd) {
            item.output();
        }
    }

    public void xuatDSVangLai() {
        for(HoaDon item : dshd) {
            if(item.getLoaiHoaDon().equals("HoaDonVangLai")) {
                item.output();
            }
        }
    }

    public void tinhTongThanhTienDSHD() {
        double tongThanhTien = 0;
        for(HoaDon item : dshd) {
            tongThanhTien += item.tongThanhTien();
        }

        System.out.printf("Tong thanh tien cua DSHD: %f\n", tongThanhTien);
    }

    public void timHDLonNhat() {
        double max = dshd.get(0).tongThanhTien();
        for(HoaDon item : dshd) {
            if (item.tongThanhTien() > max) {
                max = item.tongThanhTien();
            }
        }

        System.out.println("Hoa don co tong tien lon nhat !");
        for(HoaDon item : dshd) {
            if (item.tongThanhTien() == max) {
                item.output();
            }
        }
    }

    public void demSL() {
        int VIP = 0;
        int TT = 0;
        for(HoaDon item : dshd) {
            if(item.loaiHoaDon.equals("HoaDonVIP")) VIP++;
            if(item.loaiHoaDon.equals("HoaDonThanThiet")) TT++;
        }

        System.out.printf("So hoa don than thiet: %d\nSo hoa don VIP: %d\n", TT, VIP);
    }
}
