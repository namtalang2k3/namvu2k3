package btslile43;

import java.util.Scanner;

public class b2 {
    public static class PhanSo {
        private float tuSo;
        private float mauSo;

        public PhanSo(float tuSo, float mauSo) {
            this.tuSo = tuSo;
            this.mauSo = mauSo;
        }

        public float getTuSo() {
            return tuSo;
        }

        public float getMauSo() {
            return mauSo;
        }

        public PhanSo cong(PhanSo other) {
            float newTuSo = this.tuSo * other.mauSo + other.tuSo * this.mauSo;
            float newMauSo = this.mauSo * other.mauSo;
            return new PhanSo(newTuSo, newMauSo);
        }

        public PhanSo tru(PhanSo other) {
            float newTuSo = this.tuSo * other.mauSo - other.tuSo * this.mauSo;
            float newMauSo = this.mauSo * other.mauSo;
            return new PhanSo(newTuSo, newMauSo);
        }

        public PhanSo nhan(PhanSo other) {
            float newTuSo = this.tuSo * other.tuSo;
            float newMauSo = this.mauSo * other.mauSo;
            return new PhanSo(newTuSo, newMauSo);
        }

        public PhanSo chia(PhanSo other) {
            if (other.tuSo == 0) {
                throw new ArithmeticException("Phân số mẫu không thể bằng 0");
            }
            float newTuSo = this.tuSo * other.mauSo;
            float newMauSo = this.mauSo * other.tuSo;
            return new PhanSo(newTuSo, newMauSo);
        }

        public void hienThi() {
            System.out.println(tuSo + "/" + mauSo);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tử số của phân số thứ 1: ");
        float tuSo1 = sc.nextFloat();

        System.out.println("Nhập mẫu số của phân số thứ 1: ");
        float mauSo1 = sc.nextFloat();

        System.out.println("Nhập tử số của phân số thứ 2: ");
        float tuSo2 = sc.nextFloat();

        System.out.println("Nhập mẫu số của phân số thứ 2: ");
        float mauSo2 = sc.nextFloat();

        PhanSo ps1 = new PhanSo(tuSo1, mauSo1);
        PhanSo ps2 = new PhanSo(tuSo2, mauSo2);

        PhanSo tong = ps1.cong(ps2);
        System.out.print("Tổng của hai phân số: ");
        tong.hienThi();

        PhanSo hieu = ps1.tru(ps2);
        System.out.print("Hiệu của hai phân số: ");
        hieu.hienThi();

        PhanSo tich = ps1.nhan(ps2);
        System.out.print("Tích của hai phân số: ");
        tich.hienThi();

        try {
            PhanSo thuong = ps1.chia(ps2);
            System.out.print("Thương của hai phân số: ");
            thuong.hienThi();
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
        sc.close();
    }
}
