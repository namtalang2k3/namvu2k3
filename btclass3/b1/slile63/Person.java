package btclass3.b1.slile63;

import java.util.Scanner;

public class Person {
    private String hoTen;
    private int tuoi;
    private double chieuCao;

    public Person(String hoTen, int tuoi, double chieuCao) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.chieuCao = chieuCao;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = scanner.nextInt();
        System.out.print("Nhập chiều cao (cm): ");
        chieuCao = scanner.nextDouble();
    }

    public void hienThiThongTin() {
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Chiều cao: " + chieuCao + " cm");
    }
}
