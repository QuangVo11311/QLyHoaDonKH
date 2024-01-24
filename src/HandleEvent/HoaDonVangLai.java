package HandleEvent;

import BaseConstructor.HoaDon;

import java.util.Scanner;

public class HoaDonVangLai extends HoaDon {
    public HoaDonVangLai() {
        super();
        this.loaiHoaDon = "HoaDonVangLai";
    }

    @Override
    public void input() {
        System.out.println("Nhap vao hoa don khach hang vang lai !");
        System.out.print("Nhap vao ma hoa don: "); super.setIdHoaDon(new Scanner(System.in).nextLine());
        System.out.print("Ngay lap hoa don: "); super.setNgayLapHD(new Scanner(System.in).nextLine());
        System.out.print("Nhap vao ma mat hang: "); super.setIdMatHangMua(new Scanner(System.in).nextLine());
        System.out.print("Nhap vao so luong mat hang: "); super.setSoLuong(Integer.parseInt(new Scanner(System.in).nextLine()));
    }

    @Override
    public void output() {
        System.out.println("\nThong tin hoa don khach hang vang lai !");
        System.out.printf("ma hoa don: %s\n", super.getIdHoaDon());
        System.out.printf("loai hoa don: %s\n", super.getLoaiHoaDon());
        System.out.printf("ngay lap hoa don: %s\n", super.getNgayLapHD());
        System.out.printf("ma mat hang mua: %s\n", super.getIdMatHangMua());
        System.out.printf("so luong mat hang: %d lit\n", super.getSoLuong());
        System.out.printf("Tien Khuyen Mai: %f\n", this.tienKM());
        System.out.printf("Tong thanh tien: %f\n", this.tongThanhTien());
    }

    @Override
    public double thanhTien() {
        double tienCanTinh = 0;
        for(String item : super.getListMathang()) {
            if(item.toLowerCase().contains(super.getIdMatHangMua().toLowerCase())) {
                switch (super.getIdMatHangMua().toLowerCase()) {
                    case "ron92" -> tienCanTinh = 22000 * super.getSoLuong();
                    case "ron95" -> tienCanTinh = 25000 * super.getSoLuong();
                    case "e20" -> tienCanTinh+= 15000 * super.getSoLuong();
                    default -> tienCanTinh += 0;
                }
            }
        }

        return tienCanTinh;
    }

    @Override
    public double tienKM() {
        return this.thanhTien() > 1000000 ? thanhTien() * 0.05 : 0;
    }


    @Override
    public double tongThanhTien() {
        return this.thanhTien() - this.tienKM();
    }
}
