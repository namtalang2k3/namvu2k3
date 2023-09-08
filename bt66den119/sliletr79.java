package bt66den119;

import java.util.Scanner;

public class sliletr79 {
    public static void main(String[] args) {
        int x, a = 0, b = 0, c, d, e, f;

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.nhap vao lua chon cua ban : ");
            System.out.println("2.tinh tong : ");
            System.out.println("3.tinh hieu : ");
            System.out.println("4.tinh tich : ");
            System.out.println("5.tinh thuong : ");
            System.out.println("0.thoat ");
            x = sc.nextInt();

            switch (x) {
                case 1:
                    System.out.println("nhap a : ");
                    a = sc.nextInt();
                    System.out.println("nhap b : ");
                    b = sc.nextInt();
                    continue;
                case 2:
                    c = a + b;
                    System.out.println("tong cua a va b la : " + c);
                    continue;
                case 3:
                    d = a - b;
                    System.out.println("hieu cua a va b la : " + d);
                    continue;
                case 4:
                    e = a * b;
                    System.out.println("tich cua a va b la : " + e);
                    continue;
                case 5:
                    f = a / b;
                    System.out.println("thuong cua a va b la : " + f);
                    continue;
                case 0:
                    System.exit(a);
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("moi nhap lai");
                    break;

            }
            sc.close();
        }
    }
}
