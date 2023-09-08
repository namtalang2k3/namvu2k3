package bt66den119;

import java.util.Scanner;

public class sliletr74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập để kiểm tra thang đó :");
        int a = sc.nextInt();
        if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12) {
            System.out.println("tháng " + a + " có 31 ngày");
        } else {
            if (a == 4 || a == 6 || a == 9 || a == 11) {
                System.out.println("tháng " + a + " có 30 ngày");
            } else {
                System.out.println("có 28 hoặc 29 ngày ");
            }
        }
        sc.close();
    }
}
