// Bài 1: Viết chương trình cho phép giải phương trình bậc
// nhất, trong đó các hệ số a và b nhập từ bàn phím.
package bt66den119;

import java.util.Scanner;

public class b1slile80 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vào a và b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("x = " + ((-b) / a));
        sc.close();
    }

}
