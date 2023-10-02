package btclass3.b1.slile63;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVien extends Person {
    private String tenTruongDH;

    public SinhVien(String hoTen, int tuoi, double chieuCao, String tenTruongDH) {
        super(hoTen, tuoi, chieuCao);
        this.tenTruongDH = tenTruongDH;
    }

    public String getTenTruongDH() {
        return tenTruongDH;
    }

    public void setTenTruongDH(String tenTruongDH) {
        this.tenTruongDH = tenTruongDH;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int N = scanner.nextInt();

        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            scanner.nextLine(); // Đọc bỏ dòng trống
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
            SinhVien sv = nhapThongTinSinhVien();
            danhSachSinhVien.add(sv);
        }

        System.out.println("\nDanh sách sinh viên vừa nhập:");
        for (SinhVien sv : danhSachSinhVien) {
            sv.hienThiThongTin();
            System.out.println();
        }
    }

    public static SinhVien nhapThongTinSinhVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int tuoi = scanner.nextInt();
        System.out.print("Nhập chiều cao (cm): ");
        double chieuCao = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập tên trường ĐH: ");
        String tenTruongDH = scanner.nextLine();
        return new SinhVien(hoTen, tuoi, chieuCao, tenTruongDH);
    }
}
