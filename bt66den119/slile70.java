package bt66den119;

import java.util.Scanner;

public class slile70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so vao di nao :");
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println("căn bậc 2 của a la :" + Math.sqrt(a));
        } else {
            System.out.println("lỗi rồi");
        }
        sc.close();
    }
}
