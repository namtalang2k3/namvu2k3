// Xây dựng 1 lớp thí sinh gồm sbd,ht,toán,lý,hóa
// Và các PT
// 1. Nhập n thí sinh từ bàn phím
// 2. Tính tổng điểm theo từng thí sinh
// 3. Sắp xếp theo tổng điểm tăng dần
// 4. Tìm kiếm thí sinh có điểm cao nhất
// 5. Tra cứu thông tin theo sbd
package bktclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class slile44 {
    class ThiSinh {
        private String sbd;
        private String ht;
        private double toan;
        private double ly;
        private double hoa;

        public ThiSinh(String sbd, String ht, double toan, double ly, double hoa) {
            this.sbd = sbd;
            this.ht = ht;
            this.toan = toan;
            this.ly = ly;
            this.hoa = hoa;
        }

        public double tinhTongDiem() {
            return toan + ly + hoa;
        }

        public String getSbd() {
            return sbd;
        }

        public String getHt() {
            return ht;
        }

        @Override
        public String toString() {
            return "SBD: " + sbd + ", Họ tên: " + ht + ", Toán: " + toan + ", Lý: " + ly + ", Hóa: " + hoa;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Nhập số lượng thí sinh: ");
            int n = input.nextInt();
            input.nextLine(); // Đọc dòng trống

            ArrayList<ThiSinh> dsThiSinh = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                System.out.print("Nhập SBD: ");
                String sbd = input.nextLine();
                System.out.print("Nhập Họ tên: ");
                String ht = input.nextLine();
                System.out.print("Nhập điểm môn Toán: ");
                double toan = input.nextDouble();
                System.out.print("Nhập điểm môn Lý: ");
                double ly = input.nextDouble();
                System.out.print("Nhập điểm môn Hóa: ");
                double hoa = input.nextDouble();

                slile44 outerClass = new slile44();
                ThiSinh thiSinh = outerClass.new ThiSinh(sbd, ht, toan, ly, hoa);
                dsThiSinh.add(thiSinh);

                input.nextLine(); // Đọc dòng trống
            }

            // Tính tổng điểm theo từng thí sinh
            for (ThiSinh thiSinh : dsThiSinh) {
                System.out.println(thiSinh.getHt() + ": Tổng điểm = " + thiSinh.tinhTongDiem());
            }

            // Sắp xếp thí sinh theo tổng điểm tăng dần
            Collections.sort(dsThiSinh, Comparator.comparingDouble(ThiSinh::tinhTongDiem));
            System.out.println("\nDanh sách thí sinh sau khi sắp xếp:");
            for (ThiSinh thiSinh : dsThiSinh) {
                System.out.println(thiSinh);
            }

            // Tìm thí sinh có điểm cao nhất
            ThiSinh thiSinhCaoNhat = Collections.max(dsThiSinh, Comparator.comparingDouble(ThiSinh::tinhTongDiem));
            System.out.println("\nThí sinh có điểm cao nhất: " + thiSinhCaoNhat.getHt() + " (Tổng điểm = "
                    + thiSinhCaoNhat.tinhTongDiem() + ")");

            // Tra cứu thông tin thí sinh theo SBD
            System.out.print("\nNhập SBD cần tra cứu: ");
            String sbdTimKiem = input.nextLine();
            boolean found = false;
            for (ThiSinh thiSinh : dsThiSinh) {
                if (thiSinh.getSbd().equals(sbdTimKiem)) {
                    System.out.println("Thông tin thí sinh có SBD " + sbdTimKiem + ": " + thiSinh);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Không tìm thấy thí sinh có SBD " + sbdTimKiem);
            }

            input.close();
        }
    }
}
