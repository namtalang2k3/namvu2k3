
package test1;

import java.util.Scanner;

public class b3tr58 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap gia tri cua a : ");
        int a = scanner.nextInt();

        System.out.println("nhap gia tri cua b : ");
        int b = scanner.nextInt();

        int x = ((-b) / a);
        System.out.println("giá trị của x là : " + x);
        scanner.close();
    }
}
