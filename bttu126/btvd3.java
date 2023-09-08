package bttu126;

import java.util.Scanner;
import java.util.Arrays;

public class btvd3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] mang = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            mang[i] = sc.nextInt();
        }

        System.out.print("Nhập số nguyên k: ");
        int k = sc.nextInt();

        Arrays.sort(mang);
        System.out.println("Mảng sau khi sắp xếp:");
        for (int i : mang) {
            System.out.print(i + " ");
        }
        System.out.println();

        int viTri = timViTriPhanTu(mang, k);
        if (viTri != -1) {
            System.out.println("Phần tử đầu tiên có giá trị " + k + " tại vị trí " + (viTri + 1));
        } else {
            System.out.println("Trong mảng không có phần tử nào chứa giá trị cần tìm.");
        }

        sc.close();
    }

    public static int timViTriPhanTu(int[] mang, int k) {
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] == k) {
                return i;
            }
        }
        return -1;
    }
}
