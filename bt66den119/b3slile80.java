// Bài 3: Viết chương trình nhập vào số điện sử dụng của
// tháng và tính tiền điện theo phương pháp lũy tiến
// • Nếu số điện sử dụng từ 0 đến 50 thì giá mỗi số điện là
// 1000
// • Nếu số điện sử dụng trên 50 thì giá mỗi số điện vượt hạn
// mức là 1200.
package bt66den119;

import java.util.Scanner;

public class b3slile80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số điện bạn dùng :");
        int a = sc.nextInt();
        if (a > 0 && a <= 50) {
            System.out.println("só tien ban phai tra la :" + a * 1000 + "VND");
        } else if (a > 50) {
            System.out.println("só tien ban phai tra la :" + ((a - 50) * 1200 + 50000) + "VND");
        } else {
            System.out.println("bạn đã nhập sai hay nhap lại");
        }
        ;
        sc.close();
    }
}
