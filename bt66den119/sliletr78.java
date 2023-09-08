package bt66den119;

import java.util.Scanner;

public class sliletr78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập để kiểm tra thang đó :");
        int a = sc.nextInt();
        switch (a) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("có 31 ngày ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("có 30 ngày");
                break;
            case 2:
                System.out.println("có 28 hoặc 29 ngày");
                break;

            default:
                System.out.println("mơi ban nhap lại thang muon kiem tra ");
                break;

        }
        sc.close();
    }
}
