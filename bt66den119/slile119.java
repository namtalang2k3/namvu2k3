package bt66den119;

import java.util.Scanner;

public class slile119 {
    public static void main(String[] args) {
        int n, tg;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao do dai cua mang :");
        n = sc.nextInt();
        // Khai báo và khởi tạo kích thước của mảng
        int a[] = new int[n];
        // nhap so phan tu cua mang
        System.out.print("nhap phan tu cua mang :");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        // in ra mang so ban dau
        System.out.println("mảng ban đầu :");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }

        // sắp xếp cac phan tu trog mang
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    tg = a[i];
                    a[i] = a[j];
                    a[j] = tg;
                }
            }

        }
        // in ra mảng soos sau khi được sắp xếp
        System.out.println("\nMang sap xep :");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
        sc.close();
    }
}
