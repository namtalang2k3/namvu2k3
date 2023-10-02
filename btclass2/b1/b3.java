package b1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class DATE {
    private int ngay, thang, nam;

    public DATE(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ngày: ");
        ngay = scanner.nextInt();
        System.out.print("Tháng: ");
        thang = scanner.nextInt();
        System.out.print("Năm: ");
        nam = scanner.nextInt();
    }

    public void xuat() {
        System.out.println(ngay + "/" + thang + "/" + nam);
    }
}

class NHANSU {
    private String ten, soCMND;
    private DATE ngaySinh;

    public NHANSU(String ten, DATE ngaySinh, String soCMND) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.soCMND = soCMND;
    }

    public String layTen() {
        return ten;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        ten = scanner.nextLine();
        System.out.println("Nhập ngày sinh:");
        ngaySinh.nhap();
        System.out.print("Nhập số CMND: ");
        soCMND = scanner.nextLine();
    }

    public void xuat() {
        System.out.println("Tên: " + ten);
        System.out.print("Ngày sinh: ");
        ngaySinh.xuat();
        System.out.println("Số CMND: " + soCMND);
    }
}

public class b3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng nhân sự: ");
        int n = scanner.nextInt();
        NHANSU[] danhSachNhanSu = new NHANSU[n];

        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            System.out.println("Nhập thông tin cho nhân sự thứ " + (i + 1) + ":");
            System.out.print("Nhập tên: ");
            String ten = scanner.nextLine();
            System.out.println("Nhập ngày sinh:");
            DATE ngaySinh = new DATE(0, 0, 0);
            ngaySinh.nhap();
            System.out.print("Nhập số CMND: ");
            String soCMND = scanner.nextLine();
            danhSachNhanSu[i] = new NHANSU(ten, ngaySinh, soCMND);
        }

        Arrays.sort(danhSachNhanSu, Comparator.comparing(NHANSU::layTen));

        System.out.println("\n Danh sách nhân sự đã sắp xếp theo tên:");
        for (NHANSU nhanSu : danhSachNhanSu) {
            nhanSu.xuat();
            System.out.println();
        }
    }
}
