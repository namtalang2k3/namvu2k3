package lab3;

import java.util.Scanner;

public class b3 {
    public static void main(String[] agrs) {
        int a;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("nhập số bạn muốn biết");
            a = scanner.nextInt();
            if (a < 0) {
                System.out.println("số nhập không hợp lệ , vui lòng nhập lại :");

            } else if (a >= 10) {
                System.out.println("số nhập không hợp lệ , vui lòng nhập lại :");
            } else {
                break;
            }
            ;
        }

        switch (a) {

            case 0:
                System.out.println("Không");
                break;
            case 1:
                System.out.println("một");
                break;
            case 2:
                System.out.println("hai");
                break;
            case 3:
                System.out.println("ba");
                break;
            case 4:
                System.out.println("bốn");
                break;
            case 5:
                System.out.println("năm");
                break;
            case 6:
                System.out.println("sáu");
                break;
            case 7:
                System.out.println("bảy");
                break;
            case 8:
                System.out.println("tám");
                break;
            case 9:
                System.out.println("chín");
                break;
            default:
                System.out.println("số ko hợp lệ ");
                break;
        }
        scanner.close();
    }
}
