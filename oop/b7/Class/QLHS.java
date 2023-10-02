package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
    // thuoc tinh
    private ArrayList<HocSinh> dshs;

    // phuoong thuc
    // ham khoi tao
    public QLHS() {
        dshs = new ArrayList<HocSinh>(10);

    }

    // ham them hoc sinh
    public void themHS(HocSinh hs) {
        dshs.add(hs);
    }

    // ham nhap danh sach
    public void nhapdanhsachHS(Scanner sc) {
        HocSinh hs;
        System.out.println("nhap vao so luong hoc sinh: ");
        int n = sc.nextInt();

        System.out.println("nhap thong tin cho hoc sinh trong danh sach: ");
        for (int i = 0; i < n; i++) {
            System.out.println("\tHoc sinh thu " + (i + 1) + " la: ");
            hs = new HocSinh(null, null, null, null);
            hs.nhapthongtin(sc);

            themHS(hs);
        }
    }

    // ham hien thi
    public void hienthidanhsach() {
        int n = dshs.size();
        for (int i = 0; i < n; i++) {
            System.out.println("\tHoc sinh thu " + (i + 1) + " la: ");
            dshs.get(i).hiethithongtin();
        }
    }

    // ham tim kiem thong tin
    public void timkiemthongtin(int nam, String que) {
        for (HocSinh hs : dshs) {
            if ((hs.getNgaysinh().getYear() + 1990 == nam) && (que.equals(hs.getQuequan()))) {
                hs.hiethithongtin();
            }
        }
    }

    public void timkiemthongtin(String lop) {
        for (HocSinh hs : dshs) {
            if (lop.equals(hs.getlop())) {
                hs.hiethithongtin();
            }
        }
    }

}
