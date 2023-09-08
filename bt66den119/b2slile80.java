// Bài 2: Viết chương trình cho phép giải phương trình bậc hai
// trong đó các hệ số a, b và c nhập từ bàn phím.
package bt66den119;

import java.util.Scanner;

public class b2slile80 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vào a và b và c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double denta = b * b - 4 * a * c;
        if (denta > 0) {
            double x1 = (-b + Math.sqrt(denta)) / (2 * a);
            double x2 = (-b - Math.sqrt(denta)) / (2 * a);
            System.out.println("Phường trình co 2 nghiệm là :");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (denta == 0) {
            System.out.println("Phường trình co  nghiệm duy nhat là :");
            System.out.println("x1 = " + -b / 2 * a);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
        sc.close();
    }
}
