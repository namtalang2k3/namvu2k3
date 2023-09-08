package lab3;

import java.util.Scanner;

public class b2 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra : ");

        int aNumber = scanner.nextInt();
        if (aNumber > 0) {
            System.out.println("số bạn nhập lớn hơn 0");
        } else if (aNumber == 0) {
            System.out.println("so ban nhap la 0");
        } else {
            System.out.println("so ban nhap nho hon 0 ");
        }
        scanner.close();
    }
}
