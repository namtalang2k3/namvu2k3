package bktclass;

import java.util.Scanner;

public class sinhvien {
    private int masv;
    private String tensv;
    private float diemTL, diemTH;

    public sinhvien() {
    }

    public sinhvien(int masv, String tensv, float diemTL, float diemTH) {
        this.masv = masv;
        this.tensv = tensv;
        this.diemTL = diemTL;
        this.diemTH = diemTH;
    }

    public int getMaSV() {
        return masv;
    }

    public void setMasv(int masv) {
        this.masv = masv;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public float getDiemTL() {
        return diemTL;
    }

    public void setDiemTL(float diemTL) {
        this.diemTL = diemTL;
    }

    public float getDiemTH(float diemTH) {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float Diemtb() {
        return (diemTH + diemTL) / 2;
    }

    public String toString() {
        return masv + "-" + tensv + "diem tb : " + Diemtb();
    }

    public void insv() {
        System.out.printf("%6d %-18s %10.2f %12.2f %12.2f \n", masv, tensv, diemTH, diemTL, Diemtb());
    }

    public static void main(String[] args) {
        sinhvien sv1 = new sinhvien();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien 1: ");
        sv1.setMasv(sc.nextInt());
        sc.nextLine();
        System.out.println("nhap ten sinh vien 1: ");
        sv1.setTensv(sc.nextLine());
        System.out.println("Nhap diem ly thuyet: ");
        sv1.setDiemTL(sc.nextFloat());
        System.out.println("nhap diem thuc hanh: ");
        sv1.setDiemTH(sc.nextFloat());

        sinhvien sv2 = new sinhvien();

        System.out.println("Nhap ma sinh vien 2: ");
        sv2.setMasv(sc.nextInt());
        sc.nextLine();
        System.out.println("nhap ten sinh vien 2: ");
        sv2.setTensv(sc.nextLine());
        System.out.println("Nhap diem ly thuyet: ");
        sv2.setDiemTL(sc.nextFloat());
        System.out.println("nhap diem thuc hanh: ");
        sv2.setDiemTH(sc.nextFloat());

        sinhvien sv3 = new sinhvien();

        System.out.println("Nhap ma sinh vien 3: ");
        sv3.setMasv(sc.nextInt());
        sc.nextLine();
        System.out.println("nhap ten sinh vien 3: ");
        sv3.setTensv(sc.nextLine());
        System.out.println("Nhap diem ly thuyet: ");
        sv3.setDiemTL(sc.nextFloat());
        System.out.println("nhap diem thuc hanh: ");
        sv3.setDiemTH(sc.nextFloat());

        sv1.insv();
        sv2.insv();
        sv3.insv();
        System.out.println("----------------------------end----------------------------");
        sc.close();
    }
}
