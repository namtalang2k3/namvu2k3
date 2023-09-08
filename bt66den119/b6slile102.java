// Viết chương trình nhập vào 2 số min và max từ bàn phím. Tính và
// xuất trung bình cộng các số chia hết cho 5 từ min đến max.
package bt66den119;

import java.util.Scanner;;

public class b6slile102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vào so mâx");
        int max = sc.nextInt();
        System.out.println("Nhap so Min");
        int min = sc.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = min; i <= max; i++) {
            if (i % 5 == 0) {
                sum += i;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("không có số nào chia hết cho 5");
        } else {
            double tbc = (double) sum / count;
            System.out.println("Trung bình cộng các số chia hết cho 5 từ " + min + " đến " + max + " là: " + tbc);
        }

        sc.close();
    }
}
