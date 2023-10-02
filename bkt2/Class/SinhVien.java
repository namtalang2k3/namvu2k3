package Class;

import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private String msv;
    private String ngaySinh;
    private String lop;

    public SinhVien(String hoTen, String msv, String ngaySinh, String lop) {
        this.hoTen = hoTen;
        this.msv = msv;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
    }

    public void hienThiThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Mã số sinh viên: " + msv);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Lớp: " + lop);
    }

    public static SinhVien nhapThongTinSinhVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin sinh viên:");
        System.out.print("Họ tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Mã số sinh viên: ");
        String msv = scanner.nextLine();
        System.out.print("Ngày sinh: ");
        String ngaySinh = scanner.nextLine();
        System.out.print("Lớp: ");
        String lop = scanner.nextLine();
        return new SinhVien(hoTen, msv, ngaySinh, lop);

    }
}
