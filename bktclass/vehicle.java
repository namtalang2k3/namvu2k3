package bktclass;

import java.util.Scanner;

public class vehicle {
    private int maxe, dungtich;
    private double trigia;
    private String chuxe, mota;

    public vehicle(int maxe, int dungtich, double trigia, String chuxe, String mota) {
        this.maxe = maxe;
        this.trigia = trigia;
        this.dungtich = dungtich;
        this.chuxe = chuxe;
        this.mota = mota;
    }

    public vehicle() {

    }

    public int getMaxe() {
        return maxe;
    }

    public void setMaxe(int maxe) {
        this.maxe = maxe;
    }

    public int getDungtich() {
        return dungtich;
    }

    public void setDungtich(int dungtich) {
        this.dungtich = dungtich;
    }

    public double getTrigia() {
        return trigia;
    }

    public void setTrigia(double trigia) {
        this.trigia = trigia;
    }

    public String getChuxe() {
        return chuxe;
    }

    public void setChuxe(String chuxe) {
        this.chuxe = chuxe;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public double tinhthue() {
        double thue;
        if (dungtich < 100)
            thue = trigia * 0.01;
        else if (dungtich >= 100 && dungtich <= 200)
            thue = trigia * 0.03;
        else
            thue = trigia * 0.05;
        return thue;
    }

    public String toStrign() {
        return maxe + "-" + chuxe + "-" + dungtich + "-"
                + trigia + "-" + mota;
    }

    void inthue() {
        System.out.printf("%5d %-20s %5d 10%.2f %10s %8.5f \n", maxe, chuxe, dungtich, chuxe, mota, tinhthue());
    }

    static void nhapxe(vehicle xe) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" nhap ma xe: ");
        xe.setMaxe(sc.nextInt());
        sc.nextLine();
        System.out.println("nhap ten chu xe: ");
        xe.setChuxe(sc.nextLine());
        System.out.println("nhap dung tich xe");
        xe.setDungtich(sc.nextInt());
        System.out.println("nhap tri gia xe");
        xe.setTrigia(sc.nextDouble());
        sc.nextLine();
        System.out.println("mo ta: ");
        xe.setMota(sc.nextLine());

    }

    public static void main(String[] args) {
        vehicle v[] = null;
        int a, n = 0;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("ban chon lam gi: ");
            System.out.println("1.tao cac doi tuong xe va nhap thong tin \n"
                    + "2.xuat bang ke khai tien thue cua cac xe \n" + "nhap so khac de thoat");
            a = sc.nextInt();

            switch (a) {
                case 1:
                    System.out.println("nhap so luong xe ban muon khai bao thue: ");
                    n = sc.nextInt();
                    sc.nextLine();
                    v = new vehicle[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("xe thu " + (i + 1));
                        v[i] = new vehicle();
                        nhapxe(v[i]);
                    }
                    break;

                case 2:
                    System.out.printf(" %5s %5s %5s %10s %10s %8s \n", "ma xe", "chu xe", "dung tich", "tri gia ",
                            "mo ta ", "thue");
                    System.out.println("-------------------------------------------------------------------------");
                    for (int i = 0; i < n; i++) {
                        v[i].inthue();
                    }
                    break;
                default:
                    System.out.println("bye");
                    flag = false;
                    break;
            }
        } while (flag);
        sc.close();
    }
}
