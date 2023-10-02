package Test_thuvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Class.TheMuon;

public class Test {
    public static void main(String[] args) {
        List<TheMuon> danhSachTheMuon = new ArrayList<>();

        // Nhập thông tin mượn sách từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phiếu mượn sách: ");
        int soLuongMuon = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống

        for (int i = 0; i < soLuongMuon; i++) {
            TheMuon theMuon = TheMuon.nhapThongTinTheMuon();
            danhSachTheMuon.add(theMuon);
        }

        System.out.println("Danh sách sinh viên cần trả sách vào cuối tháng:");
        for (int i = 0; i < danhSachTheMuon.size(); i++) {
            TheMuon theMuon = danhSachTheMuon.get(i);
            if (theMuon.getHanTra().equals("30/09/2023")) {
                theMuon.hienThiThongTin();
                System.out.println();
            }
        }

    }
}
