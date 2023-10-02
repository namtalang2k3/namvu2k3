package b1;

import java.util.Scanner;

class Sach {
    private String tenSach;
    private int tongSoSach;
    private int soMuon;

    public Sach() {

    }

    public void nhap_thong_Tin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sách: ");
        tenSach = scanner.nextLine();
        System.out.print("Nhập tổng số sách: ");
        tongSoSach = scanner.nextInt();
        System.out.print("Nhập số sách đã cho mượn: ");
        soMuon = scanner.nextInt();
    }

    public void in_Thong_Tin() {
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tổng số sách: " + tongSoSach);
        System.out.println("Số sách đã cho mượn: " + soMuon);
    }

    public int tinh_So_Sach_Con_Lai() {
        return tongSoSach - soMuon;
    }

    public boolean SoSachConLai() {
        return tinh_So_Sach_Con_Lai() > 0;
    }
}

public class b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sách: ");
        int n = scanner.nextInt();

        Sach[] danhSachSach = new Sach[n];

        for (int i = 0; i < n; i++) {
            danhSachSach[i] = new Sach();
            System.out.println("Nhập thông tin cho quyển sách thứ " + (i + 1) + ":");
            danhSachSach[i].nhap_thong_Tin();
        }

        System.out.println("\nThông tin các quyển sách trong thư viện:");
        for (Sach sach : danhSachSach) {
            int soSachConLai = sach.tinh_So_Sach_Con_Lai();
            if (soSachConLai > 0) {
                sach.in_Thong_Tin();
                System.out.println("Số sách còn lại: " + soSachConLai);
                System.out.println();
            } else {
                System.out.println("hết sách rồi !!!!!!");
            }
        }
        scanner.close();

    }
}