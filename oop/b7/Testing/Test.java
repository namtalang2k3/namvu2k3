package Testing;

import java.util.Scanner;

import Class.QLHS;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLHS list = new QLHS();
        list.nhapdanhsachHS(sc);
        System.out.print("nhung hoc sinh sinh nam 1985 va que Thai Nguyen la: ");
        list.timkiemthongtin(1985, "Thai Nguyen");

        System.out.print("nhung hoc sinh lop 10A1 la: ");
        list.timkiemthongtin("10A1");
        sc.close();
    }
}
