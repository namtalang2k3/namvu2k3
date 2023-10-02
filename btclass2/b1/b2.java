package b1;

import java.util.Scanner;

class Card {
    private String tuaDeSach;
    private String tacGia;
    private int soLuongSach;

    public Card(String tuaDeSach, String tacGia, int soLuongSach) {
        this.tuaDeSach = tuaDeSach;
        this.tacGia = tacGia;
        this.soLuongSach = soLuongSach;
    }

    public void hienThiThongTin() {
        System.out.println("Tựa đề sách: " + tuaDeSach);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Số lượng sách: " + soLuongSach);
    }

    public int laySoLuongSach() {
        return soLuongSach;
    }
}

public class b2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sách: ");
        int n = scanner.nextInt();

        Card[] danhSachSach = new Card[n];

        for (int i = 0; i < n; i++) {
            scanner.nextLine(); // Đọc bỏ dòng trống
            System.out.println("Nhập thông tin cho cuốn sách thứ " + (i + 1) + ":");
            System.out.print("Tựa đề sách: ");
            String tuaDeSach = scanner.nextLine();
            System.out.print("Tác giả: ");
            String tacGia = scanner.nextLine();
            System.out.print("Số lượng sách: ");
            int soLuongSach = scanner.nextInt();

            danhSachSach[i] = new Card(tuaDeSach, tacGia, soLuongSach);
        }

        // Tìm cuốn sách có số lượng lớn nhất
        int soLuongMax = -1;
        Card sachMax = null;

        for (Card sach : danhSachSach) {
            if (sach.laySoLuongSach() > soLuongMax) {
                soLuongMax = sach.laySoLuongSach();
                sachMax = sach;
            }
        }

        System.out.println("Thông tin về cuốn sách có số lượng lớn nhất:");
        if (sachMax != null) {
            sachMax.hienThiThongTin();
        } else {
            System.out.println("Không có sách nào trong danh sách.");
        }

        scanner.close();
    }
}
