package Class;

import java.util.Scanner;

public class HocSinh extends Nguoi {
    // thuoc tinh
    private String lop;
    private String khoahoc;
    private String kyhoc;

    // phuong thuc
    // ham khoi tao khong doi so
    public HocSinh(String hoten, String lop, String khoahoc, String kyhoc) {
        this.hoten = hoten;
        this.lop = lop;
        this.khoahoc = khoahoc;
        this.kyhoc = kyhoc;
    }

    public void nhapthongtin(Scanner sc) {
        super.nhapthongtin(sc);

        System.out.println("Nhap lop: ");
        lop = sc.nextLine();

        System.out.println("Nhap khoa hoc: ");
        khoahoc = sc.nextLine();
        System.out.println("Nhap ky hoc: ");
        kyhoc = sc.nextLine();
    }

    // ham hien thi
    public void hiethithongtin() {
        super.hienthi();

        System.out.println("\tlop: " + lop);
        System.out.println("\tkhoa hoc: " + khoahoc);
        System.out.println("\tky hoc: " + kyhoc);
    }

    // ham lay ra thong tin
    public String getlop() {
        return lop;
    }
}
