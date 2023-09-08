// Bài 4: Viết chương trình cho phép người dùng nhập vào 2 số
// nguyên a và b và một trong các phép toán gồm +, -, *, / (Chia lấy
// phần nguyên), % (chia lấy phần dư). Sau đó hiển thị kết quả tương
// ứng.
package bt66den119;

import java.util.Scanner;

public class b4slile80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vào a ");
        int a = sc.nextInt();
        System.out.println("nhap vào b ");
        int b = sc.nextInt();
        System.out.println("nhap vào phep tinh ban muon biet ");
        System.out.println("1.cộng");
        System.out.println("2.trừ");
        System.out.println("3.nhân");
        System.out.println("4.chia lấy phần nguyên");
        System.out.println("5.chia lấy phần dư");
        int pheptinh = sc.nextInt();

        switch (pheptinh) {
            case 1:
                System.out.println("Ket qua là :" + (a + b));
                break;
            case 2:
                System.out.println("Ket qua là :" + (a - b));
                break;
            case 3:
                System.out.println("Ket qua là :" + (a * b));
                break;
            case 4:
                System.out.println("Ket qua là :" + (a / b));
                break;
            case 5:
                System.out.println("Ket qua là :" + (a % b));
                break;
            default:
                System.out.println("Phép toán không hợp lệ.");
                sc.close();
                return;
        }

        sc.close();
    }
}
