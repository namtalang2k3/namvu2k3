package Class;

import java.util.Scanner;

public class TheMuon {
    private int soPhieuMuon;
    private String ngayMuon;
    private String hanTra;
    private int soHieuSach;
    private String tensach;
    private SinhVien sinhVien;

    public TheMuon(int soPhieuMuon, String ngayMuon, String hanTra, int soHieuSach, String tensach, SinhVien sinhVien) {
        this.soPhieuMuon = soPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
        this.tensach = tensach;
        this.sinhVien = sinhVien;
    }

    public void hienThiThongTin() {
        System.out.println("Số phiếu mượn: " + soPhieuMuon);
        System.out.println("Ngày mượn: " + ngayMuon);
        System.out.println("Hạn trả: " + hanTra);
        System.out.println("Số hiệu sách: " + soHieuSach);
        System.out.println("Tên Sách: " + tensach);
        System.out.println("Thông tin sinh viên mượn sách:");
        sinhVien.hienThiThongTin();
    }

    public String getHanTra() {
        return hanTra;
    }

    public static TheMuon nhapThongTinTheMuon() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin phiếu mượn sách:");
        System.out.print("Số phiếu mượn: ");
        int soPhieuMuon = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống
        System.out.print("Ngày mượn: ");
        String ngayMuon = scanner.nextLine();
        System.out.print("Hạn trả: ");
        String hanTra = scanner.nextLine();
        System.out.print("Số hiệu sách: ");
        int soHieuSach = scanner.nextInt();
        System.out.print("Tên sách: ");
        String tensach = scanner.nextLine();
        scanner.nextLine(); // Đọc bỏ dòng trống
        SinhVien sinhVien = SinhVien.nhapThongTinSinhVien();
        return new TheMuon(soPhieuMuon, ngayMuon, hanTra, soHieuSach, tensach, sinhVien);

    }
}
