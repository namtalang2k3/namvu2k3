package bttu126;

import java.util.Scanner;

public class tr126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhâp ha so a và b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        tong2so(a, b);
        sc.close();
    }

    public static void tong2so(int a, int b) {
        int tong = a + b;
        System.out.println("Tong 2 so : " + tong);
    }

}
