package test1;

import java.util.Scanner;

public class b2tr58 {
    public static void main(String[] agrs) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[4];

        System.out.println("Hãy cho tôi biết ngày sinh của bạn là : ");
        array[0] = scanner.next();

        System.out.println("Hãy cho tôi biết tháng sinh của bạn là : ");
        array[1] = scanner.next();

        System.out.println("Hãy cho tôi biết năm sinh của bạn là : ");
        array[2] = scanner.next();

        System.out.println("Hãy cho tôi biết tên của bạn là : ");
        String name = scanner.next();

        System.out.println("Chào bạn " + name + " mình là AI");
        Thread.sleep(500);

        System.out.println(
                ("ngày " + array[0] + " " + "tháng " + " " + array[1] + "   năm " + " " + array[2]));
        Thread.sleep(50);
        scanner.close();
    }

}
