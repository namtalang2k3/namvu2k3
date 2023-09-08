package bttrang;

import java.util.Scanner;

public class b5 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập tên sản phẩm :");
        String name = scanner.nextLine();

        System.out.println("Mời bạn nhập đơn giá :");
        int dongia = scanner.nextInt();

        System.out.println("mời bạn nhập số lượng :");
        int soluong = scanner.nextInt();

        double thue = 0.1 * dongia;

        System.out.println("Số lượng bạn muốn là :" + name);
        System.out.println("Đơn giá bạn muốn là :" + dongia);
        System.out.println("Số lượng bạn muốn là :" + soluong);
        System.out.println("Số lượng bạn muốn là :" + thue);

        scanner.close();
    }
}
