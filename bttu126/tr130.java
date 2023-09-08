package bttu126;

import java.util.Scanner;

public class tr130 {
    public static void main(String[] agrs) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao n :");
        n = sc.nextInt();
        int[] a = new int[n];
        nhap(a, n);
        sapxep(a, n);
        xuat(a, n);
        sc.close();
    }

    public static void nhap(int a[], int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi nhap vao mang :");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public static void xuat(int a[], int n) {

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
            System.out.println("\n");
        }
    }

    public static void sapxep(int a[], int n) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int tg = a[i];
                    a[i] = a[j];
                    a[j] = tg;
                }
            }
        }
    }

}
